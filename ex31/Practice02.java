package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���� ��° �������� - 02
 * 
 * @author yoman
 * 
 * 2019. 10. 02
 *
 * StringBuffer Ŭ������ �޼ҵ带 ����Ͽ� �Ʒ��� ���� ��µǴ� �ڵ带 �ۼ��Ͻʽÿ�.
 * 
 * ���ڿ��� �Է��Ͻʽÿ�.
 * Hello
 * 'a'�� �� ��ġ�� ������ �Է��Ͻʽÿ�.
 * 2
 * Heallo�� �Ǿ����ϴ�.
 */
class Practice02 {

	public static void main(String[] args) throws IOException {
		System.out.println("���ڿ��� �Է��Ͻʽÿ�.");
		
		// Ű����� ���� �Է¹ޱ� ���� ��ü�� �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Ű����� ���� �Է¹��� ���ڿ��� str1 ������ �����մϴ�.
		String str1 = br.readLine();
		
		// ���ڿ��� ����(����)�ϱ� ���� StringBuffer ��ü�� �����մϴ�.
		StringBuffer sb = new StringBuffer(str1);
		
		System.out.println("\'a\'�� �� ��ġ�� ������ �Է��Ͻʽÿ�.");
		
		// 'a'�� �� ��ġ�� ���ڷ� �Է¹޾� str2 ������ �����մϴ�.
		String str2 = br.readLine();
		int offset = Integer.parseInt(str2);
		
		// insert() �޼ҵ带 ����Ͽ� ���ϴ� ��ġ�� 'a'�� ���� �ֽ��ϴ�.
		sb.insert(offset, 'a');
		
		System.out.println(sb + "�� �Ǿ����ϴ�.");
	}

}
