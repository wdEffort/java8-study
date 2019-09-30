package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ŭ���� ���̺귯��
 * ���ڿ� ó�� Ŭ����
 * 
 * @author yoman
 * 
 * 2019. 09. 30
 * 
 * String Ŭ������ indexOf() �޼ҵ忡 ���� �˾ƺ��ϴ�.
 * indexOf() �޼ҵ�� ���ڸ� ã�� ���� ��� '-1'�� ��ȯ�մϴ�.
 */
public class StringMethodSample02 {

	public static void main(String[] args) throws IOException {
		System.out.println("���ڿ��� �Է��ϼ���.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		System.out.println("�˻��� ���ڸ� �Է��ϼ���.");
		
		String str2 = br.readLine(); // �˻��� ���ڿ��� �Է��մϴ�.
		char ch = str2.charAt(0); // �Է��� �˻� ���ڿ����� ù ��° ���ڸ� �����մϴ�.
		int num = str1.indexOf(ch); // �˻� ������ ���� ��� ��ġ�� �����մϴ�.
		
		// �˻� ���, ���ڸ� ã�� ���� ���
		if (num != -1) {
			System.out.println(str1 + "�� " + (num + 1) + " ��°���� \'" + ch + "\' ��(��) �߰��߽��ϴ�.");
		} else {
			System.out.println(str1 + "���� \'" + ch + "\'��(��) ã�� �� �������ϴ�.");
		}

	}

}
