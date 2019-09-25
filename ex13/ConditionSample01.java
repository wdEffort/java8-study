package com.ezen.example;

/**
 * ���ǹ�
 * ����(��)�� ���� ������
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * Java������ �پ��� ��Ȳ�� ǥ���ϱ� ���� 
 * ����(Condition)�̶�� ������ ����մϴ�.
 * 
 * ��(True), ����(False) �� ���� �� �� �ϳ��� ǥ���ϴ� ���� 
 * Java������ '����' Ȥ�� '���ǽ�'�̶�� �մϴ�. 
 * 
 * ������ ����� ���ؼ��� 
 * '==', '!=', '>', '>=', '<', '<='�� ���� 
 * ���� ������(Relational operator)�� ����մϴ�.
 */
public class ConditionSample01 {

	public static void main(String[] args) {
		// ���� ������ ��� ����
		
		// �۴�, ũ��
		System.out.println("3�� 5���� �۽��ϴ�. : " + (3 < 5));
		System.out.println("3�� 5���� Ů�ϴ�. : " + (3 > 5));
		
		// ����, �ٸ���
		System.out.println("1�� 1�� �����ϴ�. : " + (1 == 1));
		System.out.println("1�� 2�� �����ϴ�. : " + (1 == 2));
		System.out.println("1�� 2�� �ٸ��ϴ�. : " + (1 != 2));
		
		// ���ų� �۴�, ���ų� ũ��
		System.out.println("4�� 5���� ���ų� �۽��ϴ�. : " + (4 <= 5));
		System.out.println("4�� 5���� ���ų� Ů�ϴ�. : " + (4 >= 5));
		System.out.println("4�� 4���� ���ų� Ů�ϴ�. : " + (4 >= 4));
		
	}

}
