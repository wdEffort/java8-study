package com.ezen.example;

/**
 * Ŭ����(Class)
 * �޼ҵ��� �⺻
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * ���ݱ��� Ŭ������ �繰�� ����� ǥ���Ͽ���
 * �繰�� ������ �ִ� '���'�� Java������ �޼ҵ�(Method)��� ���߽��ϴ�.
 * 
 * �޼ҵ带 �����ϴ� ����� ���� �˾ƺ��ϴ�.
 * 
 * �޼ҵ� ����
 * ���� ���� �� �޼ҵ��(�μ� ���) {
 *   ����;
 *   ...
 *   return ��;
 * }
 * 
 * �޼ҵ� ȣ��
 * ����.�޼ҵ�(�μ� ���)
 */
class Car07 {
	int num;
	double gas;
	
	// �ڵ����� ������ ����ϴ� �޼ҵ带 �ۼ��մϴ�.
	void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
		
	}
	
}

class CarSample07 {

	public static void main(String[] args) {
		// ��ü�� �����մϴ�.
		Car07 c = new Car07();
		
		// �ʵ忡 ���� �����մϴ�.
		c.num = 1234;
		c.gas = 30.0;
		// �޼ҵ带 ȣ���մϴ�.
		c.show();
		
	}

}
