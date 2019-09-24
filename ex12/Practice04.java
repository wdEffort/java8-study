package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �� ��° �������� - 04
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * Ű����� �ټ� ������ ���� ������ �Է¹��� ��
 * �հ�� ����� ����ϴ� �ڵ带 �ۼ��Ͻʽÿ�.
 * [����=52, ����=68, ����=75, ��ȸ=83, ����=36]
 */
public class Practice04 {

	public static void main(String[] args) throws IOException {
		// Ű���� �Է��� �䱸�ϴ� �޽����� ��½�ŵ�ϴ�.
		System.out.println("����, ����, ����, ��ȸ, ���� ������ �Է��Ͻʽÿ�.");

		// Ű����κ��� �Է��� ���� �� �ְ� �ϴ� ������ �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Ű����� �Է��� ���ڿ��� ���� str1 ~ str5�� �����մϴ�.(=> ���� Ű����� �Է��� �� Enter key�� �����ϴ�.)
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		String str4 = br.readLine();
		String str5 = br.readLine();

		// �Է� ���� ���� ������ ���� num1 ~ num5�� �����մϴ�.
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int num3 = Integer.parseInt(str3);
		int num4 = Integer.parseInt(str4);
		int num5 = Integer.parseInt(str5);
		// �հ踦 ���մϴ�.
		int sum = num1 + num2 +  + num3 +  + num4 +  + num5; 
		// ����� ���մϴ�.(�Ǽ��� ������ �����ϱ� ���ؼ� ������ ���� sum�� �Ǽ������� ��ȯ��ŵ�ϴ�.)
		double average = (double)sum / 5;
		
		// �ﰢ���� ���̸� ����մϴ�.
		System.out.println("5������ �հ�� " + sum + "���Դϴ�.");
		System.out.println("5������ ����� " + average + "���Դϴ�.");
	}

}
