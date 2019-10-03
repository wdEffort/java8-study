package com.ezen.example;

/**
 * ���(Inheritance)
 * ���� Ŭ���� �ȿ��� �����ϱ� - 01
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * ���� ������ private, public�� ����Ͽ� ����� ���� ������ �����ϴ� ����� ������ϴ�.
 * �θ� Ŭ������ ����� private���� ����Ǿ� �ִ� ��� ������� ���� Ŭ�������� ������ �� �����ϴ�.
 * 
 * private : �� Ŭ���� ���ο����� ��� ����, �ܺο��� ��� �Ұ�
 */
class Car03 {
	private int num;
	private double gas;
	
	public Car03() {
		this.num = 0;
		this.gas = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	public Car03(int num, double gas) {
		this.num = num;
		this.gas = gas;
		System.out.println("���� ��ȣ�� " + num + "�̸�, ������ ���� " + gas + "�� �ڵ����� ����������ϴ�.");
	}
	
	public void setCar(int num, double gas) {
		this.num = num;
		this.gas = gas;
		System.out.println("���� ��ȣ�� " + num + "����, ������ ���� " + gas + "�� �ٲپ����ϴ�.");
	}
	
	public void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
	}
	
}

class RacingCar03 extends Car03 {
	private int course;
	
	public RacingCar03() {
		this.course = 0;
		System.out.println("���̽�ī�� ����������ϴ�.");
	}
	
	public RacingCar03(int num, double gas, int course) {
		super(num, gas);
		this.course = course;
		System.out.println("�ڽ� ��ȣ�� " + course + "�� ���̽�ī�� ����������ϴ�.");
	}
	
	public void setCourse(int course) {
		this.course = course;
		System.out.println("�ڽ� ��ȣ�� " + course + "�� �߽��ϴ�.");
	}
	
	public void newShow() {
		// �̷��� ǥ���� �߸��Ǿ����ϴ�.
		// System.out.println("���̽�ī ���� ��ȣ�� " + num + "�Դϴ�.");
		// System.out.println("���̽�ī ������ ���� " + gas + "�Դϴ�.");
		System.out.println("���̽�ī �ڽ� ��ȣ�� " + course + "�Դϴ�.");
	}

}

class ExtendsSample03 {

	public static void main(String[] args) {
		

	}

}
