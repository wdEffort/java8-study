package com.ezen.example;

/**
 * �޼ҵ忡 ���� �� �˾ƺ��ϴ�.
 * ���� ���� �����ؼ� �޼ҵ带 ȣ�� �� �� �ֽ��ϴ�.
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * �޼ҵ� ȣ�� �� ������ ������ ������ ������ �� �ֽ��ϴ�.
 * 
 * ����, �޼ҵ�� �� �� �̻��� �μ�(�μ� ���)�� ���� �� �ֽ��ϴ�.
 * �� ��� �ݵ�� ���μ��� ���μ��� ������ �����ؾ� �޼ҵ� ȣ���� �����մϴ�.
 */
class Car02 {
	int num;
	double gas;
	
	// �μ��� ���� �޼ҵ�
	void show() {
		System.out.println("���� ��ȣ�� " + this.num + "�Դϴ�.");
		System.out.println("������ ���� " + this.gas + "�Դϴ�.");
	}
	
	void showCar() {
		System.out.println("���ݺ��� �ڵ����� ������ ǥ���մϴ�.");
		this.show();
	}
	
	void setNum(int n) {
		num = n;
		System.out.println("���� ��ȣ�� " + num + "�ٲپ����ϴ�.");
	}
	
	void setGas(double g) {
		gas = g;
		System.out.println("������ ���� " + gas + "�� �ٲپ����ϴ�.");
	}
	
	// �� �� �̻��� �μ��� ������ �޼ҵ带 �����մϴ�.
	void setNumGas(int n, double g) {
		num = n;
		gas = g; 
		System.out.println("���� ��ȣ�� " + num + "����, ������ ���� " + gas + "��  �ٲپ����ϴ�.");
	}
}

class CarSample02 {

	public static void main(String[] args) {
		Car02 c = new Car02();
		
		int number = 1234;
		double gasoline = 40.2;
		
		// ������ ������ ������ ���μ�(Argument)�� ����� �� �ֽ��ϴ�.
		// ���μ��� ���μ�(Parameter)�� �̸��� ���� �޶� �˴ϴ�.
		c.setNum(number);
		c.setGas(gasoline);
		c.showCar();
		
		System.out.println();
		
		number = 5678;
		gasoline = 24.8;
		
		// �� �� �̻��� �μ��� ������ �޼ҵ带 ȣ���մϴ�.
		// ��, �ݵ�� �μ� �ΰ��� ��� ������ �־�� �մϴ�.
		c.setNumGas(number, gasoline);
		// c.setNumGas(number); // ERROR
				
	}

}
