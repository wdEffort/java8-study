package com.ezen.example;

/**
 * 생성자(Constructor)
 * 기본 생성자(Default constructor)
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * 만약, 클래스 내에 생성자를 하나도 정의하지 않은 경우
 * 객체를 생성할 때 인수가 없는 생성자가 자동으로 호출됩니다.
 * 
 * 인수가 없는 생성자를 기본 생성자라 부릅니다.
 */
class Car04 {
	int num;
	double gas;
	
	// 생성자가 정의되지 않았습니다.
	
	public void show() {
		System.out.println("자량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
	}
	
}

class ConstructorSample04 {

	public static void main(String[] args) {
		// 생성자가 정의되지 않은 경우 객체 생성시 기본 생성자가 자동으로 호출됩니다.
		Car04 c = new Car04();
	}

}
