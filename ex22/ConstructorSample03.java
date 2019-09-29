package com.ezen.example;

/**
 * 생성자(Constructor)
 * 생성자 안에서 다른 생성자 호출하기
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * 특정 생성자 안에서 
 * 특별히 다른 생성자를 호출할 수 있습니다.
 * 단, 생성자 코드 안에서 가장 먼저 호출되어야 합니다.
 */
class Car03 {
	int num;
	double gas;
	
	public Car03() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}

	public Car03(int n, double g) {
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

class ConstructorSample03 {

	public static void main(String[] args) {
		Car03 audi = new Car03();
		audi.show();
		
		System.out.println();
		
		Car03 bmw = new Car03(1234, 10.0);
		bmw.show();
	
	}

}
