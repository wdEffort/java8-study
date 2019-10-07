package com.ezen.pa;

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
