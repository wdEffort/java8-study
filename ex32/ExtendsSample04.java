package com.ezen.example;

/**
 * ���(Inheritance)
 * ���� Ŭ���� �ȿ��� �����ϱ� - 02
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * ���� Ŭ�������� ���� Ŭ������ private ����� �����ϱ� ���ؼ��� 
 * ���� �����ڸ� �������־���մϴ�.
 * 
 * 'protected'��� �����ڸ� ����ϸ� ���� Ŭ�������� ������ �����մϴ�.
 * 
 * protected : ���� Ŭ������ �����Ͽ� '������ ��Ű��'�� ���ϴ� Ŭ�������� ���� ����
 */
class Car04 {
	// ���� �����ڸ� 'protected'�� �����߽��ϴ�.
	protected int num;
	protected double gas;
	
	public Car04() {
		this.num = 0;
		this.gas = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	public Car04(int num, double gas) {
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

class RacingCar04 extends Car04 {
	private int course;
	
	public RacingCar04() {
		this.course = 0;
		System.out.println("���̽�ī�� ����������ϴ�.");
	}
	
	public RacingCar04(int num, double gas, int course) {
		super(num, gas);
		this.course = course;
		System.out.println("�ڽ� ��ȣ�� " + course + "�� ���̽�ī�� ����������ϴ�.");
	}
	
	public void setCourse(int course) {
		this.course = course;
		System.out.println("�ڽ� ��ȣ�� " + course + "�� �߽��ϴ�.");
	}
	
	public void newShow() {
		// ���� Ŭ���������� ���� Ŭ���� protected ����� ������ �����մϴ�.
		System.out.println("���̽�ī ���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("���̽�ī ������ ���� " + gas + "�Դϴ�.");
		System.out.println("���̽�ī �ڽ� ��ȣ�� " + course + "�Դϴ�.");
	}

}

class ExtendsSample04 {

	public static void main(String[] args) {
		RacingCar04 rc = new RacingCar04();
		rc.newShow();

	}

}
