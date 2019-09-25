package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���ǹ�
 * if ���� ���� �����ϱ�
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * Java���� �پ��� ��Ȳ�� ���� ó���� �ϱ� ����
 * ��ǥ���� ���� �Ǵܹ�(Conditional statement)���� if ���� ����մϴ�.
 * 
 * ����
 * if (����)
 *   ����; << ������ ��(True)�� �� ����˴ϴ�.
 */
public class ConditionSample02 {

	public static void main(String[] args) throws IOException {
		// if �� ��� ����
		
		// Ű���� �Է��� �䱸�ϴ� �޽����� ��½�ŵ�ϴ�.
		System.out.println("������ �Է��Ͻʽÿ�.");
		
		// Ű����κ��� �Է��� ���� �� �ְ� �ϴ� ������ �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Ű����κ��� �Է��� �޾� ���ڿ� ���� str�� �����մϴ�.
		String str = br.readLine();
		
		// ���ڿ� str ������ ���� ���������� ��ȯ���� res�� �����մϴ�.
		int res = Integer.parseInt(str);
		
		// ������ ���� res�� ���� 1���� ������ �����ϴ�
		// ��(True)�� ��� �Ʒ� ������ ����˴ϴ�.
		// ����(False)�� ��� �Ʒ� ������ ������� �ʽ��ϴ�.
		if (res == 1)
			System.out.println("1�� �ԷµǾ����ϴ�.");
		
		System.out.println("ó���� �����մϴ�.");
	}

}
