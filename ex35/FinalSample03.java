package com.ezen.example;

/**
 * final 사용하기
 * 클래스에 사용하기
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * 만약, 서브 클래스 자체를 만들 수 없는 클래스를 설계해야 하는 경우
 * 클래스 앞 부분에 'final' 키워드를 붙이면 더이상 서브 클래스를 
 * 만들 수 없는 상태가 됩니다.
 */
final class Car03 {
	protected int num;
	protected double gas;
	
	public Car03() {
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

/* 더 이상 서브 클래스를 만들 수 없습니다.
class RacingCar03 extends Car03 {
	private int course;
	
	public RacingCar03() {
		this.course = 0;
		System.out.println("레이싱카가 만들어졌습니다.");
	}
	
	public void setCourse(int course) {
		this.course = course;
		System.out.println("코스 번호를 " + course + "로 했습니다.");
	}
	
	public void show() {
		System.out.println("코스 번호는 " + course + "입니다.");
	}

}
*/

class FinalSample03 {

	public static void main(String[] args) {
		

	}

}
