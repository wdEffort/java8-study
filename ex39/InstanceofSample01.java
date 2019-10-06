package com.ezen.example;

/**
 * instanceof ������
 * 
 * @author yoman
 * 
 * 2019. 10. 06
 *
 * ��ü�� Ŭ������ �˾Ƴ��� ���� 
 * instanceof �����ڿ� ���� �н��մϴ�.
 * 
 * Ư�� Ŭ������ ��ü���� ������ ó���� �ؾ��ϴ� ���,
 * �� �����ڸ� ����ϸ� ���մϴ�.
 * 
 * [����]
 * ��ü�� ����Ű�� ������ instanceof Ŭ������
 */
abstract class Vehicle {
	protected int speed;
	
	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("�ӵ��� " + speed + "�� �����߽��ϴ�.");
	}
	
	// �߻� �޼ҵ忡�� ��ü(���� ����)�� �����ϴ�.
	abstract void show();
}

// �ڵ��� Ŭ������ �����մϴ�.
class Car extends Vehicle {
	private int num;
	private double gas;
	
	public Car(int num, double gas) {
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
class Plane extends Vehicle {
	private int flight;
	
	public Plane(int flight) {
		this.flight = flight;
		System.out.println("����� ��ȣ�� " + flight + "�� ����Ⱑ ����������ϴ�.");
	}
	
	// �߻� Ŭ���� Vehicle02�� �߻� �޼ҵ带 �����մϴ�.
	public void show() {
		System.out.println("����� ��ȣ�� " + flight + "�Դϴ�.");
		System.out.println("�ӵ��� " + speed + "�Դϴ�.");
	}
}

class InstanceofSample01 {

	public static void main(String[] args) {
		Vehicle[] vc = new Vehicle[2];
		
		vc[0] = new Car(1234, 20.5);
		vc[0].setSpeed(60);
		
		vc[1] = new Plane(232);
		vc[1].setSpeed(500);
		
		for(int i = 0; i < vc.length; i++) {
			// ��ü�� Car Ŭ�������� ���θ� Ȯ���մϴ�.
			if(vc[i] instanceof Car) {
				System.out.println((i + 1) + "��° ��ü�� Car Ŭ�����Դϴ�.");
			} else {
				System.out.println((i + 1) + "��° ��ü�� Car Ŭ������ �ƴմϴ�.");
			}
		}
		
	}

}
