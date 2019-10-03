package com.ezen.example;

/**
 * �޼ҵ� �������̵�(Overriding)
 * �������̵��� ����
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * Java������ ��� ���谡 �ִ� Ŭ���� �� 
 * ���� Ŭ�������� ���� Ŭ������ ������ '������ �޼ҵ�'�� �����ϰ�
 * ���� Ŭ������ �޼ҵ带 ����ϴ� ����� �ֽ��ϴ�.
 * �̷��� ����� �޼ҵ� �������̵��̶�� �մϴ�.
 * => ������ �޼ҵ��, ���� ���� ��, �μ��� ����
 * 
 * �̷��� ���� Ŭ������ ���� Ŭ������ ��� ���ǵǾ� �ִ� �޼ҵ带 ȣ���� ���
 * ���� Ŭ�������� ���Ӱ� ������ �޼ҵ尡 ȣ��˴ϴ�.
 */
class Car01 {
	protected int num;
	protected double gas;
	
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
	
	public RacingCar01() {
		this.course = 0;
		System.out.println("���̽�ī�� ����������ϴ�.");
	}
	
	public void setCourse(int course) {
		this.course = course;
		System.out.println("�ڽ� ��ȣ�� " + course + "�� �߽��ϴ�.");
	}
	
	public void show() {
		System.out.println("���̽�ī�� ���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
		System.out.println("�ڽ� ��ȣ�� " + course + "�Դϴ�.");
	}

}

class OverridingSample01 {

	public static void main(String[] args) {
		RacingCar01 rc = new RacingCar01();
		rc.setCar(1234, 20.5);
		rc.setCourse(5);
		rc.show(); // ���� Ŭ������ show() �޼ҵ尡 ȣ��˴ϴ�.

	}

}
