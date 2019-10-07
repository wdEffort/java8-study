package com.ezen.example;

/**
 * ��Ű��(Package)
 * Ŭ������ ��Ű���� ���Խ�Ű��
 * 
 * @author yoman
 * 
 * 2019. 10. 07
 * 
 * ��Ը� ���α׷��� �ۼ��� ������ 
 * ������ Ŭ���� �̸��� �浹�ϴ� ��찡 �߻��մϴ�.
 * 
 * �̷��� �� Java������ ��Ű���� ����Ͽ� 
 * Ŭ���� �̸��� �����ϰ� �浹�ϴ� ���� �����մϴ�.
 * 
 * [Ŭ������ ��Ű���� ���Խ�Ű�� ���]
 * package ��Ű����;
 * 
 * class Ŭ������ { ... }
 * 
 * �Ʒ� �������� Car Ŭ������ PackageSample01 Ŭ������
 * ��� com.ezen.example ��Ű���� ���Ե˴ϴ�.
 * 
 * ���� ��Ű���� ���Ե� Ŭ�������� 
 * ��Ű���� Ư���� �ǽ����� �ʰ� ���θ� ����� �� �ֽ��ϴ�.
 */
class Car {
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

class PackageSample {

	public static void main(String[] args) {
		Car car = new Car();
		car.show();

	}

}
