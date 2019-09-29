package com.ezen.example;

/**
 * 인스턴스(Instance) 변수와 메소드, 클래스(Class) 변수와 메소드
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * 1. 인스턴스 변수와 메소드
 * => 객체가 생성되고 나서 값을 저장하거나 호출할 수 있는 클래스의 멤버
 * => 각 객체에 연결된 필드, 메소드
 * 
 * 2. 클래스 변수와 메소드
 * => 객체에 연결되어있지 않고 클래스 전체에 연결되어 있는 필드, 메소드
 * 
 * 클래스 변수와 메소드를 선언할 때에는 'static'이라는 제한자를 붙여야 합니다.
 * 
 * 클래스 변수와 메소드는 객체를 생성하지 않고 
 * '클래스명.변수 또는  클래스.메소드(인수 목록)'처럼 접근해서 사용이 가능합니다.
 */
class Car01 {
	public static int sum = 0; // 클래스 변수(각 객체가 '공유'하는 필드가 됩니다.)
	private int num;
	private double gas;
	
	public Car01() {
		num = 0;
		gas = 0.0;
		sum++; // 생성자가 호출될 때 클래스 변수 sum의 값을 1 증가시킵니다.
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
		System.out.println("자동차는 모두 " + sum + "대 있습니다.");
	}
}

class ClassVariableSample01 {

	public static void main(String[] args) {
		// 클래스 메소드를 호출합니다.
		Car01.showSum();
		
		System.out.println();
		
		Car01 audi = new Car01();
		audi.setCar(1234, 28.5);
		Car01.showSum();
		
		System.out.println();
		
		Car01 bmw = new Car01();
		bmw.setCar(5678, 33.0);
		Car01.showSum();
		
	}

}
