package com.ezen.example;

/**
 * �迭�� ����
 * Ȯ�� for �� ���
 * 
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * Java���� �迭 ��Ҹ� ���� ������ �� �ִ�
 * Ȯ�� for ���� �ֽ��ϴ�.
 * 
 * ����
 * for (Ÿ�� ������ : �迭��) {
 *   ����;
 * }
 * 
 * ����
 * �Ϲ� for ���� ������� ���� �޸� 
 * ���� ��ġ(÷��)�� �� �� �����ϴ�.
 */
public class ArraySample07 {

	public static void main(String[] args) {
		// Ȯ�� for �� ��� ����
		int[] test = new int[5];
		
		test[0] = 10;
		test[1] = 20;
		test[2] = 30;
		test[3] = 40;
		test[4] = 50;
		
		// Ȯ�� for ���� ����ϸ� �迭 ���� test �� ����� ����
		// �ϳ��� ������ ������ ���� num�� �����մϴ�.
		for (int num : test) {
			// �迭 ���� test �� ����� ���� ����մϴ�.
			System.out.println(num);
		}
	}

}
