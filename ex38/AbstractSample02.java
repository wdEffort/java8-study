package com.ezen.example;

/**
 * 추상 클래스(Abstract class)
 * 추상 클래스 사용하기
 * 
 * @author yoman
 * 
 * 2019. 10. 06
 *
 * 추상 클래스로는 객체를 생성할 수 없습니다.
 * 그러나 추상 클래스를 상속받은 서브 클래스는 객체를 생성할 수 있습니다.
 * 단, 조건이 있습니다.
 * 
 * [조건]
 * 1. 추상 메소드를 서브 클래스에서 반드시 오버라이딩해서 구현해야 함
 */
abstract class Vehicle02 {
	protected int speed;
	
	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("속도를 " + speed + "로 변경했습니다.");
	}
	
	// 추상 메소드에는 몸체(실행 구문)가 없습니다.
	abstract void show();
}

// 자동차 클래스를 선언합니다.
class Car02 extends Vehicle02 {
	private int num;
	private double gas;
	
	public Car02(int num, double gas) {
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
class Plane02 extends Vehicle02 {
	private int flight;
	
	public Plane02(int flight) {
		this.flight = flight;
		System.out.println("비행기 번호가 " + flight + "인 비행기가 만들어졌습니다.");
	}
	
	// 추상 클래스 Vehicle02의 추상 메소드를 구현합니다.
	public void show() {
		System.out.println("비행기 번호는 " + flight + "입니다.");
		System.out.println("속도는 " + speed + "입니다.");
	}
}

class AbstractSample02 {

	public static void main(String[] args) {
		// 추상 클래스 배열을 준비합니다.
		// 추상 클래스로 객체를 만들 수는 없지만, 
		// 그 클래스의 변수나 배열에 서브 클래스의 객체를 담을 수 있습니다.
		Vehicle02[] vc;
		vc = new Vehicle02[2];
		
		vc[0] = new Car02(1234, 20.5); // Car02 클래스 객체를 생성합니다.
		vc[0].setSpeed(60);
		
		vc[1] = new Plane02(232); // Plane02 클래스 객체를 생성합니다.
		vc[1].setSpeed(500);
		
		System.out.println();
		
		for(int i = 0; i < vc.length; i++) {
			vc[i].show(); // 각 객체에 연결된 show() 메소드가 호출됩니다.
			System.out.println();
		}

	}

}
