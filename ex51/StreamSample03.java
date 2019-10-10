package com.ezen.example;

import java.io.*;

/**
 * ���� �ٷ��
 * ���Ϸ� �Է��ϱ�
 * 
 * @author yoman
 * 
 * 2019. 10. 10
 * 
 * StreamSample02���� ������ .txt ������ �о���̴�
 * ���� �ڵ带 �ۼ��� ���ϴ�.
 * 
 * [java.io.Reader Ŭ������ ���� �÷���]
 * FileReader : ������ �о���̱� ���� ���� ��Ʈ��
 * BufferedReader : ���۸� ������ �о� ���̱� ���� ���� ��Ʈ��
 * 
 * [����]
 * ��� : ���Ϸ� �������� ����
 * �Է� : ������ �о���̴� ����
 */
public class StreamSample03 {

	public static void main(String[] args) {
		// ���� �о���̴� ����
		
		try {
			// ���� �̸��� �Է��Ͽ� ǥ�� �Է��� ����ϱ� ���� ���ڽ�Ʈ���� �����մϴ�.
			// ���۸� �����Ͽ� �о���Դϴ�.
			BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
			
			// �� �پ� �о���Դϴ�.
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			System.out.println("���Ͽ� ��ϵ� 2���� ���ڿ��� ");
			System.out.println(str1 + "�Դϴ�.");
			System.out.println(str2 + "�Դϴ�.");
			
			// ��Ʈ���� �ݽ��ϴ�.
			br.close();
		} catch(IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}
		
	}

}
