package com.ezen.example;

/**
 * �޼ҵ忡 ���� �� �˾ƺ��ϴ�.
 * �μ� �ٷ��
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * �޼ҵ带 ȣ���� �� ��� ����(��)�� ������ �� �ֽ��ϴ�.
 * �޼ҵ忡�� ���޵� ���� ���� ó���ϵ��� ������ �� �ֽ��ϴ�.
 * 
 * ��ó�� �޼ҵ忡�� �ǳ��ִ� ������ '�μ�'��� �θ��ϴ�.
 * 
 * ���μ�(Parameter) : �޼ҵ忡 ����Ǿ� �ִ� �μ�
 * ���μ�(Argument) : �޼ҵ� ȣ�� �� ���޵Ǵ� ��
 */
class Car01 {
	int num;
	double gas;
	
	void show() {
		System.out.println("���� ��ȣ�� " + this.num + "�Դϴ�.");
		System.out.println("������ ���� " + this.gas + "�Դϴ�.");
	}
	
	void showCar() {
		System.out.println("���ݺ��� �ڵ����� ������ ǥ���մϴ�.");
		this.show();
	}
	
	// �μ��� ���� �޼ҵ带 �����մϴ�.
	// �������� ���� 1�� ���� ���� �� �ִ� �޼ҵ带 �����մϴ�.
	void setNum(int n) {
		num = n; // ���޹��� �μ��� �޼ҵ� �ȿ��� ����մϴ�.
		System.out.println("���� ��ȣ�� " + num + "�ٲپ����ϴ�.");
	}
	
	void setGas(double g) {
		gas = g;
		System.out.println("������ ���� " + gas + "�� �ٲپ����ϴ�.");
	}
}

class CarSample01 {

	public static void main(String[] args) {
		Car01 c = new Car01();
		c.setNum(1234); // setNum() �޼ҵ带 ȣ���ϴ� �������� ���� �������ݴϴ�.
		c.setGas(30.5);
		c.showCar();
		
		System.out.println();
		
		// �پ��� ���� �μ��� ������ �� �ֽ��ϴ�.
		// �̷��� Ư¡�� �̿��ϸ� ������ ó���� �����մϴ�.
		c.setNum(7890);
		c.setGas(28.5);
		c.showCar();

	}

}
