package com.ezen.example;

/**
 * 메소드에 대해 더 알아봅니다.
 * 인수 다루기
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * 메소드를 호출할 때 어떠한 정보(값)을 전달할 수 있습니다.
 * 메소드에게 전달된 값에 따라 처리하도록 지시할 수 있습니다.
 * 
 * 이처럼 메소드에게 건내주는 정보를 '인수'라고 부릅니다.
 * 
 * 가인수(Parameter) : 메소드에 선언되어 있는 인수
 * 실인수(Argument) : 메소드 호출 시 전달되는 값
 */
class Car01 {
	int num;
	double gas;
	
	void show() {
		System.out.println("차량 번호는 " + this.num + "입니다.");
		System.out.println("연료의 양은 " + this.gas + "입니다.");
	}
	
	void showCar() {
		System.out.println("지금부터 자동차의 정보를 표시합니다.");
		this.show();
	}
	
	// 인수를 갖는 메소드를 정의합니다.
	// 정수형의 값을 1개 전달 받을 수 있는 메소드를 정의합니다.
	void setNum(int n) {
		num = n; // 전달받은 인수는 메소드 안에서 사용합니다.
		System.out.println("차량 번호를 " + num + "바꾸었습니다.");
	}
	
	void setGas(double g) {
		gas = g;
		System.out.println("연료의 양을 " + gas + "로 바꾸었습니다.");
	}
}

class CarSample01 {

	public static void main(String[] args) {
		Car01 c = new Car01();
		c.setNum(1234); // setNum() 메소드를 호출하는 시점에서 값을 전달해줍니다.
		c.setGas(30.5);
		c.showCar();
		
		System.out.println();
		
		// 다양한 값을 인수로 전달할 수 있습니다.
		// 이러한 특징을 이용하면 유연한 처리가 가능합니다.
		c.setNum(7890);
		c.setGas(28.5);
		c.showCar();

	}

}
