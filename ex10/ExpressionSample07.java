package com.ezen.example;

/**
 * �İ� ������
 * ���� ���� ������ - 01
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * ���� �����ڶ�
 * �º��� ������ �캯�� ���� �����ϴ� �������Դϴ�.
 * 
 * ���� �����ڴ� �ٸ� �����ȣ�� ���ս��� �پ��ϰ� ��� �� �� �ֽ��ϴ�.
 */
public class ExpressionSample07 {

	public static void main(String[] args) {
		// ���� ������ ��� ����
		int a = 2;
		int b = 3;
		
		a += b; // a = a + b
		System.out.println("a�� b�� ���� ���� " + a + "�Դϴ�.");
		
		a -= b; // a = a - b
		System.out.println("a�� b�� �� ���� " + a + "�Դϴ�.");
		
		a *= b; // a = a * b
		System.out.println("a�� b�� ���� ���� " + a + "�Դϴ�.");
		
		a /= b; // a = a / b
		System.out.println("a�� b�� ���� ���� " + a + "�Դϴ�.");
		
		System.out.println();
		
		// ���� �������� �Ǵٸ� ǥ����
		int c = 0;	

		// c++;
		c = c + 1;
		System.out.println("c�� ���� 1 ���� ��ŵ�ϴ�.");
		
		// c--;
		c = c - 1;
		System.out.println("c�� ���� 1 ���� ��ŵ�ϴ�.");
	
		System.out.println("���������� c�� ���� " + c + "�Դϴ�.");
	}

}
