package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �� ��° �������� - 02
 * 
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * Ű����� ���� ������ �Է¹��� ��,
 * �� �հ踦 ����ϴ� �ڵ带 �ۼ��ϼ���.
 * (��, 0�� �Է¹����� ����� ����մϴ�.)
 */
public class Practice02 {

	public static void main(String[] args) throws IOException {
		// Ű���� �Է��� �䱸�ϴ� �޽����� ��½�ŵ�ϴ�.
		System.out.println("���� ������ �Է��Ͻʽÿ�. (0���� ����)");
		
		// Ű����κ��� �Է��� ���� �� �ְ� �ϴ� ������ �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		// �հ� ������ ������ ������ �����մϴ�.
		int sum = 0;
		
		// �� ���������� ������ �������� �ʾ����Ƿ� while ���� ����մϴ�.
		while (true) {
			// ������ �Է¹޾� ���ڿ� ���� str�� �����մϴ�.
			String str = br.readLine();
			// �Է¹��� ���ڿ��� ���������� ��ȯ�Ͽ� ���� num�� �����մϴ�.
			int num = Integer.parseInt(str);
			
			// ����, num�� 0�̶�� �ݺ����� ����˴ϴ�.
			if (num == 0)
				break;
			
			// �հ� ������ �Է¹��� ���ڸ� ���մϴ�.
			sum += num;
		}
		
		// �հ踦 ����մϴ�.
		System.out.println("���� ������ �հ�� " + sum + "�Դϴ�.");
	}

}
