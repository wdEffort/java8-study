package com.ezen.example;

/**
 * 예외 던지기
 * 예외 클래스 선언하기
 * 
 * @author yoman
 * 
 * 2019. 10. 09
 * 
 * 예외를 발생시키는(던지는) 코드를 작성하는 것 또한 가능합니다.
 * 예외를 던지는 클래스를 설계하면 그 클래스를 이용하는 사람에게
 * 예외 처리를 위임할 수 있습니다.
 * 
 * 이를 위해 먼저 자신만의 예외 클래스를 만드는 방법을 학습해 보겠습니다.
 * 
 * 자신만의 예외 클래스를 만들기 위해서는 
 * 'Throwable 클래스의 서브 클래스'를 확장(Extends)한 예외 클래스를 선언해야 합니다.
 */

// Exception 클래스를 상속받아서 독자적인 예외 클래스를 선언합니다.
// Exception 클래스는 Throwable 클래스의 서브클래스 입니다.
class CarException extends Exception { // 예외 발생시 활용할 수 있습니다.
	
	
}

class Car {
	private int num;
	private double gas;
	
	public Car() {
		this.num = 0;
		this.gas = 0.0;
	}

	// 'throws' 키워드를 사용하여 예외를 던지는 메소드임을 선언합니다.
	public void setCar(int num, double gas) throws CarException {
		// gas 값이 0 미만일 경우 CarException 객체를 생성한 후 예외를 던집니다.
		if (gas < 0) {
			CarException e = new CarException();
			throw e; // 예외를 던질 때에는 'throw' 키워드를 사용합니다.
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

class ExceptionClassSample01 {
	public static void main(String[] args) {
		Car car = new Car();
		
		try {
			car.setCar(1234, -10.0); // setCar() 메소드 호출시 예외가 던져집니다.
		} catch(CarException e) {
			System.out.println(e + "(이)가 던져졌습니다.");
		}
		
		car.show();
	}
}