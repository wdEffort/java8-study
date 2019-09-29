package com.ezen.example;

/**
 * 생성자(Constructor)
 * 생성자의 기본
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * Java에서는 객체를 생성할 때 항상 실행되는 것으로,
 * 객체를 초기화해주기 위해 '생성자'라는 기능을 제공합니다.
 * 메소드와 정의 방법이 다르다는 점을 유의하시기 바랍니다.
 * 
 * 생성자는 메소드처럼 자유로이 호출할 수 없으며
 * 보통 객체의 멤버를 자동으로 초기화 하기 위해 사용합니다.
 * 
 * 사용법
 * 접근 제한자 클래스명(인수 목록) {
 *   문장;
 * }
 */
class Car01 {
	int num;
	double gas;
	
	// 생성자를 정의합니다. (=> 생성자는 리턴값이 없습니다.)
	// 객체가 생성될 때 자동으로 실행됩니다.
	public Car01() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void show() {
		System.out.println("자량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
	}
	
}

class ConstructorSample01 {

	public static void main(String[] args) {
		// 객체를 생성함으로써 생성자 안에 코드가 자동으로 실행됩니다.
		Car01 c = new Car01();
		c.show();
		
	}

}
