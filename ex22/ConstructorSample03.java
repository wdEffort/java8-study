package com.ezen.example;

/**
 * ������(Constructor)
 * ������ �ȿ��� �ٸ� ������ ȣ���ϱ�
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * Ư�� ������ �ȿ��� 
 * Ư���� �ٸ� �����ڸ� ȣ���� �� �ֽ��ϴ�.
 * ��, ������ �ڵ� �ȿ��� ���� ���� ȣ��Ǿ�� �մϴ�.
 */
class Car03 {
	int num;
	double gas;
	
	public Car03() {
		num = 0;
		gas = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}

	public Car03(int n, double g) {
		this(); // �������� ���� �κп��� �μ��� ���� �����ڸ� ȣ���մϴ�.
		num = n;
		gas = g;
		System.out.println("���� ��ȣ�� " + num + "����, ������ ���� " + gas + "�� �ٲپ����ϴ�.");
	}
	
	public void show() {
		System.out.println("�ڷ� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
	}
	
}

class ConstructorSample03 {

	public static void main(String[] args) {
		Car03 audi = new Car03();
		audi.show();
		
		System.out.println();
		
		Car03 bmw = new Car03(1234, 10.0);
		bmw.show();
	
	}

}
