package com.ezen.example;

/**
 * ���� ������
 * ���� Ŭ���� �����ϱ�
 * 
 * @author yoman
 * 
 * 2019. 10. 09
 * 
 * ���ܸ� �߻���Ű��(������) �ڵ带 �ۼ��ϴ� �� ���� �����մϴ�.
 * ���ܸ� ������ Ŭ������ �����ϸ� �� Ŭ������ �̿��ϴ� �������
 * ���� ó���� ������ �� �ֽ��ϴ�.
 * 
 * �̸� ���� ���� �ڽŸ��� ���� Ŭ������ ����� ����� �н��� ���ڽ��ϴ�.
 * 
 * �ڽŸ��� ���� Ŭ������ ����� ���ؼ��� 
 * 'Throwable Ŭ������ ���� Ŭ����'�� Ȯ��(Extends)�� ���� Ŭ������ �����ؾ� �մϴ�.
 */

// Exception Ŭ������ ��ӹ޾Ƽ� �������� ���� Ŭ������ �����մϴ�.
// Exception Ŭ������ Throwable Ŭ������ ����Ŭ���� �Դϴ�.
class CarException extends Exception { // ���� �߻��� Ȱ���� �� �ֽ��ϴ�.
	
	
}

class Car {
	private int num;
	private double gas;
	
	public Car() {
		this.num = 0;
		this.gas = 0.0;
	}

	// 'throws' Ű���带 ����Ͽ� ���ܸ� ������ �޼ҵ����� �����մϴ�.
	public void setCar(int num, double gas) throws CarException {
		// gas ���� 0 �̸��� ��� CarException ��ü�� ������ �� ���ܸ� �����ϴ�.
		if (gas < 0) {
			CarException e = new CarException();
			throw e; // ���ܸ� ���� ������ 'throw' Ű���带 ����մϴ�.
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

class ExceptionClassSample01 {
	public static void main(String[] args) {
		Car car = new Car();
		
		try {
			car.setCar(1234, -10.0); // setCar() �޼ҵ� ȣ��� ���ܰ� �������ϴ�.
		} catch(CarException e) {
			System.out.println(e + "(��)�� ���������ϴ�.");
		}
		
		car.show();
	}
}