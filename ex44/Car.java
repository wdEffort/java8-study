package com.ezen.example;

/**
 * ���� ���� - Car
 * 
 * @author yoman
 * 
 * 2019. 10. 07
 * 
 * Sample Ŭ������ ���� Car Ŭ������ �����մϴ�.
 */
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
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ����" + gas + "�Դϴ�.");
	}
}
