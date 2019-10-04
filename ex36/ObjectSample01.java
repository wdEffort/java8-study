package com.ezen.example;

/**
 * Object Class
 * ��� Ŭ������ �ٿ��� �Ǵ� Ŭ����
 * 
 * @author yoman
 * 
 * 2019. 10. 04
 * 
 * Java������ ���� Ŭ������ �������� ������ �� Ŭ������ 'Object Ŭ����'�� ��� �޽��ϴ�.
 *  
 * Java������ �ϳ��� ���� Ŭ������ Ȯ���ؼ� ���� ���� ���� Ŭ������ ������ �� �ֽ��ϴ�.
 * ����, ���� Ŭ������ ���� Ȯ���ؼ� '���� ���ο� ���� Ŭ����'�� �����ϴ� �� ���� �����մϴ�.
 * �׷��� �ϳ��� Ŭ������ ���� ���� ���� Ŭ������ ��� ���� �� �����ϴ�.
 * 
 * Object Ŭ������ toString() �޼ҵ�
 * => ��ü�� ��Ÿ���� ���ڿ��� ��ȯ(String)
 * => ��ü�� ������ ����ؾ� �� ��, �� �޼ҵ尡 ȣ��ǵ��� ����� �Ǿ� �ֽ��ϴ�.
 * => ���� '������(Overriding)'�Ͽ� ����մϴ�.
 */
class Car01 {
	protected int num;
	protected double gas;
	
	public Car01() {
		this.num = 0;
		this.gas = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	public void setCar(int num, double gas) {
		this.num = num;
		this.gas = gas;
		System.out.println("���� ��ȣ�� " + num + "����, ������ ���� " + gas + "�� �ٲپ����ϴ�.");
	}
	
	// Object Ŭ������ toSting() �޼ҵ带 �������մϴ�.
	public String toString() {
		String str = "�ڷ���ȣ : " + num + " ���� �� : " + gas;
		return str;
	}
}

class ObjectSample01 {

	public static void main(String[] args) {
		Car01 c = new Car01();
		c.setCar(1234, 20.5);
		
		System.out.println(c); // ���� ������ toString() �޼ҵ尡 ȣ��˴ϴ�.
		
		
	}

}
