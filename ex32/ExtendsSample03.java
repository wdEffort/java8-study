package com.ezen.example;

/**
 * 상속(Inheritance)
 * 서브 클래스 안에서 접근하기 - 01
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * 접근 제한자 private, public을 사용하여 멤버에 대한 접근을 제어하는 방법을 배웠습니다.
 * 부모 클래스의 멤버가 private으로 선언되어 있는 경우 상속자인 서브 클래스조차 접근할 수 없습니다.
 * 
 * private : 그 클래스 내부에서만 사용 가능, 외부에서 사용 불가
 */
class Car03 {
	private int num;
	private double gas;
	
	public Car03() {
		this.num = 0;
		this.gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public Car03(int num, double gas) {
		this.num = num;
		this.gas = gas;
		System.out.println("차량 번호가 " + num + "이며, 연료의 양이 " + gas + "인 자동차가 만들어졌습니다.");
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

class RacingCar03 extends Car03 {
	private int course;
	
	public RacingCar03() {
		this.course = 0;
		System.out.println("레이싱카가 만들어졌습니다.");
	}
	
	public RacingCar03(int num, double gas, int course) {
		super(num, gas);
		this.course = course;
		System.out.println("코스 번호가 " + course + "인 레이싱카가 만들어졌습니다.");
	}
	
	public void setCourse(int course) {
		this.course = course;
		System.out.println("코스 번호를 " + course + "로 했습니다.");
	}
	
	public void newShow() {
		// 이러한 표현은 잘못되었습니다.
		// System.out.println("레이싱카 차량 번호는 " + num + "입니다.");
		// System.out.println("레이싱카 연료의 양은 " + gas + "입니다.");
		System.out.println("레이싱카 코스 번호는 " + course + "입니다.");
	}

}

class ExtendsSample03 {

	public static void main(String[] args) {
		

	}

}
