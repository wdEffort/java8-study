package com.ezen.example;

/**
 * 메소드 오버라이딩(Overriding)
 * 오버라이딩의 개념
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * Java에서는 상속 관계가 있는 클래스 중 
 * 서브 클래스에서 슈퍼 클래스와 완전히 '동일한 메소드'를 선언하고
 * 슈퍼 클래스의 메소드를 대신하는 기능이 있습니다.
 * 이러한 기능을 메소드 오버라이딩이라고 합니다.
 * => 동일한 메소드명, 리턴 값의 형, 인수의 개수
 * 
 * 이렇게 슈퍼 클래스와 서브 클래스에 모두 정의되어 있는 메소드를 호출한 경우
 * 서브 클래스에서 새롭게 정의한 메소드가 호출됩니다.
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
	
	public void show() {
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
	
	public void show() {
		System.out.println("레이싱카의 차량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
		System.out.println("코스 번호는 " + course + "입니다.");
	}

}

class OverridingSample01 {

	public static void main(String[] args) {
		RacingCar01 rc = new RacingCar01();
		rc.setCar(1234, 20.5);
		rc.setCourse(5);
		rc.show(); // 서브 클래스의 show() 메소드가 호출됩니다.

	}

}
