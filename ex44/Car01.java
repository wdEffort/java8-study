package com.ezen.example;

/**
 * ���� ���� - Car01
 * 
 * @author yoman
 * 
 * 2019. 10. 07
 * 
 * Sample01�� ���� Car01 Ŭ������ �����մϴ�.
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
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ����" + gas + "�Դϴ�.");
	}
}
