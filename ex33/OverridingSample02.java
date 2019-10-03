package com.ezen.example;

/**
 * 메소드 오버라이딩(Overriding)
 * 슈퍼 클래스의 변수로 객체 다루기
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 *
 * 서브 클래스의 객체는 슈퍼 클래스의 객체로 다룰 수 있습니다.
 * 이는, 서브 클래스의 객체가 슈퍼 클래스의 객체이기도 하기 때문입니다.
 * 
 * 슈퍼 클래스의 변수가 서브 클래스의 객체를 가리키게 선언한 후
 * 슈퍼 클래스, 서브 클래스의 동일한 메소드를 호출하는 경우
 * 서브 클래스의 오버라이딩된 메소드가 호출됩니다.
 * 
 * 단, 슈퍼 클래스의 변수로 서브 클래스를 다루게 되면
 * 서브 클래스에서 새롭게 정의한 메소드는 호출할 수 없습니다.
 */
class Car02 {
	protected int num;
	protected double gas;
	
	public Car02() {
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

class RacingCar02 extends Car02 {
	private int course;
	
	public RacingCar02() {
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

class OverridingSample02 {

	public static void main(String[] args) {
		Car02 c; // 슈퍼 클래스의 변수를 선언합니다.
		c = new RacingCar02(); // 서브 클래스의 객체를 생성하여 슈퍼 클래스의 변수가 가리키게 합니다.
		
		c.setCar(5678, 28.5);
		
		// c.setCourse(5); // 슈퍼 클래스의 변수로 서브 클래스를 다루는 경우 서브 클래스에 있는 메소드는 호출할 수 없습니다.
		
		c.show(); // 서브 클래스의 show() 메소드를 호출합니다.
		

	}

}
