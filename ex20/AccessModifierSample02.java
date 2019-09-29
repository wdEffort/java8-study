package com.ezen.example;

/**
 * private ���� ������ ����ϱ�
 * private ���
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * Sample01���� ������ ���� �������� �Ǿ���� ������ ��� ������?
 * => ����� �ƹ��� ������ ���� ������ �����߱� ����
 * 
 * Java������ �̷� �Ǽ��� ���� �ʵ��� Ŭ���� �ܺο��� �������� ���� �� �� ����
 * ����� ����� ����� �����ϴµ� �ٷ� 'private ���'�Դϴ�. (=> ĸ��ȭ[Encapsulation])
 */
class Car02 {
	// �ʵ� ����� �ڷ��� �տ� 'private' Ű���带 �ٿ��־����ϴ�.
	// �̷ν� Ŭ���� �ܺο��� �ʵ忡 ������ �� ���� �Ǿ����ϴ�.
	private int num;
	private double gas;
	
	void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
	}
}

class AccessModifierSample02 {

	public static void main(String[] args) {
		Car02 c = new Car02();
		
		// Car02 Ŭ���� �ܺο��� ���� num, gas �ʵ忡 ���� �� �� �����ϴ�.
		// c.num = 1234;
		// c.gas = -10.0;

	}

}
