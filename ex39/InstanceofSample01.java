package com.ezen.example;

/**
 * instanceof 연산자
 * 
 * @author yoman
 * 
 * 2019. 10. 06
 *
 * 객체의 클래스를 알아내기 위한 
 * instanceof 연산자에 대해 학습합니다.
 * 
 * 특정 클래스의 객체에만 별도의 처리를 해야하는 경우,
 * 이 연산자를 사용하면 편리합니다.
 * 
 * [사용법]
 * 객체를 가리키는 변수명 instanceof 클래스명
 */
abstract class Vehicle {
	protected int speed;
	
	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("속도를 " + speed + "로 변경했습니다.");
	}
	
	// 추상 메소드에는 몸체(실행 구문)가 없습니다.
	abstract void show();
}

// 자동차 클래스를 선언합니다.
class Car extends Vehicle {
	private int num;
	private double gas;
	
	public Car(int num, double gas) {
		this.num = num;
		this.gas = gas;
		System.out.println("자량 번호 " + num + ", 연료 양 " + gas + "인 자동차가 만들어졌습니다.");
	}
	
	// 추상 클래스 Vehicle02의 추상 메소드를 구현합니다.
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다.");
		System.out.println("속도는 " + speed + "입니다.");
	}
}

// 비행기 클래스를 선언합니다.
class Plane extends Vehicle {
	private int flight;
	
	public Plane(int flight) {
		this.flight = flight;
		System.out.println("비행기 번호가 " + flight + "인 비행기가 만들어졌습니다.");
	}
	
	// 추상 클래스 Vehicle02의 추상 메소드를 구현합니다.
	public void show() {
		System.out.println("비행기 번호는 " + flight + "입니다.");
		System.out.println("속도는 " + speed + "입니다.");
	}
}

class InstanceofSample01 {

	public static void main(String[] args) {
		Vehicle[] vc = new Vehicle[2];
		
		vc[0] = new Car(1234, 20.5);
		vc[0].setSpeed(60);
		
		vc[1] = new Plane(232);
		vc[1].setSpeed(500);
		
		for(int i = 0; i < vc.length; i++) {
			// 객체가 Car 클래스인지 여부를 확인합니다.
			if(vc[i] instanceof Car) {
				System.out.println((i + 1) + "번째 객체는 Car 클래스입니다.");
			} else {
				System.out.println((i + 1) + "번째 객체는 Car 클래스가 아닙니다.");
			}
		}
		
	}

}
