package com.ezen.example;

/**
 * 클래스 메소드 사용시 주의할 점
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * 1. 클래스 안에서는 멤버에 'this'라는 키워드를 붙일 수 있습니다.
 * 하지만 이 'this'는 인스턴스 메소드 안에서만 붙일 수 있습니다.
 * => 'this'는 특정 객체 스스로를 가리키는 키워드입니다.
 *    따라서 각 객체에게 '공유'되는 멤버 안에서는 사용할 수 없습니다.
 * 
 * 2. 클래스 메소드 안에서는 인스턴스 변수와 인스턴스 메소드에 접근할 수 없습니다.
 * => 클래스 메소드는 객체가 생성되지 않은 상태에서도 호출할 수 있어야 합니다.
 *    따라서 특정 객체와 연결된 인스턴스 변수와 메소드에는 접근할 수 없습니다. (메커니즘...)
 */
class Car02 {
	public static int sum = 0; 
	private int num;
	private double gas;
	
	public Car02() {
		num = 0;
		gas = 0.0;
		sum++; 
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "으로, 연료의 양을 " + gas + "로 바꾸었습니다.");
	}
	
	public void show() {
		System.out.println("자량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
	}
	
	public static void showSum() {
		// 클래스 메소드 안에서는 'this'를 사용할 수 없습니다.
		// System.out.println("자동차는 모두 " + this.sum + "대 있습니다.");
		
		// 클래스 메소드 안에서는 인스턴스 변수에 접근할 수 없습니다.
		// System.out.println("차량 번호는 " + num + "입니다.");
		
		System.out.println("자동차는 모두 " + sum + "대 있습니다.");
	}
}

class ClassVariableSample02 {

	public static void main(String[] args) {
		Car02.showSum();
		
		System.out.println();
		
		Car02 audi = new Car02();
		audi.setCar(1234, 28.5);
		Car02.showSum();
		
		System.out.println();
		
		Car02 bmw = new Car02();
		bmw.setCar(5678, 33.0);
		Car02.showSum();
		
	}

}
