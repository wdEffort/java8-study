package com.ezen.example;

/**
 * Ŭ���� ���̺귯��
 * Wrapper Ŭ����
 * 
 * @author yoman
 * 
 * 2019. 10. 01
 * 
 * Java������ '�⺻��'�� ���� �پ��� ����� �����ϴ�
 * ���� Ŭ����(Wrapper class)�� �ֽ��ϴ�.
 * 
 * ���� : Byte, Character, Short, Integer, Long, Float, Double
 * 
 * ���� Ŭ������ 'Ŭ���� �޼ҵ�'�� ������ �ֽ��ϴ�.
 * 
 * ���⼭�� Integer Ŭ������ ���� �ٷ�ϴ�.
 * 
 * �ֿ� 'Ŭ���� �޼ҵ�'
 * 1. parseInt(String str) : ���ڿ��� ����(�⺻��)�� ��ȯ(int)  
 * 2. valueOf(String str) : �μ��� ���޵� ���ڿ��� ������ �ʱ�ȭ�� Integer ��ü�� ��ȯ(Integer)
 */
public class IntegerSample01 {

	public static void main(String[] args) {
		// Integer Ŭ������ �޼ҵ� ��� ����
		String str = "100";
		
		// ���ڿ� ������ ������ ������ ��ȯ��ŵ�ϴ�.
		int num = Integer.parseInt(str);
		System.out.println("num ���� " + num + "�Դϴ�.");
		
		// 400���� �ʱ�ȭ�� Integer ��ü�� �����մϴ�.
		Integer num2 = Integer.valueOf("400");
		System.out.println("num2 ���� " + num2 + "�Դϴ�.");
	}

}
