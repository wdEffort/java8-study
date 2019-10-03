package com.ezen.example;

/**
 * final ����ϱ�
 * �ʵ忡 ����ϱ� 
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * ����, �ʵ� �տ� 'final' Ű���带 ���̸�
 * �ش� �ʵ��� ���� ������ �� ���� ���°� �˴ϴ�.
 * ��, �� �ʵ�� ������ �� �ݵ�� '�ʱ�ȭ'�ؾ� �մϴ�.
 * => �̸� ���(Constant)��� �θ��ϴ�.
 */
class Car02 {
	protected int num;
	protected double gas;
	static final int NUM_TIRE = 4; // final Ű���尡 ���� �ʵ带 �����մϴ�.
	
	public Car02() {
		this.num = 0;
		this.gas = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
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

class RacingCar02 extends Car02 {
	private int course;
	
	public RacingCar02() {
		this.course = 0;
		System.out.println("���̽�ī�� ����������ϴ�.");
	}
	
	public void setCourse(int course) {
		this.course = course;
		System.out.println("�ڽ� ��ȣ�� " + course + "�� �߽��ϴ�.");
	}
	
	public void show() {
		System.out.println("�ڽ� ��ȣ�� " + course + "�Դϴ�.");
	}
	

}

class FinalSample02 {

	public static void main(String[] args) {
		// Car02 Ŭ������ ����� ����� ����մϴ�.
		// static final Ű���尡 ���� �ʵ�� Ŭ������.�ʵ������ ���� ���� �� �ֽ��ϴ�.
		System.out.println("Car02 Ŭ������ ����� ����� ���� " + Car02.NUM_TIRE + "�Դϴ�.");

	}

}
