package com.ezen.example;

/**
 * ���� Ŭ������ ���� �̸��� ���(�ʵ�, �޼ҵ�) ����ϱ�
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * ���� Ŭ���� �ȿ��� �޼ҵ� �̸� �տ� 'super.'�� ���̰� ȣ���ϸ�
 * ���� Ŭ������ �޼ҵ带 ȣ���� �� �ֽ��ϴ�.
 * 
 * ���� Ŭ������ ���� Ŭ������ ���� �̸��� �ʵ尡 �ִ� ���
 * ���� Ŭ������ �ʵ忡 �����Ϸ��� ���� �̸� �տ� 'super.'�� ���̸� �˴ϴ�.
 */
class Car01 {
	protected int num;
	protected double gas;
	int x; // ���� Ŭ������ x�� �ֽ��ϴ�.
	
	public Car01() {
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

class RacingCar01 extends Car01 {
	private int course;
	int x; // ���� Ŭ�������� x�� �ֽ��ϴ�.
	
	public RacingCar01() {
		this.course = 0;
		System.out.println("���̽�ī�� ����������ϴ�.");
	}
	
	public void setCourse(int course) {
		this.course = course;
		System.out.println("�ڽ� ��ȣ�� " + course + "�� �߽��ϴ�.");
	}
	
	public void show() {
		x = 10;
		super.x = 20; // ���� Ŭ������ �ʵ��Դϴ�.
		super.show(); // ���� Ŭ������ show() �޼ҵ尡 ȣ��˴ϴ�.
		System.out.println("�ڽ� ��ȣ�� " + course + "�Դϴ�.");
	}

}

class SuperUseSample01 {

	public static void main(String[] args) {
		RacingCar01 rc = new RacingCar01();
		rc.setCar(1234, 20.5);
		rc.setCourse(3);
		rc.show();
		

	}

}
