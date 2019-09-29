package com.ezen.example;

/**
 * 접근 제한자(Access Modifier)
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * 클래스는 '사물'에 보다 근접한 코드를 만들기 위해 설계되었습니다.
 * 그러므로 프로그램 안에서 발생할 수 있는, 사물에 대한 부자연스러운 조작을 
 * 막을 필요가 있습니다.
 * 이때 사용하는게 Java의 '접근 제한자' 입니다.
 * 
 * 접근 제한자의 종류
 * 1. public : 모든 접근으로 사용 가능
 * 2. default : 같은 패키지 안에서 사용 가능 (=> 키워드 생략 가능)
 * 3. protected : 같은 패키지와 하위 클래스에서 사용 가능
 * 4. private : 클래스 안에서만 사용 가능
 */
class Car01 {
	int num;
	double gas;
	
	void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
	}
}

class AccessModifierSample01 {

	public static void main(String[] args) {
		Car01 c = new Car01();
		
		// 객처를 생성한 후 직접 필드에 접근해서 값을 입력하는 경우에는
		// 문제가 발생할 수 있습니다.
		c.num = 1234;
		c.gas = -10.0; // 과연 자동차의 연료의 양이 음수값을 가질 수 있을까?
		c.show();
		
	}

}
