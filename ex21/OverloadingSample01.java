package com.ezen.example;

/**
 * �޼ҵ��� �����ε�(Overloading)
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * Java������ '���� �̸�'�� �޼ҵ带 2�� �̻� �����ϰ�, 
 * ���� �ٸ� ó���� �� �� �ְ� �ϴ� ����� �����մϴ�.
 * �̷��� ����� ���þ� �޼ҵ� '�����ε�'�̶�� �θ��ϴ� (=> ������[Polymorphism])
 * 
 * ����
 * �޼ҵ��� �μ��� ��(type)�� �ٸ��ų�,
 * ������ �ٸ��� ������ �մϴ�.
 */
class Car01 {
	int num;
	double gas;
	
	// setCar() �޼ҵ带 ���� �� �ۼ��մϴ�.
	// ��, �޼ҵ��� �μ��� ��(type)�� �ٸ��ų� ������ �޶�� �մϴ�.
	
	// ������ �μ��� ������ setCar()
	public void setCar(int n) {
		num = n;
		System.out.println("���� ��ȣ�� " + num + "���� �ٲپ����ϴ�.");
	}
	
	// �Ǽ��� �μ��� ������ setCar()
	public void setCar(double g) {
		gas = g;
		System.out.println("������ ���� " + gas + "���� �ٲپ����ϴ�.");
	}
	
	// 2����  �μ��� ������ setCar()
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("���� ��ȣ�� " + num + "����, ������ ���� " + gas + "�� �ٲپ����ϴ�.");
	}
	
	public void show() {
		System.out.println("�ڷ� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
	}
}

public class OverloadingSample01 {

	public static void main(String[] args) {
		Car01 c = new Car01();
		
		// 2���� �μ��� ������ setCar()�� ȣ���մϴ�.
		c.setCar(1234, 10.5);
		c.show();
		
		System.out.println("���� ��ȣ�� �ٲٰڽ��ϴ�.");
		// ������ �μ��� ������ setCar()�� ȣ���մϴ�.
		c.setCar(7890);
		c.show();
		
		System.out.println("������ ���� �ٲٰڽ��ϴ�.");
		// �Ǽ��� �μ��� ������ setCar()�� ȣ���մϴ�.
		c.setCar(25.5);
		c.show();

	}

}
