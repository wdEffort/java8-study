package com.ezen.example;

/**
 * 클래스(Class)
 * 메소드의 기본
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * 지금까지 클래스를 사물에 빗대어 표현하였고
 * 사물이 가지고 있는 '기능'을 Java에서는 메소드(Method)라고 말했습니다.
 * 
 * 메소드를 정의하는 방법에 대해 알아봅니다.
 * 
 * 메소드 정의
 * 리턴 값의 형 메소드명(인수 목록) {
 *   문장;
 *   ...
 *   return 식;
 * }
 * 
 * 메소드 호출
 * 변수.메소드(인수 목록)
 */
class Car07 {
	int num;
	double gas;
	
	// 자동차의 정보를 출력하는 메소드를 작성합니다.
	void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
		
	}
	
}

class CarSample07 {

	public static void main(String[] args) {
		// 객체를 생성합니다.
		Car07 c = new Car07();
		
		// 필드에 값을 대입합니다.
		c.num = 1234;
		c.gas = 30.0;
		// 메소드를 호출합니다.
		c.show();
		
	}

}
