package com.ezen.example;

/**
 * 인터페이스 확장하기
 * 
 * @author yoman
 * 
 * 2019. 10. 06
 *
 * 인터페이스는 클래스와 마찬가지로 'extends' 키워드를 사용하여
 * 확장해서 새로운 인터페이스를 선언할 수 있습니다.
 * 
 * 확장되는 인터페이스를 슈퍼 인터페이스(Super Interface)
 * 확장하는 인터페이스를 서브 인터페이스(Sub Interface)라고 합니다.
 * 
 * 단, 서브 인터페이스를 구현하는 경우에는
 * 슈퍼 인터페이스 메소드 또한 구현해야 합니다.
 */
interface iMovable {
	void move();
}

interface iVehicle extends iMovable {
	void show();
}

class Car implements iVehicle {
	private int num;
	private double gas;
	
	public Car(int num, double gas) {
		this.num = num;
		this.gas = gas;
	}
	
	// iVehicle(서브 인터페이스) 인터페이스의 메소드를 구현합니다.
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
	}
	
	// iMovable(슈퍼 인터페이스) 인터페이스의 메소드를 구현합니다.
	public void move() {
		System.out.println("자동차가 움직입니다.");
	}
}

class InterfaceExtendsSample01 {

	public static void main(String[] args) {
		Car c = new Car(1234, 20.5);
		c.show();
		c.move();

	}

}
