package com.ezen.example;

/**
 * Ŭ���� �޼ҵ� ���� ������ ��
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * 1. Ŭ���� �ȿ����� ����� 'this'��� Ű���带 ���� �� �ֽ��ϴ�.
 * ������ �� 'this'�� �ν��Ͻ� �޼ҵ� �ȿ����� ���� �� �ֽ��ϴ�.
 * => 'this'�� Ư�� ��ü �����θ� ����Ű�� Ű�����Դϴ�.
 *    ���� �� ��ü���� '����'�Ǵ� ��� �ȿ����� ����� �� �����ϴ�.
 * 
 * 2. Ŭ���� �޼ҵ� �ȿ����� �ν��Ͻ� ������ �ν��Ͻ� �޼ҵ忡 ������ �� �����ϴ�.
 * => Ŭ���� �޼ҵ�� ��ü�� �������� ���� ���¿����� ȣ���� �� �־�� �մϴ�.
 *    ���� Ư�� ��ü�� ����� �ν��Ͻ� ������ �޼ҵ忡�� ������ �� �����ϴ�. (��Ŀ����...)
 */
class Car02 {
	public static int sum = 0; 
	private int num;
	private double gas;
	
	public Car02() {
		num = 0;
		gas = 0.0;
		sum++; 
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("���� ��ȣ�� " + num + "����, ������ ���� " + gas + "�� �ٲپ����ϴ�.");
	}
	
	public void show() {
		System.out.println("�ڷ� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
	}
	
	public static void showSum() {
		// Ŭ���� �޼ҵ� �ȿ����� 'this'�� ����� �� �����ϴ�.
		// System.out.println("�ڵ����� ��� " + this.sum + "�� �ֽ��ϴ�.");
		
		// Ŭ���� �޼ҵ� �ȿ����� �ν��Ͻ� ������ ������ �� �����ϴ�.
		// System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		
		System.out.println("�ڵ����� ��� " + sum + "�� �ֽ��ϴ�.");
	}
}

class ClassVariableSample02 {

	public static void main(String[] args) {
		Car02.showSum();
		
		System.out.println();
		
		Car02 audi = new Car02();
		audi.setCar(1234, 28.5);
		Car02.showSum();
		
		System.out.println();
		
		Car02 bmw = new Car02();
		bmw.setCar(5678, 33.0);
		Car02.showSum();
		
	}

}
