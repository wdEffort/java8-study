package com.ezen.example;

/**
 * 클래스(Class)
 * Car01 클래스 선언해보기
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * 자동차를 만들기 위한 설계도(Class)를 작성합니다.
 * 설계도에는 '차량 번호와 연료의 양'을 표기합니다.
 * 또한, 주행과 기름을 넣을 수 있는 기능을 포함합니다.
 */
class Car {
	
	int num; // 차량 번호
	double gas; // 연료의 양
	
	// 주행 기능
	void drive() {
		System.out.println("주행을 시작합니다.");
	}
	
	// 주유 기능
	void charge() {
		System.out.println("기름을 넣습니다.");
	}
	
}

class CarSample01 {
	
	public static void main(String[] args) {
		
	}
	
}