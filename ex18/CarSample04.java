package com.ezen.example;

/**
 * Ŭ����(Class)
 * Ŭ������ ����ϴ� ���α׷� �ۼ��غ���
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * Ŭ������ �����
 * 1. Ŭ������ �����ϰ�
 * 2. ��ü�� �����
 * 3. ����� �����ؼ� ���α׷��� �ۼ��մϴ�.
 */
class Car04 { // Car04 Ŭ������ �����մϴ�.
	int num;
	double gas;
}

class CarSample04 {

	public static void main(String[] args) {
		// ��ü�� ������ �� Ŭ������ ���� c�� ��ü�� ����Ű�� �մϴ�.
		Car04 c = new Car04();
		
		// Ŭ���� ���� c�� �� �ʵ忡 ���� �����մϴ�.
		c.num = 1234;
		c.gas = 20.5;
		
		// �� �ʵ��� ���� ����մϴ�.(���� ��ȣ, ������ ��)
		System.out.println("���� ��ȣ�� " + c.num + "�Դϴ�.");
		System.out.println("������ ���� " + c.gas + "�Դϴ�.");
		
	}

}
