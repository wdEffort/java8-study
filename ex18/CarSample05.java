package com.ezen.example;

/**
 * 클래스(Class)
 * 2개 이상의 객체 생성
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * Java에서 객체는 얼마든지 만들 수 있습니다.
 */
class Car05 { // Car05 클래스를 선언합니다.
	int num;
	double gas;
	
}

class CarSample05 {

	public static void main(String[] args) {
		// 첫 번째 자동차인 'audi'를 생성합니다. (객체1)
		Car05 audi = new Car05();
		audi.num = 5678;
		audi.gas = 30.5;
		
		// 두 번째 자동차인 'bmw'를 생성합니다. (객체2)
		Car05 bmw = new Car05();
		bmw.num = 1234;
		bmw.gas = 28.7;
		
		// 이렇게 두 대의 자동차는 각각 자신의 차량 번호와 연료의 양을 가지게 됩니다.
		// 객체를 여러 개 만들 수 있으므로 많은 수의 자동차를 관리하는 프로그램을 작성할 수 있게 되었습니다.

	}

}
