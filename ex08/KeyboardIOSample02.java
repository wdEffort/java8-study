package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ű����� �Է��ϱ�
 * ����(����) �Է�
 * 
 * @author yoman
 * 
 * 2019. 09. 23
 *
 * ����ڷκ��� ���ڸ� �Է� ���� �� �ֽ��ϴ�.
 * ��, �Է� ���� ���ڸ� �ٷ�� ���ؼ��� 'Ű����� �Է� ���� ���ڿ��� ���ڷ� ��ȯ' �ϴ� �۾��� �ʿ��մϴ�.
 */
public class KeyboardIOSample02 {

	public static void main(String[] args) throws IOException {
		// ���� �Է� ����
		
		// Ű���� �Է��� �䱸�ϴ� �޽����� ��½�ŵ�ϴ�.
		System.out.print("����(����)�� �Է��մϴ�. > ");
		
		// Ű����κ��� �Է��� ���� �� �ְ� �ϴ� ������ �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Ű����� �Է��� ���ڿ��� ���� str�� �����մϴ�.(=> Ű����� �Է��� �� Enter key�� �����ϴ�.)
		String str = br.readLine();
		
		// Ű����� �Է� ���� ���ڿ� str�� ���������� ��ȯ�Ͽ� ���� num�� �����մϴ�.
		int num = Integer.parseInt(str);
		
		// ���� num�� ��½�ŵ�ϴ�.
		System.out.println(num + "(��)�� �ԷµǾ����ϴ�.");

	}

}
