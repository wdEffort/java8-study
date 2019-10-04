package com.ezen.example;

/**
 * Object Class
 * 
 * @author yoman
 * 
 * 2019. 10. 04
 * 
 * Object Ŭ������ equals() �޼ҵ�
 * => �� ������ ����Ű�� ��ü�� ������ ��� true�� ��ȯ �մϴ�.(boolean)
 * => ���� ������ ������ ��ü�� ����Ű���� Ȯ���ؾ� �� ��� ����մϴ�.
 * => ��, String Ŭ������ ��� '������ ���ڿ�����'�� �����ϵ��� ������ �Ǿ� �ֽ��ϴ�.
 */
class Car02 {
	protected int num;
	protected double gas;
	
	public Car02() {
		this.num = 0;
		this.gas = 0.0;
	}
	
}

class ObjectSample02 {

	public static void main(String[] args) {
		// c1�� c2�� ���� �ٸ� ��ü�� ����ŵ�ϴ�.
		Car02 c1 = new Car02();
		Car02 c2 = new Car02();
		
		Car02 c3;
		c3 = c1; // c1�� c3�� ���� ��ü�� ����ŵ�ϴ�.
		
		boolean b1 = c1.equals(c2);
		boolean b2 = c1.equals(c3);
		
		System.out.println("c1�� c2�� �����ϱ�? " + b1);
		System.out.println("c1�� c3�� �����ϱ�? " + b2);
		
		String str1 = new String("yoman");
		String str2 = new String("yoman");

		System.out.println("str1�� str2�� �����ϱ�? " + str1.equals(str2));
	}

}
