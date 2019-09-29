package com.ezen.example;

/**
 * private 접근 제한자 사용하기
 * private 멤버로 설정된 필드에 접근하는 방법
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * Sample02에서 private 멤버로 설정된 필드에 대해서 클래스 외부에서
 * 접근이 불가능다하는 것을 알았습니다. 
 * 그러면 private 멤버에 접근하는 방법이 있을까요?
 * 
 * => 클래스 외부에서 접근 가능한 메소드를 정의하여 인수 목록을 전달하고
 *    필드에 값을 대입해주는 방식을 사용하면 됩니다.
 */
class Car03 {
	private int num;
	private double gas;
	
	// 메소드를 정의할 때 리턴 값의 형 앞에 'public' 키워드를 붙여주었습니다.
	// public 접근 제한자로 설정된 멤버는 클래스 외부에서 사용 가능합니다. 
	public void setNumGas(int n, double g) {
		// 인수로 전달된 연료의 값이 올바른 값인지 검사하여 저장합니다.
		if (g > 0 && g < 1000) {
			num = n;
			gas = g;
			System.out.println("차량 번호를 " + num + "으로, 연료의 양을 " + gas + "로 바꾸었습니다.");
		} else {
			System.out.println(g + "는 올바른 연료 양이 아닙니다.");
			System.out.println("연료의 양을 바꿀 수 없습니다.");
		}
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
	}
}

class AccessModifierSample03 {

	public static void main(String[] args) {
		Car03 c = new Car03();
		
		// public 접근 제한자로 설정된 메소드를 사용하여 필드에 값을 대입합니다.
		c.setNumGas(1234, 20.5); 
		c.show();
		
		System.out.println();
		System.out.println("잘못된 연료양을 저장해보겠습니다.");
		System.out.println();
		
		c.setNumGas(1234, -10.0);
		c.show();
		
		// 이렇게 private, public 접근 제한자를 사용하면 올바른 값을 저장할 수 있게 됩니다.

	}

}
