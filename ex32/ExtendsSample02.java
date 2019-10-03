package com.ezen.example;

/**
 * ���(Inheritance)
 * ���� Ŭ������ ������ �����ϱ�
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * ���� Ŭ������ ��ü�� ������ ���
 * ���� Ŭ������ ������ ȣ�⿡ �ռ�,
 * ���� Ŭ������ �μ� ���� �����ڰ� �ڵ������� ȣ��˴ϴ�.
 * 
 * �׷��� ���� Ŭ������ �����ڰ� ���� �� �����Ѵٸ�
 * ȣ��Ǵ� �����ڸ� ��������� ������ ���� �ֽ��ϴ�.
 * �̶� 'super()' Ű���带 ����մϴ�.
 * 
 * this() : �� Ŭ������ �ٸ� �����ڸ� ȣ��
 * super() : ���� Ŭ������ �����ڸ� ȣ��
 */
class Car02 {
	private int num;
	private double gas;
	
	public Car02() {
		this.num = 0;
		this.gas = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	public Car02(int num, double gas) {
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

class RacingCar02 extends Car02 {
	private int course;
	
	public RacingCar02() {
		this.course = 0;
		System.out.println("���̽�ī�� ����������ϴ�.");
	}
	
	public RacingCar02(int num, double gas, int course) {
		// ���� Ŭ������ �����ϴ� 2���� �μ��� �޴� �����ڸ� ȣ���մϴ�.
		// this()�� ����� ���� ���������� ���� �� �κп� ��ġ�ؾ� �մϴ�.(=> �̷� ������ this()�� super()�� ���ÿ� ����� �� �����ϴ�.)
		super(num, gas);
		this.course = course;
		System.out.println("�ڽ� ��ȣ�� " + course + "�� ���̽�ī�� ����������ϴ�.");
	}
	
	public void setCourse(int course) {
		this.course = course;
		System.out.println("�ڽ� ��ȣ�� " + course + "�� �߽��ϴ�.");
	}

}

class ExtendsSample02 {

	public static void main(String[] args) {
		RacingCar02 rc = new RacingCar02(1234, 20.5, 5);

	}

}
