package com.ezen.example;

/**
 * ���� ������
 * ���ܸ� �޾Ƴ��� �ʴ� ���
 * 
 * @author yoman
 * 
 * 2019. 10. 09
 * 
 * ���ܸ� �޾Ƴ��� �ʴ� ��� ���α׷��� �����߿� ����˴ϴ�.
 * �̸� �����ϱ� ���ؼ��� 
 * Ŭ���� ����ڰ� 'throws�� ���� �޼ҵ�'�� ����� ��
 * �ݵ�� �� �۾� �� �ϳ��� �����ؼ� �����ؾ� �մϴ�.
 * 
 * 1. try ~ catch�� ����Ͽ� �ش� �޼ҵ忡�� ���ܸ� ó��
 * 2. �޼ҵ� �̸� �ڿ� throws�� �ٿ��� �� �޼ҵ��� 'ȣ�� �޼ҵ�'�� ���� ó���� ����
 * 
 * 2�� ó���� ������ ���
 * ����, ȣ�� �޼ҵ尡 main() �޼ҵ��� ��� 
 * �Ž��� �ö� �޼ҵ尡 �����Ƿ� ���α׷��� ������ ����˴ϴ�.
 */
class CarException02 extends Exception { 

}

class Car02 {
	private int num;
	private double gas;

	public Car02() {
		this.num = 0;
		this.gas = 0.0;
	}

	public void setCar(int num, double gas) throws CarException02 {
		if (gas < 0) {
			CarException02 e = new CarException02();
			throw e;
		} else {
			this.num = num;
			this.gas = gas;
			System.out.println("���� ��ȣ�� " + num + "����, ���� ���� " + gas + "�� �ٲپ����ϴ�.");
		}

	}

	public void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
	}

}

class ExceptionClassSample02 {

	// main() �޼ҵ忡 ���� ó���� �����ϴ� ��� ���α׷��� ����˴ϴ�.
	public static void main(String[] args) throws CarException02 {
		Car02 car = new Car02();
		car.setCar(1234, -10.0);
		car.show();

	}

}
