package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �迭(Array)
 * Ű����� �迭 ���� �Է�
 * 
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * �迭 ����� ������ �ڵ� �ȿ��� ������ �� ���� ���
 * Ű����� �Է��� �޾� ����� ������ ������ �� �ֽ��ϴ�.
 */
public class ArraySample02 {

	public static void main(String[] args) throws IOException {
		// Ű����� �迭 ���̸� ���ϴ� ����
		System.out.println("�迭 ����� ������ �Է��ϼ���.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �迭 ����� ������ �Է� �޽��ϴ�.
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		// �迭 ���� test�� �����մϴ�.
		int[] test;
		// ������ �Է��� �迭 ����� ������ŭ �迭�� �����մϴ�.
		test = new int[num];
		
		System.out.println("�� ����� ���� �Է��ϼ���.");
		
		// �迭 ����� ������ŭ �ݺ��ϸ� ���� �Է��ϰ� �迭�� �����մϴ�.
		for (int i = 0; i < num; i++) {
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
		}
		
		// �迭 ����� ���� ����մϴ�.
		for (int i = 0; i < num; i++) {
			System.out.println((i + 1)+ "��° ���� " + test[i] +"�Դϴ�.");
		}

	}

}
