package com.ezen.example;

/**
 * ������(Constructor)
 * �⺻ ������(Default constructor)
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * ����, Ŭ���� ���� �����ڸ� �ϳ��� �������� ���� ���
 * ��ü�� ������ �� �μ��� ���� �����ڰ� �ڵ����� ȣ��˴ϴ�.
 * 
 * �μ��� ���� �����ڸ� �⺻ �����ڶ� �θ��ϴ�.
 */
class Car04 {
	int num;
	double gas;
	
	// �����ڰ� ���ǵ��� �ʾҽ��ϴ�.
	
	public void show() {
		System.out.println("�ڷ� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
	}
	
}

class ConstructorSample04 {

	public static void main(String[] args) {
		// �����ڰ� ���ǵ��� ���� ��� ��ü ������ �⺻ �����ڰ� �ڵ����� ȣ��˴ϴ�.
		Car04 c = new Car04();
	}

}
