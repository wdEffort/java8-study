package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �İ� ������
 * ���� ���� ������ - 02
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 */
public class ExpressionSample08 {

	public static void main(String[] args) throws IOException {
		// Ű����� �Է� ���� 3���� ������ ���ϴ� ����
		
		// Ű����� �Է��� �ΰ��� ���� ���ϴ� ����
		System.out.println("������ 3�� �Է��Ͻʽÿ�.");
		
		// Ű����κ��� �Է��� ���� �� �ְ� �ϴ� ������ �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		
		int sum = 0;
		// ���� ���� �����ڸ� ����Ͽ� sum�� ���� �Է¹��� 3���� ������ �����ݴϴ�.
		sum += Integer.parseInt(str1);
		sum += Integer.parseInt(str2);
		sum += Integer.parseInt(str3);
		
		// sum�� ���� ����մϴ�.
		System.out.println("3�� ������ ���� " + sum + "�Դϴ�.");
	}

}
