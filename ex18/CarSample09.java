package com.ezen.example;

/**
 * 클래스(Class)
 * 클래스 내에서 메소드 사용하기
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * 클래스 '외부'에서 메소드를 호출하는 것과 달리
 * 클래스 '내부'에서 메소드를 호출할 때에는 별다른 처리 없이
 * 사용이 가능합니다.
 * 
 * (권장)하지만 '객체 자신의 소유'임을 강조하기 위해 'this'라는 키워드를 사용합니다.
 */
class Car09 {
	int num;
	double gas;

	void show() {
		System.out.println("차량 번호는 " + this.num + "입니다.");
		System.out.println("연료의 양은 " + this.gas + "입니다.");
	}
	
	void showCar() {
		System.out.println("지금부터 자동차의 정보를 표시합니다.");
		// 클래스 '내부'에서 메소드를 호출합니다.
		// show();
		
		// '자기 자신'의 메소드에는 'this'를 붙일 수 있습니다.
		this.show();
	}

}

class CarSample09 {

	public static void main(String[] args) {
		Car09 c = new Car09();
		
		c.num = 1234;
		c.gas = 20.0;
		// 클래스 외부에서 '메소드'를 호출합니다.
		c.showCar();

	}

}
