package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �İ� ������
 * Ű����� �Է��� ���� ���� ����
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 */
public class ExpressionSample04 {

	public static void main(String[] args) throws IOException {
		// Ű����� �Է��� �ΰ��� ���� ���ϴ� ����
		System.out.println("������ 2�� �Է��Ͻʽÿ�.");
		
		// Ű����κ��� �Է��� ���� �� �ְ� �ϴ� ������ �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �ΰ��� ���ڿ��� �Է� �޽��ϴ�. (=> ���⼭�� ���ڸ� �Է��մϴ�.)
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		// �Է¹��� �ΰ��� ���ڿ� str1, str2�� ������ ������ �����մϴ�.
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		// �Է¹��� �� ���� num1, num2�� ���� ����� ����մϴ�.
		System.out.println("������ ����� " + (num1 + num2) + "�Դϴ�.");
	}

}
