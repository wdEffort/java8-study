package com.ezen.example;

/**
 * �ټ� ��° �������� - 01
 *
 * @author yoman
 * 
 * 2019. 09. 27
 * 
 * �߸��� �ڵ带 ã�Ƽ� ��ġ����.
 */
public class Practice01 {

	public static void main(String[] args) {
		int[] test;
		test = new int[5];
		
		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 75;
		// test[5] = 100; // ERROR (=> �迭�� ũ�⸦ �Ѿ ���� ������ �� �����ϴ�.)
		
		for (int i = 0; i < 5; i ++) {
			System.out.println((i + 1) + "��° ����� ������ " + test[i] + "�Դϴ�.");
		}
		
	}

}
