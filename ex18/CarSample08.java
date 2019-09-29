package com.ezen.example;

/**
 * 클래스(Class)
 * this에 대해 알아보기
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * Car08 클래스 '외부'에서 필드에 접근하는 경우 '.'를 사용했습니다.
 * 이는 클래스 바깥에서 필드를 사용할 경우 어떤 클래스형 변수가
 * 가리키고 있는 객체의 필드인지 확실히 하기 위함입니다.
 * 
 * 한편, Car08 클래스 '내부'에서 필드를 사용할 경우 
 * 필드 앞에 아무것도 붙이지 않습니다.
 * 
 * (권장)하지만 '객체 자신의 소유'임을 강조하기 위해 'this'라는 키워드를 사용합니다.
 */
class Car08 {
	int num;
	double gas;

	void show() {
		// 클래스 내부에서 필드를 사용할 경우 아무것도 붙이지 않습니다.
		// System.out.println("차량 번호는 " + num + "입니다.");
		// System.out.println("연료의 양은 " + gas + "입니다.");
		
		// '자기 자신'의 필드에는 'this'를 붙일 수 있습니다.
		System.out.println("차량 번호는 " + this.num + "입니다.");
		System.out.println("연료의 양은 " + this.gas + "입니다.");

	}

}

class CarSample08 {

	public static void main(String[] args) {
		Car08 c = new Car08();

		c.num = 7890;
		c.gas = 25.5;
		c.show();

	}

}
