package com.ezen.example;

/**
 * �� ��° �������� - 01
 * 
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * 1 ~ 10������ ¦���� ����մϴ�.
 * 2
 * 4
 * 6
 * 8
 * 10
 * 
 * ���� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
 */
public class Practice01 {

	public static void main(String[] args) {
		System.out.println("1 ~ 10������ ¦���� ����մϴ�.");
		
		// �ݺ��� for ���� �̿��մϴ�.
		for (int i = 1; i <= 10; i++) {
			// ���� i�� 2�� ���� ���������� 0�� ��� ����մϴ�.
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
