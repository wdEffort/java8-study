package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �ݺ���
 * for �� ���� ���� - 02
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * 1���� �Է��� ���ڱ����� �� ���ϱ�
 */
public class LoopSample05 {

	public static void main(String[] args) throws IOException {
		System.out.println("���� ������� ���� ���Ͻðڽ��ϱ�?");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		int sum = 0; // ���� �����ϴ� ������ �����ϰ� 0���� �ʱ�ȭ ��ŵ�ϴ�.
		
		for (int i = 1; i <= num; i++) {
			sum += i; // i�� �Է��� ���ڿ� ������ �� ���� ���մϴ�. 
		}
		
		// ���� ����մϴ�.
		System.out.println("1���� " + num + "������ ���� " + sum + "�Դϴ�.");

	}

}
