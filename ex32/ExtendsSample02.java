package com.ezen.example;

/**
 * 상속(Inheritance)
 * 슈퍼 클래스의 생성자 지정하기
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * 서브 클래스의 객체를 생성할 경우
 * 서브 클래스의 생성자 호출에 앞서,
 * 슈퍼 클래스의 인수 없는 생성자가 자동적으로 호출됩니다.
 * 
 * 그러나 슈퍼 클래스의 생성자가 여러 개 존재한다면
 * 호출되는 생성자를 명시적으로 지정할 수도 있습니다.
 * 이때 'super()' 키워드를 사용합니다.
 * 
 * this() : 그 클래스의 다른 생성자를 호출
 * super() : 슈퍼 클래스의 생성자를 호출
 */
class Car02 {
	private int num;
	private double gas;
	
	public Car02() {
		this.num = 0;
		this.gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public Car02(int num, double gas) {
		this.num = num;
		this.gas = gas;
		System.out.println("차량 번호가 " + num + "이며, 연료의 양이 " + gas + "인 자동차가 만들어졌습니다.");
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

class RacingCar02 extends Car02 {
	private int course;
	
	public RacingCar02() {
		this.course = 0;
		System.out.println("레이싱카가 만들어졌습니다.");
	}
	
	public RacingCar02(int num, double gas, int course) {
		// 슈퍼 클래스에 존재하는 2개의 인수를 받는 생성자를 호출합니다.
		// this()를 사용할 때와 마찬가지로 가장 윗 부분에 위치해야 합니다.(=> 이런 이유로 this()와 super()는 동시에 사용할 수 없습니다.)
		super(num, gas);
		this.course = course;
		System.out.println("코스 번호가 " + course + "인 레이싱카가 만들어졌습니다.");
	}
	
	public void setCourse(int course) {
		this.course = course;
		System.out.println("코스 번호를 " + course + "로 했습니다.");
	}

}

class ExtendsSample02 {

	public static void main(String[] args) {
		RacingCar02 rc = new RacingCar02(1234, 20.5, 5);

	}

}
