package com.ezen.example;

/**
 * �� ��° �������� - 04
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * *
 * **
 * ***
 * ****
 * *****
 * 
 * ���� ���� ����ϴ� �ڵ带 �ۼ��Ͻʽÿ�.
 */
public class Practice04 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			// ���� �ݺ����� ����� ���� ������ �ٱ��� �ݺ������� ����� ���� i�� ���� �̿��մϴ�.
			// ��, ���� j�� i���� ���� ���� �� ����˴ϴ�.
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
