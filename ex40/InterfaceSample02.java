package com.ezen.example;

/**
 * 인터페이스(Interface)
 * 인터페이스 구현하기
 * 
 * @author yoman
 * 
 * 2019. 10. 06
 * 
 * 인터페이스는 클래스와 조합해서 사용해야 합니다.
 * 이러한 행위를 인터페이스를 구현(Implementation)한다고 부릅니다.
 * 클래스에서 인터페이스를 구현할 때에는 'implements' 키워드를 사용합니다.
 * 
 * 인터페이스를 구현하는 클래스는 인터페이스가 가지고 있는
 * 필드와 메소드를 물려받게 됩니다.
 * 단, 인터페이스를 구현한 클래스의 객체를 생성하기 위해서는
 * 인터페이스의 모든 메소드를 '정의'해야 합니다.
 * 
 * [인터페이스 사용]
 * class 클래스명 implements 인터페이스명 { ... }
 */
interface iVehicle02 {
	void show(); // 추상 메소드입니다.
}

class Car02 implements iVehicle02 {
	private int num;
	private double gas;
	
	public Car02(int num, double gas) {
		this.num = num;
		this.gas = gas;
	}
	
	// 인터페이스에 선언된 메소드를 구현합니다.
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
	}
}

class Plane02 implements iVehicle02 {
	private int flight;
	
	public Plane02(int flight) {
		this.flight = flight;
	}
	
	// 인터페이스에 선언된 메소드를 구현합니다.
	public void show() {
		System.out.println("비행기 번호는 " + flight + "입니다.");
	}
}

class InterfaceSample02 {

	public static void main(String[] args) {
		// 인터페이스 배열을 준비합니다.
		iVehicle02[] ivc = new iVehicle02[2];
		
		ivc[0] = new Car02(1234, 20.5);
		ivc[1] = new Plane02(232);
		
		for(int i = 0; i < ivc.length; i++) {
			ivc[i].show();
			System.out.println();
		}

	}

}
