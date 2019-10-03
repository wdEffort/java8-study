package com.ezen.example;

/**
 * ���(Inheritance)
 * Ŭ������ Ȯ��(Extends)
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * ���α׷� ���� �� �̹� ������� �ڵ���� Ȯ���Ű��
 * ������ �������� ���� �ֽ��ϴ�.
 * 
 * Java������ �̹� ����� Ŭ������ �������� ���ο� Ŭ������ ���� �� �ֵ���
 * �����ϴµ�, �̸� Ȯ��(Extends) �Ǵ� ���(Inheritance)��� �մϴ�.
 * 
 * ���� Ŭ������ ��ӹ��� Ŭ������ �ڽ�(Sub)�� �θ�(Super)�� ���踦 ������ �Ǹ�,
 * �θ��� ����� '�����޾�' �����ϰԲ� �Ǿ� �ֽ��ϴ�.(=> �θ��� ����� ���� �ۼ��� �ʿ䰡 �����ϴ�.)
 * ����, ���ο� ����� �߰��ؼ� �ڵ带 �ۼ��� �� �ֽ��ϴ�.
 */

// ���� Ŭ������ �����մϴ�.
class Car01 {
	private int num;
	private double gas;
	
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

// ���� Ŭ������ �����մϴ�.
// RacingCar01 Ŭ������ Car01 Ŭ������ ��ӹ޽��ϴ�.
// �̶� 'extends' Ű���带 ����մϴ�.
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

}

class ExtendsSample01 {
	
	public static void main(String[] args) {
		// RacingCar01 Ŭ������ ��ü�� �����մϴ�.
		RacingCar01 rc = new RacingCar01();
		
		// Car01 Ŭ������ ��ӹ޾����Ƿ�, Car01�� �ִ� setCar() �޼ҵ带 ȣ���� �� �ֽ��ϴ�.
		rc.setCar(1234, 20.5);
		
		// RacingCar01�� setCourse() �޼ҵ带 �����մϴ�.
		rc.setCourse(1);
		
	}
}
