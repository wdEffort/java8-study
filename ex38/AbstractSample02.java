package com.ezen.example;

/**
 * �߻� Ŭ����(Abstract class)
 * �߻� Ŭ���� ����ϱ�
 * 
 * @author yoman
 * 
 * 2019. 10. 06
 *
 * �߻� Ŭ�����δ� ��ü�� ������ �� �����ϴ�.
 * �׷��� �߻� Ŭ������ ��ӹ��� ���� Ŭ������ ��ü�� ������ �� �ֽ��ϴ�.
 * ��, ������ �ֽ��ϴ�.
 * 
 * [����]
 * 1. �߻� �޼ҵ带 ���� Ŭ�������� �ݵ�� �������̵��ؼ� �����ؾ� ��
 */
abstract class Vehicle02 {
	protected int speed;
	
	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("�ӵ��� " + speed + "�� �����߽��ϴ�.");
	}
	
	// �߻� �޼ҵ忡�� ��ü(���� ����)�� �����ϴ�.
	abstract void show();
}

// �ڵ��� Ŭ������ �����մϴ�.
class Car02 extends Vehicle02 {
	private int num;
	private double gas;
	
	public Car02(int num, double gas) {
		this.num = num;
		this.gas = gas;
		System.out.println("�ڷ� ��ȣ " + num + ", ���� �� " + gas + "�� �ڵ����� ����������ϴ�.");
	}
	
	// �߻� Ŭ���� Vehicle02�� �߻� �޼ҵ带 �����մϴ�.
	public void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("���� ���� " + gas + "�Դϴ�.");
		System.out.println("�ӵ��� " + speed + "�Դϴ�.");
	}
}

// ����� Ŭ������ �����մϴ�.
class Plane02 extends Vehicle02 {
	private int flight;
	
	public Plane02(int flight) {
		this.flight = flight;
		System.out.println("����� ��ȣ�� " + flight + "�� ����Ⱑ ����������ϴ�.");
	}
	
	// �߻� Ŭ���� Vehicle02�� �߻� �޼ҵ带 �����մϴ�.
	public void show() {
		System.out.println("����� ��ȣ�� " + flight + "�Դϴ�.");
		System.out.println("�ӵ��� " + speed + "�Դϴ�.");
	}
}

class AbstractSample02 {

	public static void main(String[] args) {
		// �߻� Ŭ���� �迭�� �غ��մϴ�.
		// �߻� Ŭ������ ��ü�� ���� ���� ������, 
		// �� Ŭ������ ������ �迭�� ���� Ŭ������ ��ü�� ���� �� �ֽ��ϴ�.
		Vehicle02[] vc;
		vc = new Vehicle02[2];
		
		vc[0] = new Car02(1234, 20.5); // Car02 Ŭ���� ��ü�� �����մϴ�.
		vc[0].setSpeed(60);
		
		vc[1] = new Plane02(232); // Plane02 Ŭ���� ��ü�� �����մϴ�.
		vc[1].setSpeed(500);
		
		System.out.println();
		
		for(int i = 0; i < vc.length; i++) {
			vc[i].show(); // �� ��ü�� ����� show() �޼ҵ尡 ȣ��˴ϴ�.
			System.out.println();
		}

	}

}
