package com.ezen.example;

/**
 * ������(Constructor)
 * ������ �����ε�
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * ������ ���� �μ��� ��(type)�� ������ �ٸ���
 * �����ε��� �����մϴ�.
 * 
 * �����ڸ� ���� �� �����ϸ� �پ��� �μ��� �����Ͽ� 
 * ��ü ������ �����ϰ� Ȱ���� �� �ֽ��ϴ�.
 * => ��ü ����� �پ��� �ʱ�ȭ ���� ó���� �����մϴ�.
 */
class Car02 {
	int num;
	double gas;
	
	public Car02() {
		num = 0;
		gas = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	// �μ��� ������ �ٸ� �����ڸ� ��������ϴ�.
	public Car02(int n, double g) {
		num = n;
		gas = g;
		System.out.println("���� ��ȣ�� " + num + "�̸�, ������ ���� " + gas + "�� �ڵ����� ����������ϴ�.");
	}
	
	public void show() {
		System.out.println("�ڷ� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
	}
	
}

class ConstructorSample02 {

	public static void main(String[] args) {
		// ��ü ������ �μ��� ���� �����ڰ� ȣ��˴ϴ�.
		Car02 audi = new Car02();
		audi.show();
		
		System.out.println();
		
		
		// ��ü ������ �μ��� �� ���� �����ڰ� ȣ��˴ϴ�.
		Car02 bmw = new Car02(1234, 25.5);
		bmw.show();
	}

}
