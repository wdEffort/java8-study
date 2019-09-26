package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �ټ� ��° �������� - 03
 *
 * @author yoman
 * 
 * 2019. 09. 27
 *
 * Ű����� 5���� ���� ������ �Է¹��� ��
 * �հ�� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
 * ���� ���� ū ������ ����ϼ���.
 */
public class Practice03 {

	public static void main(String[] args) throws IOException {
		// �迭 ���� test�� �����ϰ�, ũ�⸦ �����մϴ�.
		int[] test = new int[5];
		int sum = 0; // �հ踦 �����ϴ� ����
		double average = 0; // ����� �����ϴ� ����
		int max = 0; // �ִ밪�� �����ϴ� ����

		System.out.println("5���� ���� ������ �Է��Ͻʽÿ�.");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �迭�� ����(ũ��)��ŭ �ݺ��ϸ鼭 Ű����� �Է��� �ް�, �迭�� �Է¹��� ���� �����մϴ�.
		for (int i = 0; i < test.length; i++) {
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
			// �հ迡 �Է¹��� ������ ����ؼ� ���մϴ�.
			sum += test[i];
		}
		
		for (int i = 0; i < test.length; i++) {
			System.out.println((i + 1) + "��° ����� ������ " + test[i] + "�Դϴ�.");
		}
		
		// ����� ���մϴ�.
		average = (double) sum / test.length;

		System.out.println("5���� �������� �հ�� " + sum + "�Դϴ�.");
		System.out.println("5���� �������� ����� " + average + "�Դϴ�.");
		
		// �迭�� ����(ũ��)��ŭ �ݺ��ϸ鼭 �ִ밪�� ���մϴ�.
		for (int i = 0; i < test.length; i++) {
			// ���� max�� �迭 ���� test �� ����� ���� ���ϸ鼭 �ִ밪�� ���մϴ�.
			if (test[i] > max) {
				max = test[i];
			}
		}
		
		System.out.println("���� ���� ������ " + max + "�Դϴ�.");
		
	}

}
