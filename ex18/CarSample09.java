package com.ezen.example;

/**
 * Ŭ����(Class)
 * Ŭ���� ������ �޼ҵ� ����ϱ�
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * Ŭ���� '�ܺ�'���� �޼ҵ带 ȣ���ϴ� �Ͱ� �޸�
 * Ŭ���� '����'���� �޼ҵ带 ȣ���� ������ ���ٸ� ó�� ����
 * ����� �����մϴ�.
 * 
 * (����)������ '��ü �ڽ��� ����'���� �����ϱ� ���� 'this'��� Ű���带 ����մϴ�.
 */
class Car09 {
	int num;
	double gas;

	void show() {
		System.out.println("���� ��ȣ�� " + this.num + "�Դϴ�.");
		System.out.println("������ ���� " + this.gas + "�Դϴ�.");
	}
	
	void showCar() {
		System.out.println("���ݺ��� �ڵ����� ������ ǥ���մϴ�.");
		// Ŭ���� '����'���� �޼ҵ带 ȣ���մϴ�.
		// show();
		
		// '�ڱ� �ڽ�'�� �޼ҵ忡�� 'this'�� ���� �� �ֽ��ϴ�.
		this.show();
	}

}

class CarSample09 {

	public static void main(String[] args) {
		Car09 c = new Car09();
		
		c.num = 1234;
		c.gas = 20.0;
		// Ŭ���� �ܺο��� '�޼ҵ�'�� ȣ���մϴ�.
		c.showCar();

	}

}
