package com.ezen.example;

/**
 * Ŭ����(Class)
 * ����� �����ϱ�
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * �����
 * Ŭ������ �ʵ�(Field) �Ǵ� �޼ҵ�(Method)�� ���մϴ�.
 * 
 * ����� �����ϱ� ���ؼ��� '.'�� ����մϴ�.
 * 
 * ���� 
 * ����.�ʵ�
 * ����.�޼ҵ�()
 * 
 * ���⼭ ������ ��ü�� ����Ű�� ������ ���մϴ�.
 */
class Car03 { // Car03 Ŭ������ �����մϴ�.
	int num;
	double gas;
	
	public void drive() {
		System.out.println("������ �����մϴ�.");
	}

}

class CarSample03 {
	
	public static void main(String[] args) {
		// Car03 ��ü�� �����մϴ�.
		// ������ ��ü�� ���� ������ �� �ִ� �ʵ带 �����ϴ�.
		Car03 c = new Car03();
		
		// ������ ���� �����մϴ�.
		c.num = 1234; // ���� ��ȣ�� �����մϴ�.
		c.gas = 20.5; // ������ ���� �����մϴ�.
		c.drive();
	}
	
}
