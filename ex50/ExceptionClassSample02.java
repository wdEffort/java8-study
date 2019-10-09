package com.ezen.example;

/**
 * 예외 던지기
 * 예외를 받아내지 않는 경우
 * 
 * @author yoman
 * 
 * 2019. 10. 09
 * 
 * 예외를 받아내지 않는 경우 프로그램이 실행중에 종료됩니다.
 * 이를 방지하기 위해서는 
 * 클래스 사용자가 'throws가 붙은 메소드'를 사용할 때
 * 반드시 두 작업 중 하나를 선택해서 구현해야 합니다.
 * 
 * 1. try ~ catch를 사용하여 해당 메소드에서 예외를 처리
 * 2. 메소드 이름 뒤에 throws를 붙여서 그 메소드의 '호출 메소드'에 예외 처리를 위임
 * 
 * 2번 처리를 선택한 경우
 * 만약, 호출 메소드가 main() 메소드인 경우 
 * 거슬러 올라갈 메소드가 없으므로 프로그램의 실행이 종료됩니다.
 */
class CarException02 extends Exception { 

}

class Car02 {
	private int num;
	private double gas;

	public Car02() {
		this.num = 0;
		this.gas = 0.0;
	}

	public void setCar(int num, double gas) throws CarException02 {
		if (gas < 0) {
			CarException02 e = new CarException02();
			throw e;
		} else {
			this.num = num;
			this.gas = gas;
			System.out.println("차량 번호를 " + num + "으로, 연료 양을 " + gas + "로 바꾸었습니다.");
		}

	}

	public void show() {
		System.out.println("차량 번호를 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
	}

}

class ExceptionClassSample02 {

	// main() 메소드에 예외 처리를 위임하는 경우 프로그램이 종료됩니다.
	public static void main(String[] args) throws CarException02 {
		Car02 car = new Car02();
		car.setCar(1234, -10.0);
		car.show();

	}

}
