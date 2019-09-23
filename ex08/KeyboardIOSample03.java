package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ű����� �Է��ϱ�
 * ����(�Ҽ�) �Է�
 * 
 * @author yoman
 * 
 * 2019. 09. 23
 *
 * ����ڷκ��� ���ڸ� �Է� ���� �� �ֽ��ϴ�.
 * ��, �Է� ���� ���ڸ� �ٷ�� ���ؼ��� 'Ű����� �Է� ���� ���ڿ��� ���ڷ� ��ȯ' �ϴ� �۾��� �ʿ��մϴ�.
 */
public class KeyboardIOSample03 {

	public static void main(String[] args) throws IOException {
		// ���� �Է� ����
		
		// Ű���� �Է��� �䱸�ϴ� �޽����� ��½�ŵ�ϴ�.
		System.out.print("����(�Ҽ�)�� �Է��մϴ�. > ");
		
		// Ű����κ��� �Է��� ���� �� �ְ� �ϴ� ������ �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Ű����� �Է��� ���ڿ��� ���� str�� �����մϴ�.(=> Ű����� �Է��� �� Enter key�� �����ϴ�.)
		String str = br.readLine();
		
		// Ű����� �Է� ���� ���ڿ� str�� �Ǽ������� ��ȯ�Ͽ� ���� num�� �����մϴ�.
		double num = Double.parseDouble(str);
		
		// ���� num�� ��½�ŵ�ϴ�.
		System.out.println(num + "(��)�� �ԷµǾ����ϴ�.");

	}

}
