package com.ezen.example;

/**
 * 생성자(Constructor)
 * 생성자 오버로딩
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * 생성자 또한 인수의 형(type)과 개수가 다르면
 * 오버로딩이 가능합니다.
 * 
 * 생성자를 여러 개 정의하면 다양한 인수를 전달하여 
 * 객체 생성에 유연하게 활용할 수 있습니다.
 * => 객체 멤버의 다양한 초기화 설정 처리가 가능합니다.
 */
class Car02 {
	int num;
	double gas;
	
	public Car02() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	// 인수의 개수가 다른 생성자를 만들었습니다.
	public Car02(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호가 " + num + "이며, 연료의 양이 " + gas + "인 자동차가 만들어졌습니다.");
	}
	
	public void show() {
		System.out.println("자량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
	}
	
}

class ConstructorSample02 {

	public static void main(String[] args) {
		// 객체 생성시 인수가 없는 생성자가 호출됩니다.
		Car02 audi = new Car02();
		audi.show();
		
		System.out.println();
		
		
		// 객체 생성시 인수가 두 개인 생성자가 호출됩니다.
		Car02 bmw = new Car02(1234, 25.5);
		bmw.show();
	}

}
