package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���� ��° �������� - 03
 * 
 * @author yoman
 * 
 * 2019. 10. 02
 * 
 * Math Ŭ������ �޼ҵ带 ����Ͽ� �Ʒ��� ���� ��µǴ� �ڵ带 �ۼ��ϼ���.
 * 
 * ���� 2���� �Է��ϼ���.
 * 5
 * 10
 * 5�� 10 �� ���� ���� 5�Դϴ�. 
 */
class Practice03 {
	public static void main(String[] args) throws IOException {
		System.out.println("���� 2���� �Է��ϼ���.");
		
		// Ű����� ���� �Է¹ޱ� ���� ��ü�� �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Ű����� ���� ���� 2���� �Է¹ް� ���� str1, str2�� �����մϴ�.
		String str1 = br.readLine();
		String str2 = br.readLine();
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		// Math Ŭ������ min() �żҵ带 ����Ͽ� �־��� �� ������ ���� ���� ����մϴ�.
		System.out.println(num1 + "�� " + num2 + "�� ���� ���� " + Math.min(num1, num2) + "�Դϴ�.");
		
	}
}
