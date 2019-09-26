package com.ezen.example;

/**
 * ������ �迭
 * 
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * ������ �迭�� ����� ������ ���� �н��մϴ�.
 * ��ǥ������ 2���� �迭�� ���� �н��մϴ�.
 * 
 * 2���� �迭 : �� X ���� ���¸� ��ϴ�.
 */
public class MultiArraySample01 {

	public static void main(String[] args) {
		// ������ �迭 ��� ����(2���� �迭)
		
		// 2���� �迭�� �����մϴ�.
		int[][] test;
		// 2���� �迭�� �����մϴ�.(=> ũ�� ����)
		test = new int[2][5];
		
		// 2���� �迭 ��ҿ� ���� �����մϴ�.
		test[0][0] = 50;
		test[0][1] = 60;
		test[0][2] = 70;
		test[0][3] = 30;
		test[0][4] = 40;
		
		test[1][0] = 90;
		test[1][1] = 30;
		test[1][2] = 70;
		test[1][3] = 80;
		test[1][4] = 50;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println((i + 1) + "�� " + (j + 1) + "���� ���� " + test[i][j] + "�Դϴ�.");
			}
			System.out.println();
		}

	}

}
