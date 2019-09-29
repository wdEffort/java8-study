package com.ezen.example;

/**
 * ������(Constructor)
 * �����ڿ� ���� ������ ���̱�
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * �����ڿ��� ���� �����ڸ� ������ �� �ֽ��ϴ�.
 * �⺻ �����ڸ� private�� ������ ���
 * �� �����ڸ� �̿��Ͽ� ��ü�� ���� �� �����ϴ�.  
 */
class Car05 {
	int num;
	double gas;
	
	private Car05() {
		num = 0;
		gas = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}

	public Car05(int n, double g) {
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

class ConstructorSample05 {

	public static void main(String[] args) {
		// �⺻ �����ڸ� �̿��Ͽ� ��ü�� ���� �� �����ϴ�.
		// Car03 audi = new Car03();	
		
		// �� ���, Car03 Ŭ������ ��ü�� �����ϱ� ���ؼ���
		// �ݵ�� �μ� �� ���� ������ �����ڰ� ȣ��Ǿ�� �մϴ�.
		Car03 bmw = new Car03(1234, 10.0);
		bmw.show();
	
	}

}
