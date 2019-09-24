package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �� ��° �������� - 03
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * Ű����� �ﰢ���� �غ��� ���̸� ������ �Է¹��� �� 
 * ���̸� ����ϴ� �ڵ带 �ۼ��Ͻʽÿ�.
 * [�ﰢ���� ���� = (�غ� X ����) / 2]
 */
public class Practice03 {

	public static void main(String[] args) throws IOException {
		// Ű���� �Է��� �䱸�ϴ� �޽����� ��½�ŵ�ϴ�.
		System.out.println("�ﰢ���� �غ��� ���̸� �Է��Ͻʽÿ�.");
		
		// Ű����κ��� �Է��� ���� �� �ְ� �ϴ� ������ �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Ű����� �Է��� ���ڿ��� ���� str1, str2�� �����մϴ�.(=> ���� Ű����� �Է��� �� Enter key�� �����ϴ�.)
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		// �ﰢ���� �غ��� ������ ���� ���� ������ ���� num1�� num2�� �����մϴϴ�.
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		// ��Ȯ�� ���� ������Ͽ� ������ ���� num1�� �Ǽ������� ��ȯ��Ų �� ����մϴ�.
		double area = ((double)num1 * num2) / 2;
		
		// �ﰢ���� ���̸� ����մϴ�.
		System.out.println("�ﰢ���� ���̴� " + area + "�Դϴ�.");
	}

}
