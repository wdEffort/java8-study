package com.ezen.example;

/**
 * ���� ��° �������� - 01
 * 
 * @author yoman
 * 
 * 2019. 09. 30
 * 
 * �߸��� �ڵ带 ��ġ����.
 */
class Car {
	int num;
	double gas;
	
	void setNumGas(int n, double g) {
		num = n;
		gas = g;
		System.out.println("���� ��ȣ�� " + num + "����, ������ ���� " + gas + "���� �ٲپ����ϴ�.");
	}
	
	void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
	}
}

class Practice01 {

	public static void main(String[] args) {
		Car car1 = new Car();
		// Ŭ���� �ܺο��� ����� �����ϱ� ���ؼ��� Ŭ������ ������ ����ؾ� �մϴ�.
		// setNumGas(1234, 20.5); // ERROR
		car1.setNumGas(1234, 20.5);
		car1.show();

	}

}
