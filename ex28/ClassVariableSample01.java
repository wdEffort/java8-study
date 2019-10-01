package com.ezen.example;

/**
 * Ŭ������ ���� �̿��ϱ�
 * Ŭ������ ������ �����ϱ�
 * 
 * @author yoman
 * 
 * 2019. 10. 01
 * 
 * Ŭ������ ������ ��ü�� ������ �� �̿ܿ��� '����'�� �����մϴ�.
 * ��, �����ϴ� ����� ���� Ŭ�������̾�� �մϴ�.
 */
class Car01 {
	int num;
	double gas;
	
	public Car01() {
		num = 0;
		gas = 0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("���� ��ȣ�� " + num + "����, ������ ���� " + gas + "�� �ٲپ����ϴ�.");
	}
	
	public void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
	}
}
class ClassVariableSample01 {

	public static void main(String[] args) {
		Car01 car1; // Car01�� ���� car1�� �����մϴ�.
		System.out.println("car1�� �����߽��ϴ�.");
		car1 = new Car01(); // Car01 Ŭ������ ��ü�� �����Ͽ� car1�� ����Ű�� �մϴ�.
		car1.setCar(1234, 20.5);
		
		Car01 car2; // Car01�� ���� car2�� �����մϴ�.
		System.out.println("car2�� �����߽��ϴ�.");
		
		car2 = car1; // car2�� car1�� �����߽��ϴ�.
		System.out.println("car2�� car1�� �����߽��ϴ�.");
		
		System.out.println("car1�� ����Ű��");
		car1.show();
		System.out.println("car2�� ����Ű��");
		car2.show();

	}

}
