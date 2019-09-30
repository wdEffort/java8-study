package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ŭ���� ���̺귯��
 * ���ڿ� �߰��ϱ�
 * 
 * @author yoman
 * 
 * 2019. 09. 30
 * 
 * String Ŭ������ ������ ��ü�� ����(���ڿ�)�� ������ �� �����ϴ�.
 * ��, ���� ������ �����ϳ� ����(����) �� �� �ִ� �޼ҵ�� �����ϴ�.
 * => ���ڿ��� ���ڸ� �����ϴ� ���, ������ StringBuffer Ŭ������ ����ؾ� �մϴ�. 
 * 
 * ���ڿ��� �߰��ϴ� ���
 * append() �޼ҵ带 ����մϴ�.
 */
public class StringBufferSample01 {

	public static void main(String[] args) throws IOException {
		// StringBuffer Ŭ���� ��� ����
		System.out.println("���ڿ��� �Է��ϼ���.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		System.out.println("�߰��� ���ڸ� �Է��ϼ���.");
		
		String str2 = br.readLine(); // �߰��� ���ڸ� �Է��մϴ�.
		StringBuffer sb = new StringBuffer(str1); // ���ڿ��� �����ϱ� ���� StringBuffer ��ü�� �����մϴ�.
		sb.append(str2); // �Է¹��� ���ڿ��� �߰��մϴ�.
		
		System.out.println(str1 + "�� " + str2 + "��(��) �߰��ϸ� " + sb + "�Դϴ�.");
		
	}

}
