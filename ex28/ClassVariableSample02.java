package com.ezen.example;

/**
 * 클래스형 변수 이용하기
 * 클래스형 변수에 대입하기
 * 
 * @author yoman
 * 
 * 2019. 10. 01
 * 
 * 클래스형 변수에 '대입'이 일어나면 새롭게 객체가 생성되는 것이 아닙니다.
 * => 하나의 객체를 가리키게 됩니다.
 * 
 * 아래 코드에서 증명해 봅니다.
 */
class Car02 {
	int num;
	double gas;
	
	public Car02() {
		num = 0;
		gas = 0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "으로, 연료의 양을 " + gas + "로 바꾸었습니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
	}
}
class ClassVariableSample02 {

	public static void main(String[] args) {
		Car02 car1; 
		System.out.println("car1을 선언했습니다.");
		car1 = new Car02(); 
		car1.setCar(1234, 20.5);
		
		Car02 car2; 
		System.out.println("car2를 선언했습니다.");
		
		car2 = car1; // car2에 car1을 대입했습니다.
		System.out.println("car2에 car1을 대입했습니다.");
		
		System.out.println("car1이 가리키는");
		car1.show();
		System.out.println("car2가 가리키는");
		car2.show();
		
		System.out.println();
		
		// 정말 하나의 객체를 가리키고 있는지 증명을 시작하는 코드입니다.
		System.out.println("car1이 가리키는 차량의 정보를 변경합니다.");
		car1.setCar(2345, 30.5);
		
		// 위에서 car1 차량의 정보만 변경되었지만 
		// car2 차량의 정보도 변경되었다는 것을 알 수 있습니다.
		// 즉, Car02형 변수 car1과 car2가 서로 다른 객체가 아니라, 동일한 객체를 가리키고 있습니다.
		System.out.println("car1이 가리키는");
		car1.show();
		System.out.println("car2가 가리키는");
		car2.show();

	}

}
