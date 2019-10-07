package com.ezen.pa;

// Car 클래스 앞에 'public' 접근 제한자를 붙여줌으로써
// 다른 패키지의 클래스에서 사용할 수 있게 만듭니다.
public class Car {
	private int num;
	private double gas;
	
	public Car() {
		this.num = 0;
		this.gas = 0.0;
	}
	
	public void setCar(int num, double gas) {
		this.num = num;
		this.gas = gas;
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은" + gas + "입니다.");
	}

}
