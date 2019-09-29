package com.ezen.example;

/**
 * �޼ҵ��� �����ε�(Overloading)������ ��
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * ����, �μ��� ��(type)�� ������ �����ϸ�
 * ���� ���� �ٸ� �� ���� �޼ҵ尡 �����ε� �ȴٸ� ��� �ɱ��?
 * 
 * => �޼ҵ� ȣ��� �� �� ��� �޼ҵ带 ȣ���ؾ� ���� �Ǵ��� �� �����Ƿ�
 *    ERROR�� �߻��մϴ�.
 */
class Car02 {
	int num;
	double gas;
	
	// ���ϰ��� �������� setCar() �޼ҵ带 �����մϴ�.
	public int setCar(int n) {
		num = n;
		System.out.println("���� ��ȣ�� " + num + "���� �ٲپ����ϴ�.");
		
		return n;
	}

	// ���ϰ��� ���� setCar() �޼ҵ带 �����մϴ�.(���� �� �ּ��� �������ּ���.)
	/*public void setCar(int n) {
		num = n;
		System.out.println("���� ��ȣ�� " + num + "���� �ٲپ����ϴ�.");
	}*/
	
}

public class OverloadingSample02 {

	public static void main(String[] args) {
		Car02 c = new Car02();
		
		// ���ϰ��� �������� setCar()�� ȣ���ؾ��ϴ°ǰ�?
		// ���ϰ��� ���� setCar()�� ȣ���ؾ� �ϴ°ǰ�?
		c.setCar(1234);

	}

}
