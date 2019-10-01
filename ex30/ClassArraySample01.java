package com.ezen.example;

/**
 * 객체 배열
 * 
 * @author yoman
 * 
 * 2019. 10. 01
 *
 * Java에서는 같은 클래스형의 객체들을 모아 한번에 다루도록 객체 배열을 제공합니다.
 */

class Car {
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "으로, 연료의 양을 " + gas + "로 바꾸었습니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
	}
}

class ClassArraySample01 {

	public static void main(String[] args) {
		Car[] cars; // Car[]형 변수를 준비합니다.
		cars = new Car[3]; // Car형 배열 요소를 3개 생성합니다.
		
		// 배열 길이만큼 Car형 객체를 생성합니다.
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();
		}
		
		cars[0].setCar(1234, 25.5);
		cars[1].setCar(5678, 30.5);
		cars[2].setCar(9012, 35.5);
		
		for (int i = 0; i < cars.length; i++) {
			cars[i].show();
		}
		
	}

}
