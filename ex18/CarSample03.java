package com.ezen.example;

/**
 * 클래스(Class)
 * 멤버에 접근하기
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * 멤버란
 * 클래스의 필드(Field) 또는 메소드(Method)를 뜻합니다.
 * 
 * 멤버에 접근하기 위해서는 '.'를 사용합니다.
 * 
 * 사용법 
 * 변수.필드
 * 변수.메소드()
 * 
 * 여기서 변수는 객체를 가리키는 변수를 말합니다.
 */
class Car03 { // Car03 클래스를 선언합니다.
	int num;
	double gas;
	
	public void drive() {
		System.out.println("주행을 시작합니다.");
	}

}

class CarSample03 {
	
	public static void main(String[] args) {
		// Car03 객체를 생성합니다.
		// 생성된 객체는 값을 저장할 수 있는 필드를 가집니다.
		Car03 c = new Car03();
		
		// 실제로 값을 대입합니다.
		c.num = 1234; // 차량 번호를 대입합니다.
		c.gas = 20.5; // 연료의 양을 대입합니다.
		c.drive();
	}
	
}
