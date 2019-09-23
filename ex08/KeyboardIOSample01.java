package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ű����� �Է��ϱ�
 * Scanner, BufferedReader(���⼭ �ٷ�ϴ�.)
 * 
 * @author yoman
 * 
 * 2019. 09. 23
 *
 * ���ݱ����� �ۼ��� �ڵ带 ȭ�鿡 ��½�Ű�� �۾��� �߽��ϴ�.
 * ���⼭�� ����ڷκ��� Ű���忡 �Է��� ���� ���� ��½�Ű�� �ڵ带 �ۼ��� ���ڽ��ϴ�.
 * 
 * ǥ���Է�: System.in => ��ǻ���� Ű����
 * ǥ����� : System.out => ��ǻ���� ȭ��
 */
public class KeyboardIOSample01 {

	public static void main(String[] args) throws IOException {
		// Ű���� �Է� �� ��� ����
		
		// Ű���� �Է��� �䱸�ϴ� �޽����� ��½�ŵ�ϴ�.
		System.out.print("���ڿ��� �Է��Ͻʽÿ�. > ");
		
		// Ű����κ��� �Է��� ���� �� �ְ� �ϴ� ������ �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Ű����� �Է��� ���ڿ��� ���� str�� �����մϴ�.(=> Ű����� �Է��� �� Enter key�� �����ϴ�.)
		String str = br.readLine();
		
		// ���� str�� ��½�ŵ�ϴ�.
		System.out.println(str + "(��)�� �ԷµǾ����ϴ�.");
	}

}
