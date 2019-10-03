package com.ezen.example;

/**
 * final ����ϱ�
 * �޼ҵ忡 ����ϱ�
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * final�� �ǹ� : '�� �̻� ������ �� ����'
 * 
 * ���� Ŭ������ �޼ҵ� �߿����� ���� Ŭ��������
 * ���� �������̵��Ǹ� �ȵǴ� �޼ҵ尡 ���� �� �ֽ��ϴ�.
 * 
 * �̷� ���, ���� Ŭ������ �޼ҵ� �տ� 'final'�� ���̸�
 * �������̵����� �ʵ��� ���� �� �ֽ��ϴ�.
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
	
	// ���� Ŭ������ �޼ҵ忡 'final' Ű���带 �߰��մϴ�.
	// �� �޼ҵ�� ���̻� �������̵��� �� �����ϴ�.
	public final void show() {
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
	
	/* ���� Ŭ�������� show() �޼ҵ带 �������̵��� �� �����ϴ�.
	public void show() {
		System.out.println("�ڽ� ��ȣ�� " + course + "�Դϴ�.");
	}
	*/

}

class FinalSample01 {

	public static void main(String[] args) {
		
		
	}

}
