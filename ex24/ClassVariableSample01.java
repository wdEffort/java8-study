package com.ezen.example;

/**
 * �ν��Ͻ�(Instance) ������ �޼ҵ�, Ŭ����(Class) ������ �޼ҵ�
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * 1. �ν��Ͻ� ������ �޼ҵ�
 * => ��ü�� �����ǰ� ���� ���� �����ϰų� ȣ���� �� �ִ� Ŭ������ ���
 * => �� ��ü�� ����� �ʵ�, �޼ҵ�
 * 
 * 2. Ŭ���� ������ �޼ҵ�
 * => ��ü�� ����Ǿ����� �ʰ� Ŭ���� ��ü�� ����Ǿ� �ִ� �ʵ�, �޼ҵ�
 * 
 * Ŭ���� ������ �޼ҵ带 ������ ������ 'static'�̶�� �����ڸ� �ٿ��� �մϴ�.
 * 
 * Ŭ���� ������ �޼ҵ�� ��ü�� �������� �ʰ� 
 * 'Ŭ������.���� �Ǵ�  Ŭ����.�޼ҵ�(�μ� ���)'ó�� �����ؼ� ����� �����մϴ�.
 */
class Car01 {
	public static int sum = 0; // Ŭ���� ����(�� ��ü�� '����'�ϴ� �ʵ尡 �˴ϴ�.)
	private int num;
	private double gas;
	
	public Car01() {
		num = 0;
		gas = 0.0;
		sum++; // �����ڰ� ȣ��� �� Ŭ���� ���� sum�� ���� 1 ������ŵ�ϴ�.
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("���� ��ȣ�� " + num + "����, ������ ���� " + gas + "�� �ٲپ����ϴ�.");
	}
	
	public void show() {
		System.out.println("�ڷ� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
	}
	
	public static void showSum() {
		System.out.println("�ڵ����� ��� " + sum + "�� �ֽ��ϴ�.");
	}
}

class ClassVariableSample01 {

	public static void main(String[] args) {
		// Ŭ���� �޼ҵ带 ȣ���մϴ�.
		Car01.showSum();
		
		System.out.println();
		
		Car01 audi = new Car01();
		audi.setCar(1234, 28.5);
		Car01.showSum();
		
		System.out.println();
		
		Car01 bmw = new Car01();
		bmw.setCar(5678, 33.0);
		Car01.showSum();
		
	}

}
