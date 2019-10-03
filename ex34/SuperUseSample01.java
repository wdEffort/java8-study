package com.ezen.example;

/**
 * 슈퍼 클래스와 같은 이름의 멤버(필드, 메소드) 사용하기
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * 서브 클래스 안에서 메소드 이름 앞에 'super.'을 붙이고 호출하면
 * 슈퍼 클래스의 메소드를 호출할 수 있습니다.
 * 
 * 슈퍼 클래스와 서브 클래스에 같은 이름의 필드가 있는 경우
 * 슈퍼 클래스의 필드에 접근하려면 변수 이름 앞에 'super.'을 붙이면 됩니다.
 */
class Car01 {
	protected int num;
	protected double gas;
	int x; // 슈퍼 클래스에 x가 있습니다.
	
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
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
	}
	
}

class RacingCar01 extends Car01 {
	private int course;
	int x; // 서브 클래스에도 x가 있습니다.
	
	public RacingCar01() {
		this.course = 0;
		System.out.println("레이싱카가 만들어졌습니다.");
	}
	
	public void setCourse(int course) {
		this.course = course;
		System.out.println("코스 번호를 " + course + "로 했습니다.");
	}
	
	public void show() {
		x = 10;
		super.x = 20; // 슈퍼 클래스의 필드입니다.
		super.show(); // 슈퍼 클래스의 show() 메소드가 호출됩니다.
		System.out.println("코스 번호는 " + course + "입니다.");
	}

}

class SuperUseSample01 {

	public static void main(String[] args) {
		RacingCar01 rc = new RacingCar01();
		rc.setCar(1234, 20.5);
		rc.setCourse(3);
		rc.show();
		

	}

}
