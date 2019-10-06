package com.ezen.example;

/**
 * �������̽�(Interface)
 * �������̽� �����ϱ�
 * 
 * @author yoman
 * 
 * 2019. 10. 06
 * 
 * �������̽��� Ŭ������ �����ؼ� ����ؾ� �մϴ�.
 * �̷��� ������ �������̽��� ����(Implementation)�Ѵٰ� �θ��ϴ�.
 * Ŭ�������� �������̽��� ������ ������ 'implements' Ű���带 ����մϴ�.
 * 
 * �������̽��� �����ϴ� Ŭ������ �������̽��� ������ �ִ�
 * �ʵ�� �޼ҵ带 �����ް� �˴ϴ�.
 * ��, �������̽��� ������ Ŭ������ ��ü�� �����ϱ� ���ؼ���
 * �������̽��� ��� �޼ҵ带 '����'�ؾ� �մϴ�.
 * 
 * [�������̽� ���]
 * class Ŭ������ implements �������̽��� { ... }
 */
interface iVehicle02 {
	void show(); // �߻� �޼ҵ��Դϴ�.
}

class Car02 implements iVehicle02 {
	private int num;
	private double gas;
	
	public Car02(int num, double gas) {
		this.num = num;
		this.gas = gas;
	}
	
	// �������̽��� ����� �޼ҵ带 �����մϴ�.
	public void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
	}
}

class Plane02 implements iVehicle02 {
	private int flight;
	
	public Plane02(int flight) {
		this.flight = flight;
	}
	
	// �������̽��� ����� �޼ҵ带 �����մϴ�.
	public void show() {
		System.out.println("����� ��ȣ�� " + flight + "�Դϴ�.");
	}
}

class InterfaceSample02 {

	public static void main(String[] args) {
		// �������̽� �迭�� �غ��մϴ�.
		iVehicle02[] ivc = new iVehicle02[2];
		
		ivc[0] = new Car02(1234, 20.5);
		ivc[1] = new Plane02(232);
		
		for(int i = 0; i < ivc.length; i++) {
			ivc[i].show();
			System.out.println();
		}

	}

}
