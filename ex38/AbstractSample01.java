package com.ezen.example;

/**
 * �߻� Ŭ����(Abstract class)
 * �߻� Ŭ������?
 * 
 * @author yoman
 * 
 * 2019. 10. 06
 *
 * Java������ �߻� Ŭ������� ���� �����մϴ�.
 * �߻� Ŭ������ ������ ������ 'abstract' ���� �����ڰ� �ٽ��ϴ�.
 * 
 * Ư¡
 * 1. ��ü�� ������ �� ����
 * 2. ��ü�� ���� �޼ҵ带 ����(=> �߻� �޼ҵ�)
 *
 * [�߻� Ŭ������ ����]
 * abstract class Ŭ������ {
 *    �ʵ� ����;
 *    abstract ������ �޼ҵ��(�μ� ���);
 * }
 * 
 */
abstract class Vehicle01 {
	protected int speed;
	
	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("�ӵ��� " + speed + "�� �����߽��ϴ�.");
	}
	
	// �߻� �޼ҵ忡�� ��ü(���� ����)�� �����ϴ�.
	abstract void show();
}

class AbstractSample01 {

	public static void main(String[] args) {
		Vehicle01 vc;
		// �߻� Ŭ�����δ� ��ü�� ������ �� �����ϴ�.
		// vc = new Vehicle01(); // ERROR 

	}

}
