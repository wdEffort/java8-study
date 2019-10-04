package com.ezen.example;

/**
 * Object Class
 * 
 * @author yoman
 * 
 * 2019. 10. 04
 * 
 * Object 클래스의 getClass() 메소드
 * => 객체가 속한 클래스의 정보를 반환합니다.(Class)
 */

class Car03 {
	protected int num;
	protected double gas;
	
	public Car03() {
		this.num = 0;
		this.gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
}

class RacingCar03 extends Car03 {
	private int course;
	
	public RacingCar03() {
		this.course = 0;
		System.out.println("레이싱카가 만들어졌습니다.");
	}
}

class ObjectSample03 {

	public static void main(String[] args) {
		Car03[] cars = new Car03[2];
		
		cars[0] = new Car03();
		cars[1] = new RacingCar03();
		
		for (int i = 0; i < cars.length; i++) {
			// getClass() 메소드를 사용하여
			// 그 객체가 속한 '클래스에 대한 요약정보'를 가지고 있는
			// Class 객체를 반환합니다.
			Class c = cars[i].getClass(); 
			System.out.println((i + 1) + "번째 객체의 클래스는 " + c + "입니다.");
		}

	}

}
