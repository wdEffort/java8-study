package com.ezen.example;

/**
 * �ϰ� ��° �������� - 01
 * 
 * @author yoman
 * 
 * 2019. 09. 30
 * 
 * �߸��� �ڵ带 ��ġ����.
 */
class Car {
	// Ŭ���� ������ �����մϴ�.
	public static int sum = 0;
	
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("���� ��ȣ�� " + num + "����, ������ ���� " + gas + "���� �ٲپ����ϴ�.");
	}

	// Ŭ���� �޼ҵ带 �����մϴ�.
	public static void showSum() {
		System.out.println("�ڵ����� ��� " + sum + "�� �ֽ��ϴ�.");
		
		// Ŭ���� �޼ҵ� �ȿ����� �ν��Ͻ� ����� ������ �� �����ϴ�.
		// show(); // ERROR
	}
	
	public void show() {
		System.out.println("�ڷ� ��ȣ�� " + num + "�Դϴ�");
		System.out.println("������ ���� " + gas + "�Դϴ�");
	}
	
}

class Practice01 {

	public static void main(String[] args) {
		Car.showSum();
		
		Car audi = new Car();
		audi.setCar(1234, 25.5);
		
		Car.showSum();
		
		Car bmw = new Car();
		bmw.setCar(5678, 27.5);
		
		Car.showSum();

	}

}
