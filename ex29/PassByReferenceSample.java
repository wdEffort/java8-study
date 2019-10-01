package com.ezen.example;

/**
 * Pass By Reference
 * ������ ����
 * 
 * Pass By Value
 * ���� ����
 * 
 * @author yoman
 * 
 * 2019. 10. 01
 * 
 * �⺻���� ���� ���޵˴ϴ�.
 * �⺻�� ������ �μ��� �����ϰ� �Ǹ� '���μ�'�� '���μ�'�� ���� �ٸ� ���� �˴ϴ�.
 * �⺻�� ���� ����Ǿ� ���޵Ǳ� �����Դϴ�.
 * 
 * 
 * ��ü�� ������ ���޵˴ϴ�.
 * Ŭ������ ������ �μ��� �����ϰ� �Ǹ� '���μ�'�� '���μ�'�� ���� ��ü�� ����Ű�� �˴ϴ�.
 */
class Car {
	private int num;
	private double gas;
	private String name;
	
	public Car() {
		num = 0;
		gas = 0.0;
		name = "����";
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
	}
	
	public void setName(String nm) {
		name = nm;
	}
	
	public void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
		System.out.println("�Ƹ��� " + name + "�Դϴ�.");
	}
}

class PassByReferenceSample {

	public static void main(String[] args) {
		Car c = new Car();
		
		int number = 1234;
		double gasoline = 30.5;
		String str = "1ȣ��";
		
		c.setCar(number, gasoline); // ���� ����
		c.setName(str); // ������ ����
		c.show();
		
	}

}
