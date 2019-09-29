package com.ezen.example;

/**
 * �޼ҵ忡 ���� �� �˾ƺ��ϴ�.
 * ����(return) ��
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * Java������ �޼ҵ带 ȣ���� ���� ������ �����ֵ���
 * ������ �� �ִ� ����� �ֽ��ϴ�.
 * �̶� �޼ҵ尡 ��ȯ�ϴ� ������ ���� ��(Return value)��� �θ��ϴ�.
 * ��, ���� ���� �� �ϳ��� ������ �� �ֽ��ϴ�.
 * 
 * ���� ���� ������ ������ 'return ��;' ������ ����մϴ�.
 * 
 * ���� 'return'�̶�� Ű����� �ڵ� ������ �����ų ������ ���˴ϴ�.
 */
class Car03 {
	int num;
	double gas;
		
	// ���� ���� ������ �ʴ� �޼ҵ忡�� �޼ҵ�� �տ� 'void'��� �����ϴ�.
	void setNum(int n) {
		num = n;
		System.out.println("���� ��ȣ�� " + num + "�ٲپ����ϴ�.");
	}
	
	void setGas(double g) {
		gas = g;
		System.out.println("������ ���� " + gas + "�� �ٲپ����ϴ�.");
	}
	
	void setNumGas(int n, double g) {
		num = n;
		gas = g; 
		System.out.println("���� ��ȣ�� " + num + "����, ������ ���� " + gas + "��  �ٲپ����ϴ�.");
	}
	
	// ���� ���� �ִ� �޼ҵ� ���� ���
	// ���� ���� �� �޼ҵ��(�μ� ���) { ... }
	int getNum() {
		System.out.println("���� ��ȣ�� �����߽��ϴ�.");
		return num; // ���� �� �����ְ�, ���� �� ���� �ֽ��ϴ�.
	}
	
	double getGas() {
		System.out.println("������ ���� �����߽��ϴ�.");
		return gas;
	}
	
	void show() {
		System.out.println("���� ��ȣ�� " + this.num + "�Դϴ�.");
		System.out.println("������ ���� " + this.gas + "�Դϴ�.");
	}
	
	void showCar() {
		System.out.println("���ݺ��� �ڵ����� ������ ǥ���մϴ�.");
		this.show();
	}
}

class CarSample03 {

	public static void main(String[] args) {
		Car03 c = new Car03();
		c.setNumGas(1234, 20.5);
		
		// ���� ���� ���Ե� ������ ������ ������ �ڷ����� �����ؾ� �մϴ�.
		int number = c.getNum();
		double gasoline = c.getGas();
		
		System.out.println("���� �ڵ����� ������ ���");
		System.out.println("���� ��ȣ�� " + number + ", ������ ���� " + gasoline + "�Դϴ�.");
		
	}

}
