package com.ezen.example;

/**
 * 메소드에 대해 더 알아봅니다.
 * 변수 값을 전달해서 메소드를 호출 할 수 있습니다.
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * 메소드 호출 시 전달할 값으로 변수를 전달할 수 있습니다.
 * 
 * 또한, 메소드는 두 개 이상의 인수(인수 목록)를 가질 수 있습니다.
 * 이 경우 반드시 가인수와 실인수의 개수가 동일해야 메소드 호출이 가능합니다.
 */
class Car02 {
	int num;
	double gas;
	
	// 인수가 없는 메소드
	void show() {
		System.out.println("차량 번호는 " + this.num + "입니다.");
		System.out.println("연료의 양은 " + this.gas + "입니다.");
	}
	
	void showCar() {
		System.out.println("지금부터 자동차의 정보를 표시합니다.");
		this.show();
	}
	
	void setNum(int n) {
		num = n;
		System.out.println("차량 번호를 " + num + "바꾸었습니다.");
	}
	
	void setGas(double g) {
		gas = g;
		System.out.println("연료의 양을 " + gas + "로 바꾸었습니다.");
	}
	
	// 두 개 이상의 인수를 가지는 메소드를 정의합니다.
	void setNumGas(int n, double g) {
		num = n;
		gas = g; 
		System.out.println("차량 번호를 " + num + "으로, 연료의 양을 " + gas + "로  바꾸었습니다.");
	}
}

class CarSample02 {

	public static void main(String[] args) {
		Car02 c = new Car02();
		
		int number = 1234;
		double gasoline = 40.2;
		
		// 위에서 선언한 변수를 실인수(Argument)로 사용할 수 있습니다.
		// 실인수와 가인수(Parameter)의 이름은 서로 달라도 됩니다.
		c.setNum(number);
		c.setGas(gasoline);
		c.showCar();
		
		System.out.println();
		
		number = 5678;
		gasoline = 24.8;
		
		// 두 개 이상의 인수를 가지는 메소드를 호출합니다.
		// 단, 반드시 인수 두개를 모두 전달해 주어야 합니다.
		c.setNumGas(number, gasoline);
		// c.setNumGas(number); // ERROR
				
	}

}
