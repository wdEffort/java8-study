package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ű����� �Է��ϱ�
 * 2�� �̻��� ���� �Է��ϱ�
 * 
 * @author yoman
 * 
 * 2019. 09. 23
 *
 * ���ݱ����� �ϳ��� ���� �Է¹޴� �ڵ带 �ۼ��߽��ϴ�.
 * ������ ���� ���� ���� �Է� ���� �� �ֽ��ϴ�.
 */
public class KeyboardIOSample04 {

	public static void main(String[] args) throws IOException {
		// ���� ���� ���� �Է� �޴� ����
		
		// Ű���� �Է��� �䱸�ϴ� �޽����� ��½�ŵ�ϴ�.
		System.out.print("���� 2���� �Է��Ͻʽÿ�. > ");
		
		// Ű����κ��� �Է��� ���� �� �ְ� �ϴ� ������ �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Ű����� �Է��� ���ڿ��� ���� str1, str2�� �����մϴ�.(=> ���� Ű����� �Է��� �� Enter key�� �����ϴ�.)
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		// Ű����� �Է� ���� str1, str2�� ���������� ��ȯ�Ͽ� ���� num1, num2�� �����մϴ�.
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		// ���� num1, num2�� ��½�ŵ�ϴ�.
		System.out.println("����" + num1 + "(��)�� �ԷµǾ����ϴ�.");
		System.out.println("�� ��������, " + num2 + "(��)�� �ԷµǾ����ϴ�.");
	}

}
