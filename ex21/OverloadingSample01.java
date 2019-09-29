package com.ezen.example;

/**
 * 메소드의 오버로딩(Overloading)
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * Java에서는 '같은 이름'의 메소드를 2개 이상 정의하고, 
 * 각각 다른 처리를 할 수 있게 하는 기능을 제공합니다.
 * 이러한 기능을 일컬어 메소드 '오버로딩'이라고 부릅니다 (=> 다형성[Polymorphism])
 * 
 * 조건
 * 메소드의 인수의 형(type)이 다르거나,
 * 개수를 다르게 만들어야 합니다.
 */
class Car01 {
	int num;
	double gas;
	
	// setCar() 메소드를 여러 개 작성합니다.
	// 단, 메소드의 인수의 형(type)이 다르거나 개수가 달라야 합니다.
	
	// 정수형 인수를 가지는 setCar()
	public void setCar(int n) {
		num = n;
		System.out.println("차량 번호를 " + num + "으로 바꾸었습니다.");
	}
	
	// 실수형 인수를 가지는 setCar()
	public void setCar(double g) {
		gas = g;
		System.out.println("연료의 양을 " + gas + "으로 바꾸었습니다.");
	}
	
	// 2개의  인수를 가지는 setCar()
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "으로, 연료의 양을 " + gas + "로 바꾸었습니다.");
	}
	
	public void show() {
		System.out.println("자량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
	}
}

public class OverloadingSample01 {

	public static void main(String[] args) {
		Car01 c = new Car01();
		
		// 2개의 인수를 가지는 setCar()을 호출합니다.
		c.setCar(1234, 10.5);
		c.show();
		
		System.out.println("차량 번호를 바꾸겠습니다.");
		// 정수형 인수를 가지는 setCar()을 호출합니다.
		c.setCar(7890);
		c.show();
		
		System.out.println("연료의 양을 바꾸겠습니다.");
		// 실수형 인수를 가지는 setCar()을 호출합니다.
		c.setCar(25.5);
		c.show();

	}

}
