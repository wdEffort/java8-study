package com.ezen.example;

/**
 * 파일 분할 - Car01
 * 
 * @author yoman
 * 
 * 2019. 10. 07
 * 
 * Sample01에 사용될 Car01 클래스를 선언합니다.
 */
public class Car01 {
	private int num;
	private double gas;
	
	public Car01() {
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
