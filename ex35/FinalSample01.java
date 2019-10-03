package com.ezen.example;

/**
 * final 사용하기
 * 메소드에 사용하기
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * final의 의미 : '더 이상 수정할 수 없음'
 * 
 * 슈퍼 클래스의 메소드 중에서는 서브 클래스에서
 * 결코 오버라이딩되면 안되는 메소드가 있을 수 있습니다.
 * 
 * 이런 경우, 슈퍼 클래스의 메소드 앞에 'final'을 붙이면
 * 오버라이딩되지 않도록 막을 수 있습니다.
 */
class Car01 {
	protected int num;
	protected double gas;
	
	public Car01() {
		this.num = 0;
		this.gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar(int num, double gas) {
		this.num = num;
		this.gas = gas;
		System.out.println("차량 번호를 " + num + "으로, 연료의 양을 " + gas + "로 바꾸었습니다.");
	}
	
	// 슈퍼 클래스의 메소드에 'final' 키워드를 추가합니다.
	// 이 메소드는 더이상 오버라이딩할 수 없습니다.
	public final void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
	}
	
}

class RacingCar01 extends Car01 {
	private int course;
	
	public RacingCar01() {
		this.course = 0;
		System.out.println("레이싱카가 만들어졌습니다.");
	}
	
	public void setCourse(int course) {
		this.course = course;
		System.out.println("코스 번호를 " + course + "로 했습니다.");
	}
	
	/* 서브 클래스에서 show() 메소드를 오버라이딩할 수 없습니다.
	public void show() {
		System.out.println("코스 번호는 " + course + "입니다.");
	}
	*/

}

class FinalSample01 {

	public static void main(String[] args) {
		
		
	}

}
