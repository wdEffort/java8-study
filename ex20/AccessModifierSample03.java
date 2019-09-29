package com.ezen.example;

/**
 * private ���� ������ ����ϱ�
 * private ����� ������ �ʵ忡 �����ϴ� ���
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * Sample02���� private ����� ������ �ʵ忡 ���ؼ� Ŭ���� �ܺο���
 * ������ �Ұ��ɴ��ϴ� ���� �˾ҽ��ϴ�. 
 * �׷��� private ����� �����ϴ� ����� �������?
 * 
 * => Ŭ���� �ܺο��� ���� ������ �޼ҵ带 �����Ͽ� �μ� ����� �����ϰ�
 *    �ʵ忡 ���� �������ִ� ����� ����ϸ� �˴ϴ�.
 */
class Car03 {
	private int num;
	private double gas;
	
	// �޼ҵ带 ������ �� ���� ���� �� �տ� 'public' Ű���带 �ٿ��־����ϴ�.
	// public ���� �����ڷ� ������ ����� Ŭ���� �ܺο��� ��� �����մϴ�. 
	public void setNumGas(int n, double g) {
		// �μ��� ���޵� ������ ���� �ùٸ� ������ �˻��Ͽ� �����մϴ�.
		if (g > 0 && g < 1000) {
			num = n;
			gas = g;
			System.out.println("���� ��ȣ�� " + num + "����, ������ ���� " + gas + "�� �ٲپ����ϴ�.");
		} else {
			System.out.println(g + "�� �ùٸ� ���� ���� �ƴմϴ�.");
			System.out.println("������ ���� �ٲ� �� �����ϴ�.");
		}
	}
	
	public void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("������ ���� " + gas + "�Դϴ�.");
	}
}

class AccessModifierSample03 {

	public static void main(String[] args) {
		Car03 c = new Car03();
		
		// public ���� �����ڷ� ������ �޼ҵ带 ����Ͽ� �ʵ忡 ���� �����մϴ�.
		c.setNumGas(1234, 20.5); 
		c.show();
		
		System.out.println();
		System.out.println("�߸��� ������� �����غ��ڽ��ϴ�.");
		System.out.println();
		
		c.setNumGas(1234, -10.0);
		c.show();
		
		// �̷��� private, public ���� �����ڸ� ����ϸ� �ùٸ� ���� ������ �� �ְ� �˴ϴ�.

	}

}
