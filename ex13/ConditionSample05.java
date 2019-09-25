package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���ǹ�
 * if ~ else ��
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * ������ ����(False)�� ��쿡�� Ư�� �ڵ带 ���� ��Ű�� if ~ else���� ������ϴ�.
 */
public class ConditionSample05 {

	public static void main(String[] args) throws IOException {
		// if ~ else ��� ����

		// Ű���� �Է��� �䱸�ϴ� �޽����� ��½�ŵ�ϴ�.
		System.out.println("������ �Է��Ͻʽÿ�.");

		// Ű����κ��� �Է��� ���� �� �ְ� �ϴ� ������ �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Ű����κ��� �Է��� �޾� ���ڿ� ���� str�� �����մϴ�.
		String str = br.readLine();
		// ���ڿ� str ������ ���� ���������� ��ȯ���� res�� �����մϴ�.
		int res = Integer.parseInt(str);
		
		if (res == 1) {
			System.out.println("1�� �ԷµǾ����ϴ�."); // ������ ��(True)�� ��� ����˴ϴ�.
		} else {
			System.out.println("1 ���� ���� �ԷµǾ����ϴ�."); // ������ ����(False)�� ��� ����˴ϴ�.
		}
		
		System.out.println("ó���� �����մϴ�.");

	}

}
