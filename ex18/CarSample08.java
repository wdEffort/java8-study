package com.ezen.example;

/**
 * Ŭ����(Class)
 * this�� ���� �˾ƺ���
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * Car08 Ŭ���� '�ܺ�'���� �ʵ忡 �����ϴ� ��� '.'�� ����߽��ϴ�.
 * �̴� Ŭ���� �ٱ����� �ʵ带 ����� ��� � Ŭ������ ������
 * ����Ű�� �ִ� ��ü�� �ʵ����� Ȯ���� �ϱ� �����Դϴ�.
 * 
 * ����, Car08 Ŭ���� '����'���� �ʵ带 ����� ��� 
 * �ʵ� �տ� �ƹ��͵� ������ �ʽ��ϴ�.
 * 
 * (����)������ '��ü �ڽ��� ����'���� �����ϱ� ���� 'this'��� Ű���带 ����մϴ�.
 */
class Car08 {
	int num;
	double gas;

	void show() {
		// Ŭ���� ���ο��� �ʵ带 ����� ��� �ƹ��͵� ������ �ʽ��ϴ�.
		// System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		// System.out.println("������ ���� " + gas + "�Դϴ�.");
		
		// '�ڱ� �ڽ�'�� �ʵ忡�� 'this'�� ���� �� �ֽ��ϴ�.
		System.out.println("���� ��ȣ�� " + this.num + "�Դϴ�.");
		System.out.println("������ ���� " + this.gas + "�Դϴ�.");

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
