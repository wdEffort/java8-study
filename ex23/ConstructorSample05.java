package com.ezen.example;

/**
 * 생성자(Constructor)
 * 생성자에 접근 제한자 붙이기
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * 생성자에도 접근 제한자를 설정할 수 있습니다.
 * 기본 생성자를 private로 설정된 경우
 * 이 생성자를 이용하여 객체를 만들 수 없습니다.  
 */
class Car05 {
	int num;
	double gas;
	
	private Car05() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}

	public Car05(int n, double g) {
		this(); // 생성자의 시작 부분에서 인수가 없는 생성자를 호출합니다.
		num = n;
		gas = g;
		System.out.println("차량 번호가 " + num + "으로, 연료의 양을 " + gas + "로 바꾸었습니다.");
	}
	
	public void show() {
		System.out.println("자량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
	}
	
}

class ConstructorSample05 {

	public static void main(String[] args) {
		// 기본 생성자를 이요하여 객체를 만들 수 없습니다.
		// Car03 audi = new Car03();	
		
		// 그 결과, Car03 클래스의 객체를 생성하기 위해서는
		// 반드시 인수 두 개를 가지는 생성자가 호출되어야 합니다.
		Car03 bmw = new Car03(1234, 10.0);
		bmw.show();
	
	}

}
