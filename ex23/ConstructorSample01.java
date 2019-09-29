package com.ezen.example;

/**
 * ������(Constructor)
 * �������� �⺻
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * Java������ ��ü�� ������ �� �׻� ����Ǵ� ������,
 * ��ü�� �ʱ�ȭ���ֱ� ���� '������'��� ����� �����մϴ�.
 * �޼ҵ�� ���� ����� �ٸ��ٴ� ���� �����Ͻñ� �ٶ��ϴ�.
 * 
 * �����ڴ� �޼ҵ�ó�� �������� ȣ���� �� ������
 * ���� ��ü�� ����� �ڵ����� �ʱ�ȭ �ϱ� ���� ����մϴ�.
 * 
 * ����
 * ���� ������ Ŭ������(�μ� ���) {
 *   ����;
 * }
 */
class Car01 {
	int num;
	double gas;
	
	// �����ڸ� �����մϴ�. (=> �����ڴ� ���ϰ��� �����ϴ�.)
	// ��ü�� ������ �� �ڵ����� ����˴ϴ�.
	public Car01() {
		num = 0;
		gas = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	public void show() {
		System.out.println("�ڷ� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
	}
	
}

class ConstructorSample01 {

	public static void main(String[] args) {
		// ��ü�� ���������ν� ������ �ȿ� �ڵ尡 �ڵ����� ����˴ϴ�.
		Car01 c = new Car01();
		c.show();
		
	}

}