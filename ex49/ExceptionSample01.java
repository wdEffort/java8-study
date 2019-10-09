package com.ezen.example;

/**
 * ����(Exception)�� �⺻
 * 
 * @author yoman
 * 
 * 2019. 10. 09
 * 
 * ���α׷��� ���� �ÿ� �پ��� ������ �߻��� �� �ֽ��ϴ�.
 * ��� �������� ������ �� �� ã�� �� �����ϴ�.
 * ��, ���α׷��� �����Ű�� ������ ��μ� ������ ������ �� �� �ֽ��ϴ�.
 * 
 * Java�� �̷��� ���α׷� ���� �� �߻� ������ �����ϱ� ����
 * '���� ó��' ��Ŀ������ �����մϴ�.
 */
public class ExceptionSample01 {

	public static void main(String[] args) {
		// ���� �߻� �ǽ� ����
		
		int[] test;
		test = new int[5];
		
		System.out.println("test[10]�� ���� �����մϴ�.");
		
		// �迭 ����� ������ �ʰ������Ƿ� ���ܰ� �߻��մϴ�.(ArrayIndexOutOfBoundsException)
		test[10] = 80;
		
		// ���ܰ� �߻��ϸ�
		// ���� �޽��� ��°� ���ÿ� ���α׷��� ����˴ϴ�.
		// ���� �Ʒ� �ڵ�� ������� �ʽ��ϴ�.
		System.out.println("test[10]dp 80�� �����߽��ϴ�.");
		System.out.println("������ �����߽��ϴ�.");

	}

}
