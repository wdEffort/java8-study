package com.ezen.example;

/**
 * �޼ҵ� �������̵�(Overriding)
 * �������̵��� �߿伺
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * �ڵ� �ȿ��� �پ��� Ŭ������ ��ü�� �����ؾ� �ϴ� ��찡 �ֽ��ϴ�.
 * �̷��� ��� '���� Ŭ������ �迭'�� �غ��ϰ� ��ü�� �ٷ� �� �ֽ��ϴ�.
 * 
 * ��, ���� Ŭ���� �迭 ������ ���� Ŭ���� ��ü�� ���� Ŭ���� ��ü�� �Բ� �ٷ� �� �ֽ��ϴ�.
 * 
 * ���� Ŭ����, ���� Ŭ������ �����ϰ� ���ǵ� �޼ҵ带 ȣ���ϴ� ���
 * �迭�� ��� �� ��ü '������ �޼ҵ�'�� ȣ��˴ϴ�.(=> ������[Polymorphism])
 * 
 * [����]
 * Overloading : �޼ҵ� �̸��� ������ �μ��� ���� ������ �ٸ� �޼ҵ带 �����ϴ� �� 
 * Overriding : �޼ҵ� �̸�, �μ��� ���� �������� �����ϰ� �����ϴ� ��
 */
class Car03 {
	protected int num;
	protected double gas;
	
	public Car03() {
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

class RacingCar03 extends Car03 {
	private int course;
	
	public RacingCar03() {
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

class OverridingSample03 {

	public static void main(String[] args) {
		// ���� Ŭ������ �迭�� �غ��մϴ�.
		Car03[] cars = new Car03[2];
		
		// ���� Ŭ���� ��ü�� �����մϴ�.
		cars[0] = new Car03();
		cars[0].setCar(1234, 20.5);
		
		// ���� Ŭ���� ��ü�� �����մϴ�.
		cars[1] = new RacingCar03();
		cars[1].setCar(4567, 30.5);
		
		System.out.println();
		
		for (int i = 0; i < cars.length; i++) {
			// ��ü�� Car03 Ŭ���� ��ü�� ��� ���� Ŭ������ show() �޼ҵ尡 ȣ��ǰ�
			// ��ü�� RacingCar03 Ŭ���� ��ü�� ��� ���� Ŭ������ show() �޼ҵ尡 ȣ��˴ϴ�.
			cars[i].show();
			System.out.println();
		}
		
	}

}
