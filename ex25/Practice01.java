package com.ezen.example;

/**
 * 일곱 번째 연습문제 - 01
 * 
 * @author yoman
 * 
 * 2019. 09. 30
 * 
 * 잘못된 코드를 고치세요.
 */
class Car {
	// 클래스 변수를 선언합니다.
	public static int sum = 0;
	
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "으로, 연료의 양을 " + gas + "으로 바꾸었습니다.");
	}

	// 클래스 메소드를 선언합니다.
	public static void showSum() {
		System.out.println("자동차는 모두 " + sum + "대 있습니다.");
		
		// 클래스 메소드 안에서는 인스턴스 멤버에 접근할 수 없습니다.
		// show(); // ERROR
	}
	
	public void show() {
		System.out.println("자량 번호는 " + num + "입니다");
		System.out.println("연료의 양은 " + gas + "입니다");
	}
	
}

class Practice01 {

	public static void main(String[] args) {
		Car.showSum();
		
		Car audi = new Car();
		audi.setCar(1234, 25.5);
		
		Car.showSum();
		
		Car bmw = new Car();
		bmw.setCar(5678, 27.5);
		
		Car.showSum();

	}

}
