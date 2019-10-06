package com.ezen.example;

/**
 * ���� ���(Multiple Inheritance)
 * 
 * @author yoman
 * 
 * 2019. 10. 06
 *
 * ���α׷��� ����� ���� �� �� �̻��� Ŭ������ ��ӹ���
 * ���� Ŭ������ ����ϰ� ���� ��찡 �ֽ��ϴ�.
 * �̷��� ����� ���� ����̶� �θ��ϴ�.
 * 
 * Java������ �ϳ� �̻��� Ŭ������ ��ӹ��� �� �����ϴ�.
 * ������ �������̽��� ����ϸ� ���� ��� ��Ŀ������ ������ �� �ֽ��ϴ�.
 * 
 * [�������̽��� 2�� �̻� �����ϱ�]
 * class Ŭ������ implements �������̽���1, �������̽���2 { ... }
 */
interface iVehicle {
	void vShow();
}

interface iMaterial {
	void mShow();
}

class Car implements iVehicle, iMaterial {
	private int num;
	private double gas;
	
	public Car(int num, double gas) {
		this.num = num;
		this.gas = gas;
	}
	
	// iVehicle �������̽��� �޼ҵ带 �����մϴ�.
	public void vShow() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
	}
	
	// iMaterial �������̽��� �޼ҵ带 �����մϴ�.
	public void mShow() {
		System.out.println("�ڵ����� ������ ö�Դϴ�.");
	}
}


class MultiinhreitanceSample01 {

	public static void main(String[] args) {
		Car c = new Car(1234, 20.5);
		c.vShow();
		c.mShow();

	}

}
