package com.ezen.example;

/**
 * Object Class
 * 
 * @author yoman
 * 
 * 2019. 10. 04
 * 
 * Object Ŭ������ getClass() �޼ҵ�
 * => ��ü�� ���� Ŭ������ ������ ��ȯ�մϴ�.(Class)
 */

class Car03 {
	protected int num;
	protected double gas;
	
	public Car03() {
		this.num = 0;
		this.gas = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
}

class RacingCar03 extends Car03 {
	private int course;
	
	public RacingCar03() {
		this.course = 0;
		System.out.println("���̽�ī�� ����������ϴ�.");
	}
}

class ObjectSample03 {

	public static void main(String[] args) {
		Car03[] cars = new Car03[2];
		
		cars[0] = new Car03();
		cars[1] = new RacingCar03();
		
		for (int i = 0; i < cars.length; i++) {
			// getClass() �޼ҵ带 ����Ͽ�
			// �� ��ü�� ���� 'Ŭ������ ���� �������'�� ������ �ִ�
			// Class ��ü�� ��ȯ�մϴ�.
			Class c = cars[i].getClass(); 
			System.out.println((i + 1) + "��° ��ü�� Ŭ������ " + c + "�Դϴ�.");
		}

	}

}
