package com.ezen.example;

/**
 * Ŭ������ ���� �̿��ϱ�
 * Ŭ������ ������ �����ϱ�
 * 
 * @author yoman
 * 
 * 2019. 10. 01
 * 
 * Ŭ������ ������ '����'�� �Ͼ�� ���Ӱ� ��ü�� �����Ǵ� ���� �ƴմϴ�.
 * => �ϳ��� ��ü�� ����Ű�� �˴ϴ�.
 * 
 * �Ʒ� �ڵ忡�� ������ ���ϴ�.
 */
class Car02 {
	int num;
	double gas;
	
	public Car02() {
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
class ClassVariableSample02 {

	public static void main(String[] args) {
		Car02 car1; 
		System.out.println("car1�� �����߽��ϴ�.");
		car1 = new Car02(); 
		car1.setCar(1234, 20.5);
		
		Car02 car2; 
		System.out.println("car2�� �����߽��ϴ�.");
		
		car2 = car1; // car2�� car1�� �����߽��ϴ�.
		System.out.println("car2�� car1�� �����߽��ϴ�.");
		
		System.out.println("car1�� ����Ű��");
		car1.show();
		System.out.println("car2�� ����Ű��");
		car2.show();
		
		System.out.println();
		
		// ���� �ϳ��� ��ü�� ����Ű�� �ִ��� ������ �����ϴ� �ڵ��Դϴ�.
		System.out.println("car1�� ����Ű�� ������ ������ �����մϴ�.");
		car1.setCar(2345, 30.5);
		
		// ������ car1 ������ ������ ����Ǿ����� 
		// car2 ������ ������ ����Ǿ��ٴ� ���� �� �� �ֽ��ϴ�.
		// ��, Car02�� ���� car1�� car2�� ���� �ٸ� ��ü�� �ƴ϶�, ������ ��ü�� ����Ű�� �ֽ��ϴ�.
		System.out.println("car1�� ����Ű��");
		car1.show();
		System.out.println("car2�� ����Ű��");
		car2.show();

	}

}
