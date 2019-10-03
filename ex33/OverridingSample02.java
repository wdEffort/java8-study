package com.ezen.example;

/**
 * �޼ҵ� �������̵�(Overriding)
 * ���� Ŭ������ ������ ��ü �ٷ��
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 *
 * ���� Ŭ������ ��ü�� ���� Ŭ������ ��ü�� �ٷ� �� �ֽ��ϴ�.
 * �̴�, ���� Ŭ������ ��ü�� ���� Ŭ������ ��ü�̱⵵ �ϱ� �����Դϴ�.
 * 
 * ���� Ŭ������ ������ ���� Ŭ������ ��ü�� ����Ű�� ������ ��
 * ���� Ŭ����, ���� Ŭ������ ������ �޼ҵ带 ȣ���ϴ� ���
 * ���� Ŭ������ �������̵��� �޼ҵ尡 ȣ��˴ϴ�.
 * 
 * ��, ���� Ŭ������ ������ ���� Ŭ������ �ٷ�� �Ǹ�
 * ���� Ŭ�������� ���Ӱ� ������ �޼ҵ�� ȣ���� �� �����ϴ�.
 */
class Car02 {
	protected int num;
	protected double gas;
	
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
		System.out.println("���̽�ī�� ���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
		System.out.println("�ڽ� ��ȣ�� " + course + "�Դϴ�.");
	}

}

class OverridingSample02 {

	public static void main(String[] args) {
		Car02 c; // ���� Ŭ������ ������ �����մϴ�.
		c = new RacingCar02(); // ���� Ŭ������ ��ü�� �����Ͽ� ���� Ŭ������ ������ ����Ű�� �մϴ�.
		
		c.setCar(5678, 28.5);
		
		// c.setCourse(5); // ���� Ŭ������ ������ ���� Ŭ������ �ٷ�� ��� ���� Ŭ������ �ִ� �޼ҵ�� ȣ���� �� �����ϴ�.
		
		c.show(); // ���� Ŭ������ show() �޼ҵ带 ȣ���մϴ�.
		

	}

}
