package com.ezen.example;

/**
 * �İ� ������
 * �پ��� ����
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * ������ ���� ����Ͽ� ���� ���� �� �ֽ��ϴ�.
 * ���ǻ���! 
 * Java���� ���� ����� �� '�캯 = �º�'�� ���� '='�� ǥ���� �ϰ� �˴ϴ�.
 * ���п��� '=' ��ȣ�� '�����ϴ�'��� �ǹ̰� ������
 * ���α׷��� ������ '���� �Ҵ�(����)�Ѵ�'��� �ǹ̸� �����ϴ�.
 */
public class ExpressionSample03 {

	public static void main(String[] args) {
		// ������ ���� ����� ���� ��� ����
		
		// ������ ���� num1, num�� ����� ���ÿ� �ʱ�ȭ�ϰ�,
		// num1�� num2�� ���� ���� sum�� �����մϴ�.
		int num1 = 2;
		int num2 = 3;
		int sum = num1 + num2;
		
		System.out.println("���� num1�� ���� " + num1 + "�Դϴ�.");
		System.out.println("���� num1�� ���� " + num2 + "�Դϴ�.");
		System.out.println("num1 + num2�� ���� " + sum + "�Դϴ�.");
		
		num1 = num1 + 1; // num1�� 1�� ���� �� �ٽ� num1�� �����մϴ�.
		
		System.out.println("���� num1�� ���� 1�� ���ϸ� " + num1 + "�Դϴ�.");
	}
	
}
