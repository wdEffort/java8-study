package com.ezen.example;

/**
 * 상속(Inheritance)
 * 서브 클래스 안에서 접근하기 - 02
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * 서브 클래스에서 슈퍼 클래스의 private 멤버에 접근하기 위해서는 
 * 접근 제한자를 변경해주어야합니다.
 * 
 * 'protected'라는 제한자를 사용하면 서브 클래스에서 접근이 가능합니다.
 * 
 * protected : 서브 클래스를 포함하여 '동일한 패키지'에 속하는 클래스에서 접근 가능
 */
class Car04 {
	// 접근 제한자를 'protected'로 변경했습니다.
	protected int num;
	protected double gas;
	
	public Car04() {
		this.num = 0;
		this.gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public Car04(int num, double gas) {
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

class RacingCar04 extends Car04 {
	private int course;
	
	public RacingCar04() {
		this.course = 0;
		System.out.println("레이싱카가 만들어졌습니다.");
	}
	
	public RacingCar04(int num, double gas, int course) {
		super(num, gas);
		this.course = course;
		System.out.println("코스 번호가 " + course + "인 레이싱카가 만들어졌습니다.");
	}
	
	public void setCourse(int course) {
		this.course = course;
		System.out.println("코스 번호를 " + course + "로 했습니다.");
	}
	
	public void newShow() {
		// 서브 클래스에서는 슈퍼 클래스 protected 멤버에 접근이 가능합니다.
		System.out.println("레이싱카 차량 번호는 " + num + "입니다.");
		System.out.println("레이싱카 연료의 양은 " + gas + "입니다.");
		System.out.println("레이싱카 코스 번호는 " + course + "입니다.");
	}

}

class ExtendsSample04 {

	public static void main(String[] args) {
		RacingCar04 rc = new RacingCar04();
		rc.newShow();

	}

}
