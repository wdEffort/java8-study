package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���� ��° �������� - 01
 * 
 * @author yoman
 * 
 * 2019. 10. 02
 *
 * StringBuffer Ŭ������ reverse() �޼ҵ带 ��뿩 �־����� ���ڿ��� �Ųٷ� ����ϼ���.
 */
class Practice01 {

	public static void main(String[] args) throws IOException {
		System.out.println("���ڿ��� �Է��ϼ���.");
		
		// Ű����� ���� �Է¹ޱ� ���� ��ü�� �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Ű����� ���� �Է¹��� ���ڿ��� str ������ �����մϴ�.
		String str = br.readLine();
		
		System.out.println("�Է��� ���ڿ��� " + str + "�Դϴ�.");
		
		// ���ڿ��� ����(����)�ϱ� ���� StringBuffer ��ü�� �����մϴ�.
		StringBuffer sb = new StringBuffer(str);
		
		// reverse() �޼ҵ带 �̿��Ͽ� ����� ���ڿ��� �Ųٷ� ��ȯ��ŵ�ϴ�.
		sb.reverse();
		
		System.out.println("�Էµ� ���ڿ��� �Ųٷ� ����ϸ� " + sb + "�Դϴ�.");
		
	}

}
