package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �� ��° �������� - 02
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * Ű����� ���簢���� �� ���� ���̸� ������ �Է¹��� ��,
 * ���̸� ����ϴ� �ڵ带 �ۼ��Ͻʽÿ�.
 * [���簢���� ���� = �Ѻ��� ���� X �ѹ��� ����]
 */
public class Practice02 {

	public static void main(String[] args) throws IOException {
		// Ű���� �Է��� �䱸�ϴ� �޽����� ��½�ŵ�ϴ�.
		System.out.println("���簢���� �غ��� ���̸� �Է��Ͻʽÿ�.");
		
		// Ű����κ��� �Է��� ���� �� �ְ� �ϴ� ������ �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Ű����� �Է��� ���ڿ��� ���� str�� �����մϴ�.
		String str1 = br.readLine();
		
		// ���簢�� �� ���� ���̸� ������ ���� num�� �����մϴ�.
		int num = Integer.parseInt(str1);
		int area = num * num;
		
		// �ﰢ���� ���̸� ����մϴ�.
		System.out.println("���簢���� ���̴� " + area + "�Դϴ�.");
	}

}
