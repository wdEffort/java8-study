package com.ezen.example;

/**
 * final 사용하기
 * 필드에 사용하기 
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * 만약, 필드 앞에 'final' 키워드를 붙이면
 * 해당 필드의 값은 변경할 수 없는 상태가 됩니다.
 * 단, 이 필드는 선언할 때 반드시 '초기화'해야 합니다.
 * => 이를 상수(Constant)라고 부릅니다.
 */
class Car02 {
	protected int num;
	protected double gas;
	static final int NUM_TIRE = 4; // final 키워드가 붙은 필드를 선언합니다.
	
	public Car02() {
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

class RacingCar02 extends Car02 {
	private int course;
	
	public RacingCar02() {
		this.course = 0;
		System.out.println("레이싱카가 만들어졌습니다.");
	}
	
	public void setCourse(int course) {
		this.course = course;
		System.out.println("코스 번호를 " + course + "로 했습니다.");
	}
	
	public void show() {
		System.out.println("코스 번호는 " + course + "입니다.");
	}
	

}

class FinalSample02 {

	public static void main(String[] args) {
		// Car02 클래스에 선언된 상수를 출력합니다.
		// static final 키워드가 붙은 필드는 클래스명.필드명으로 값을 얻을 수 있습니다.
		System.out.println("Car02 클래스에 선언된 상수의 값은 " + Car02.NUM_TIRE + "입니다.");

	}

}
