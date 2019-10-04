package com.ezen.example;

/**
 * Object Class
 * 
 * @author yoman
 * 
 * 2019. 10. 04
 * 
 * Object 클래스의 equals() 메소드
 * => 두 변수가 가리키는 객체가 동일한 경우 true를 반환 합니다.(boolean)
 * => 여러 변수가 동일한 객체를 가리키는지 확인해야 할 경우 사용합니다.
 * => 단, String 클래스의 경우 '동일한 문자열인지'를 조사하도록 재정의 되어 있습니다.
 */
class Car02 {
	protected int num;
	protected double gas;
	
	public Car02() {
		this.num = 0;
		this.gas = 0.0;
	}
	
}

class ObjectSample02 {

	public static void main(String[] args) {
		// c1과 c2는 서로 다른 객체를 가리킵니다.
		Car02 c1 = new Car02();
		Car02 c2 = new Car02();
		
		Car02 c3;
		c3 = c1; // c1과 c3은 같은 객체를 가리킵니다.
		
		boolean b1 = c1.equals(c2);
		boolean b2 = c1.equals(c3);
		
		System.out.println("c1과 c2는 같습니까? " + b1);
		System.out.println("c1과 c3는 같습니까? " + b2);
		
		String str1 = new String("yoman");
		String str2 = new String("yoman");

		System.out.println("str1과 str2은 같습니까? " + str1.equals(str2));
	}

}
