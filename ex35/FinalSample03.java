package com.ezen.example;

/**
 * final ����ϱ�
 * Ŭ������ ����ϱ�
 * 
 * @author yoman
 * 
 * 2019. 10. 03
 * 
 * ����, ���� Ŭ���� ��ü�� ���� �� ���� Ŭ������ �����ؾ� �ϴ� ���
 * Ŭ���� �� �κп� 'final' Ű���带 ���̸� ���̻� ���� Ŭ������ 
 * ���� �� ���� ���°� �˴ϴ�.
 */
final class Car03 {
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

/* �� �̻� ���� Ŭ������ ���� �� �����ϴ�.
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
		System.out.println("�ڽ� ��ȣ�� " + course + "�Դϴ�.");
	}

}
*/

class FinalSample03 {

	public static void main(String[] args) {
		

	}

}
