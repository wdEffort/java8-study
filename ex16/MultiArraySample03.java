package com.ezen.example;

/**
 * ������ �迭
 * 
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * Java�� ������ �迭���� �� ����� ���� �¾� ������ �ʿ�� �����ϴ�.
 * ��, ���̰� �������� �ʴ� �迭�� ���� �� �ֽ��ϴ�.
 */
public class MultiArraySample03 {

	public static void main(String[] args) {
		// ���̰� �������� ���� ������ �迭 ����
		int[][] test = {
			{80, 60, 22, 50}, {90, 55, 68, 72, 56}, {33, 75, 63}
		};
		
		// ������ �迭 ���� test�� ���̸�ŭ �ݺ��մϴ�.
		// test.length => �迭�� ��ü ����
		// test[÷��].length => �� �迭 ����� ����
		for (int i = 0; i < test.length; i++) {
			System.out.println((i + 1) + "��° �迭 ����� ���̴� " + test[i].length + "�Դϴ�.");
		}

	}

}
