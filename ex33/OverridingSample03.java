package com.ezen.example;

/**
 * 메소드 오버라이딩(Overriding)
 * 오버라이딩의 중요성
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * 코드 안에서 다양한 클래스의 객체를 관리해야 하는 경우가 있습니다.
 * 이러한 경우 '슈퍼 클래스의 배열'을 준비하고 객체를 다룰 수 있습니다.
 * 
 * 즉, 슈퍼 클래스 배열 변수에 슈퍼 클래스 객체와 서브 클래스 객체를 함꼐 다룰 수 있습니다.
 * 
 * 슈퍼 클래스, 서브 클래스에 동일하게 정의된 메소드를 호출하는 경우
 * 배열에 담긴 각 객체 '고유의 메소드'가 호출됩니다.(=> 다형성[Polymorphism])
 * 
 * [참고]
 * Overloading : 메소드 이름이 같지만 인수의 형과 개수가 다른 메소드를 정의하는 것 
 * Overriding : 메소드 이름, 인수의 형과 개수까지 동일하게 정의하는 것
 */
class Car03 {
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
		System.out.println("레이싱카의 차량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
		System.out.println("코스 번호는 " + course + "입니다.");
	}

}

class OverridingSample03 {

	public static void main(String[] args) {
		// 슈퍼 클래스의 배열을 준비합니다.
		Car03[] cars = new Car03[2];
		
		// 슈퍼 클래스 객체를 생성합니다.
		cars[0] = new Car03();
		cars[0].setCar(1234, 20.5);
		
		// 서브 클래스 객체를 생성합니다.
		cars[1] = new RacingCar03();
		cars[1].setCar(4567, 30.5);
		
		System.out.println();
		
		for (int i = 0; i < cars.length; i++) {
			// 객체가 Car03 클래스 객체인 경우 슈퍼 클래스의 show() 메소드가 호출되고
			// 객체가 RacingCar03 클래스 객체인 경우 서브 클래스의 show() 메소드가 호출됩니다.
			cars[i].show();
			System.out.println();
		}
		
	}

}
