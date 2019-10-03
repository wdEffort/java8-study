package com.ezen.example;

/**
 * 상속(Inheritance)
 * 클래스의 확장(Extends)
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * 프로그램 개발 시 이미 만들어진 코드들을 확장시키며
 * 개발해 나가야할 때가 있습니다.
 * 
 * Java에서는 이미 설계된 클래스를 바탕으로 새로운 클래스를 만들 수 있도록
 * 지원하는데, 이를 확장(Extends) 또는 상속(Inheritance)라고 합니다.
 * 
 * 기존 클래스를 상속받은 클래스는 자식(Sub)과 부모(Super)의 관계를 가지게 되며,
 * 부모의 멤버를 '물려받아' 동작하게끔 되어 있습니다.(=> 부모의 멤버를 따로 작성할 필요가 없습니다.)
 * 또한, 새로운 멤버를 추가해서 코드를 작성할 수 있습니다.
 */

// 슈퍼 클래스를 선언합니다.
class Car01 {
	private int num;
	private double gas;
	
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
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
	}
	
}

// 서브 클래스를 선언합니다.
// RacingCar01 클래스는 Car01 클래스를 상속받습니다.
// 이때 'extends' 키워드를 사용합니다.
class RacingCar01 extends Car01 {
	private int course;
	
	public RacingCar01() {
		this.course = 0;
		System.out.println("레이싱카가 만들어졌습니다.");
	}
	
	public void setCourse(int course) {
		this.course = course;
		System.out.println("코스 번호를 " + course + "로 했습니다.");
	}

}

class ExtendsSample01 {
	
	public static void main(String[] args) {
		// RacingCar01 클래스의 객체를 생성합니다.
		RacingCar01 rc = new RacingCar01();
		
		// Car01 클래스를 상속받았으므로, Car01에 있는 setCar() 메소드를 호출할 수 있습니다.
		rc.setCar(1234, 20.5);
		
		// RacingCar01의 setCourse() 메소드를 실행합니다.
		rc.setCourse(1);
		
	}
}
