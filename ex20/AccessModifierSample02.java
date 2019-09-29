package com.ezen.example;

/**
 * private 접근 제한자 사용하기
 * private 멤버
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * Sample01에서 연료의 양이 음수값이 되어버린 원인은 어디에 있을까?
 * => 멤버에 아무런 제약이 없이 접근이 가능했기 때문
 * 
 * Java에서는 이런 실수를 하지 않도록 클래스 외부에서 마음데로 접근 할 수 없는
 * 멤버를 만드는 기능을 지원하는데 바로 'private 멤버'입니다. (=> 캡슐화[Encapsulation])
 */
class Car02 {
	// 필드 선언시 자료형 앞에 'private' 키워드를 붙여주었습니다.
	// 이로써 클래스 외부에서 필드에 접근할 수 없게 되었습니다.
	private int num;
	private double gas;
	
	void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
	}
}

class AccessModifierSample02 {

	public static void main(String[] args) {
		Car02 c = new Car02();
		
		// Car02 클래스 외부에서 직접 num, gas 필드에 접근 할 수 없습니다.
		// c.num = 1234;
		// c.gas = -10.0;

	}

}
