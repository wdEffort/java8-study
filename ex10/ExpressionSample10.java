package com.ezen.example;

/**
 * �İ� ������
 * ������ �켱 ����
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * �����ڴ� �켱 ������ �ֽ��ϴ�.
 * �켱 ������ �����Ϸ��� ( )�� ����ؾ� �մϴ�.
 * �켱������ ������ ��� �ݵ�� '���ʿ��� ����������' ���˴ϴ�.
 * ���� �����ڴ� �����ʺ��� ���� �򰡵˴ϴ�.
 */
public class ExpressionSample10 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		
		int sum1 = a + b * c;
		int sum2 = (a + b) * c;
		
		System.out.println("sum1�� ���� " + sum1 + "�Դϴ�.");
		System.out.println("sum2�� ���� " + sum2 + "�Դϴ�.");
	}

}
