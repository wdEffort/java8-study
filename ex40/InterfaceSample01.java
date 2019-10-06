package com.ezen.example;

/**
 * 인터페이스(Interface)
 * 
 * @author yoman
 * 
 * 2019. 10. 06
 *
 * Java에서는 추상 클래스와 거의 비슷한 메커니즘을
 * 인터페이스 기능을 사용해서 표현할 수 있습니다.
 * 인터페이스를 선언할 때는 'class' 대신 'interface' 키워드를 사용합니다.
 * 
 * [특징]
 * 1. 필드와 메소드를 가질 수 있음
 *    (=> 값을 변경할 수 있는 필드나 몸체가 있는 메소드는 가질 수 없습니다.)
 * 2. 생성자를 가질 수 없음
 * 3. 일반적으로 인터페이스 멤버에는 어떠한 접근 제한자도 붙이지 않음
 *    (=> 그러나 필드에는 public static final, 메소드에는 abstract 제한자를 붙인거나 마찬가지 입니다.)
 * 
 * [인터페이스 선언]
 * interface 인터페이스명 {
 *     자료형 필드명 = 식; // '반드시 초기화'합니다.
 *     리턴 값의 형 메소드명(인수목록); // 몸체는 만들지 않습니다.
 * }
 */
interface iVehicle01 {
	void show(); // 추상 메소드입니다.
}

class InterfaceSample01 {

	public static void main(String[] args) {
		// 추상 클래스와 마찬가지로 인터페이스형 변수를 선언할 수 있지만
		// 객체를 만들 수는 없습니다.
		iVehicle01 ivc;
		// ivc = new iVehicle01(); // ERROR
		

	}

}
