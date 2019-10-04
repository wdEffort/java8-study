package com.ezen.example;

/**
 * Object Class
 * 모든 클래스의 근원이 되는 클래스
 * 
 * @author yoman
 * 
 * 2019. 10. 04
 * 
 * Java에서는 슈퍼 클래스를 지정하지 않으면 그 클래스는 'Object 클래스'를 상속 받습니다.
 *  
 * Java에서는 하나의 슈퍼 클래스를 확장해서 여러 개의 서브 클래스를 선언할 수 있습니다.
 * 또한, 서브 클래스를 더욱 확장해서 '보다 새로운 서브 클래스'를 생성하는 것 또한 가능합니다.
 * 그러나 하나의 클래스가 여러 개의 슈퍼 클래스를 상속 받을 수 없습니다.
 * 
 * Object 클래스의 toString() 메소드
 * => 객체를 나타내는 문자열을 반환(String)
 * => 객체의 내용을 출력해야 할 때, 이 메소드가 호출되도록 약속이 되어 있습니다.
 * => 보통 '재정의(Overriding)'하여 사용합니다.
 */
class Car01 {
	protected int num;
	protected double gas;
	
	public Car01() {
		this.num = 0;
		this.gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar(int num, double gas) {
		this.num = num;
		this.gas = gas;
		System.out.println("차량 번호를 " + num + "으로, 연료의 양을 " + gas + "로 바꾸었습니다.");
	}
	
	// Object 클래스의 toSting() 메소드를 재정의합니다.
	public String toString() {
		String str = "자량번호 : " + num + " 연료 양 : " + gas;
		return str;
	}
}

class ObjectSample01 {

	public static void main(String[] args) {
		Car01 c = new Car01();
		c.setCar(1234, 20.5);
		
		System.out.println(c); // 새로 정의한 toString() 메소드가 호출됩니다.
		
		
	}

}
