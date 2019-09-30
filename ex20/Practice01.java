package com.ezen.example;

/**
 * 여섯 번째 연습문제 - 01
 * 
 * @author yoman
 * 
 * 2019. 09. 30
 * 
 * 잘못된 코드를 고치세요.
 */
class Car {
	int num;
	double gas;
	
	void setNumGas(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "으로, 연료의 양을 " + gas + "으로 바꾸었습니다.");
	}
	
	void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
	}
}

class Practice01 {

	public static void main(String[] args) {
		Car car1 = new Car();
		// 클래스 외부에서 멤버에 접근하기 위해서는 클래스형 변수를 사용해야 합니다.
		// setNumGas(1234, 20.5); // ERROR
		car1.setNumGas(1234, 20.5);
		car1.show();

	}

}
