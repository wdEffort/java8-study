package com.ezen.example;

/**
 * 클래스형 변수 이용하기
 * 클래스형 변수에 대입하기
 * 
 * @author yoman
 * 
 * 2019. 10. 01
 * 
 * 클래스형 변수는 객체가 생성될 때 이외에도 '대입'이 가능합니다.
 * 단, 대입하는 대상이 같은 클래스형이어야 합니다.
 */
class Car01 {
	int num;
	double gas;
	
	public Car01() {
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
class ClassVariableSample01 {

	public static void main(String[] args) {
		Car01 car1; // Car01형 변수 car1을 선언합니다.
		System.out.println("car1을 선언했습니다.");
		car1 = new Car01(); // Car01 클래스의 객체를 생성하여 car1이 가리키게 합니다.
		car1.setCar(1234, 20.5);
		
		Car01 car2; // Car01형 변수 car2를 선언합니다.
		System.out.println("car2를 선언했습니다.");
		
		car2 = car1; // car2에 car1을 대입했습니다.
		System.out.println("car2에 car1을 대입했습니다.");
		
		System.out.println("car1이 가리키는");
		car1.show();
		System.out.println("car2가 가리키는");
		car2.show();

	}

}
