package com.ezen.example;

/**
 * 다중 상속(Multiple Inheritance)
 * 
 * @author yoman
 * 
 * 2019. 10. 06
 *
 * 프로그램을 만들다 보면 두 개 이상의 클래스를 상속받은
 * 서브 클래스를 사용하고 싶은 경우가 있습니다.
 * 이러한 상속을 다중 상속이라 부릅니다.
 * 
 * Java에서는 하나 이상의 클래스를 상속받을 수 없습니다.
 * 하지만 인터페이스를 사용하면 다중 상속 메커니즘을 구현할 수 있습니다.
 * 
 * [인터페이스를 2개 이상 구현하기]
 * class 클래스명 implements 인터페이스명1, 인터페이스명2 { ... }
 */
interface iVehicle {
	void vShow();
}

interface iMaterial {
	void mShow();
}

class Car implements iVehicle, iMaterial {
	private int num;
	private double gas;
	
	public Car(int num, double gas) {
		this.num = num;
		this.gas = gas;
	}
	
	// iVehicle 인터페이스의 메소드를 구현합니다.
	public void vShow() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
	}
	
	// iMaterial 인터페이스의 메소드를 구현합니다.
	public void mShow() {
		System.out.println("자동차의 재질은 철입니다.");
	}
}


class MultiinhreitanceSample01 {

	public static void main(String[] args) {
		Car c = new Car(1234, 20.5);
		c.vShow();
		c.mShow();

	}

}
