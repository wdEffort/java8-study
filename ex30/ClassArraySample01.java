package com.ezen.example;

/**
 * ��ü �迭
 * 
 * @author yoman
 * 
 * 2019. 10. 01
 *
 * Java������ ���� Ŭ�������� ��ü���� ��� �ѹ��� �ٷ絵�� ��ü �迭�� �����մϴ�.
 */

class Car {
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("���� ��ȣ�� " + num + "����, ������ ���� " + gas + "�� �ٲپ����ϴ�.");
	}
	
	public void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
	}
}

class ClassArraySample01 {

	public static void main(String[] args) {
		Car[] cars; // Car[]�� ������ �غ��մϴ�.
		cars = new Car[3]; // Car�� �迭 ��Ҹ� 3�� �����մϴ�.
		
		// �迭 ���̸�ŭ Car�� ��ü�� �����մϴ�.
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();
		}
		
		cars[0].setCar(1234, 25.5);
		cars[1].setCar(5678, 30.5);
		cars[2].setCar(9012, 35.5);
		
		for (int i = 0; i < cars.length; i++) {
			cars[i].show();
		}
		
	}

}
