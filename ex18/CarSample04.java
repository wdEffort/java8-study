package com.ezen.example;

/**
 * 클래스(Class)
 * 클래스를 사용하는 프로그램 작성해보기
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * 클래스의 사용방법
 * 1. 클래스를 선언하고
 * 2. 객체를 만들고
 * 3. 멤버에 접근해서 프로그램을 작성합니다.
 */
class Car04 { // Car04 클래스를 선언합니다.
	int num;
	double gas;
}

class CarSample04 {

	public static void main(String[] args) {
		// 객체를 생성한 후 클래스형 변수 c가 객체를 가리키게 합니다.
		Car04 c = new Car04();
		
		// 클래서 변수 c의 각 필드에 값을 대입합니다.
		c.num = 1234;
		c.gas = 20.5;
		
		// 각 필드의 값을 출력합니다.(차량 번호, 연료의 양)
		System.out.println("차량 번호는 " + c.num + "입니다.");
		System.out.println("연료의 양은 " + c.gas + "입니다.");
		
	}

}
