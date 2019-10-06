package com.ezen.example;

/**
 * �������̽� Ȯ���ϱ�
 * 
 * @author yoman
 * 
 * 2019. 10. 06
 *
 * �������̽��� Ŭ������ ���������� 'extends' Ű���带 ����Ͽ�
 * Ȯ���ؼ� ���ο� �������̽��� ������ �� �ֽ��ϴ�.
 * 
 * Ȯ��Ǵ� �������̽��� ���� �������̽�(Super Interface)
 * Ȯ���ϴ� �������̽��� ���� �������̽�(Sub Interface)��� �մϴ�.
 * 
 * ��, ���� �������̽��� �����ϴ� ��쿡��
 * ���� �������̽� �޼ҵ� ���� �����ؾ� �մϴ�.
 */
interface iMovable {
	void move();
}

interface iVehicle extends iMovable {
	void show();
}

class Car implements iVehicle {
	private int num;
	private double gas;
	
	public Car(int num, double gas) {
		this.num = num;
		this.gas = gas;
	}
	
	// iVehicle(���� �������̽�) �������̽��� �޼ҵ带 �����մϴ�.
	public void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
	}
	
	// iMovable(���� �������̽�) �������̽��� �޼ҵ带 �����մϴ�.
	public void move() {
		System.out.println("�ڵ����� �����Դϴ�.");
	}
}

class InterfaceExtendsSample01 {

	public static void main(String[] args) {
		Car c = new Car(1234, 20.5);
		c.show();
		c.move();

	}

}
