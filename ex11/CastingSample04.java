package com.ezen.example;

/**
 * ����ȯ
 * ���� ������ �����ϱ�
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * ���� ������ ������ ����Ǹ� �Ǻ����� �� ���� �����ϴ�.
 * ������ �ǿ��� ����� ����ϴ� ��찡 �ֽ��ϴ�.
 */
public class CastingSample04 {

	public static void main(String[] args) {
		// ���� ������ ���� ����
		int num1 = 5;
		int num2 = 4;
		
		double div = num1 / num2;
		
		System.out.println("5 ������ 4�� " + div + "�Դϴ�."); // 1.25�� ��µ��� �ʽ��ϴ�.
		
		// ����Ǵ� �� �ǿ������� �ڷ����� ��� int���Դϴ�.
		// ���� int���� ������ �Ǻ��˴ϴ�.
		
		// �� �ڵ忡�� 1.25��� ���� ��� ���ؼ���
		// ��� ���� num1, num2 �� �� �ϳ�(�Ǵ� ���)�� double���̾�� �մϴ�. (=> �ٸ� ������ �����ϱ� ����)
		
		// div = (double)num1 / num2;
		div = (double)num1 / (double)num2;
		System.out.println("5 ������ 4�� " + div + "�Դϴ�."); // 1.25�� ��µ˴ϴ�.

	}

}
