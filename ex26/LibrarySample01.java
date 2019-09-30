package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ŭ���� ���̺귯��
 * Ŭ���� ���̺귯����?
 * 
 * @author yoman
 * 
 * 2019. 09. 30
 * 
 * Java�� ǥ�� ���� ȯ���� JDK���� ���� ���Ǵ� ����� ������
 * Ŭ���� ���̺귯��(Class library)�� �Ҹ��� Ŭ�������� �ټ� ���ԵǾ� �ֽ��ϴ�.
 * 
 * Ŭ���� ���̺귯���� Ŭ���� ������ �ۼ����� �ʾƵ�
 * Ŭ������ ����� �̿��� �� �ֽ��ϴ�.
 */
public class LibrarySample01 {

	public static void main(String[] args) throws IOException {
		// Ŭ���� ���̺귯�� ��� ����
		System.out.println("������ �Է��Ͻʽÿ�.");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		System.out.println(num + "�� �ԷµǾ����ϴ�.");
		
		// �� �������� ���� Ŭ���� ���̺귯��
		/*
		 * 1. IOException
		 * 2. BufferedReader
		 * 3. InputStreamReader
		 * 4. System
		 * 5. String
		 * 6. Integer
		 */
	}

}
