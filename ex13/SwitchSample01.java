package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���ǹ�
 * switch ~ case ��
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * if ��ó�� ���ǿ� ���� ó���� ������ �� �ִ� switch ~ case ���� ������ϴ�.
 * ��� ���Ǳ⸦ ���÷� �ּ���.
 * 
 * ����
 * switch (����) {
 *   case �� 1:
 *       ����;
 *       break;
 *   case ��2:
 *       ����;
 *       break;
 *   default:
 *       ����;
 *       break;
 * }
 * 
 * ������ if ~ else if ~ else ���� ����մϴ�.
 */
public class SwitchSample01 {

	public static void main(String[] args) throws IOException {
		// switch ~ case ����

		// Ű���� �Է��� �䱸�ϴ� �޽����� ��½�ŵ�ϴ�.
		System.out.println("������ �Է��Ͻʽÿ�.");

		// Ű����κ��� �Է��� ���� �� �ְ� �ϴ� ������ �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Ű����κ��� �Է��� �޾� ���ڿ� ���� str�� �����մϴ�.
		String str = br.readLine();
		// ���ڿ� str ������ ���� ���������� ��ȯ���� res�� �����մϴ�.
		int res = Integer.parseInt(str);
		
		switch (res) {
			case 1: // 1�� �Էµ� ��� ����˴ϴ�.
				System.out.println("1�� �ԷµǾ����ϴ�.");
				break;
			case 2: // 2�� �Էµ� ��� ����˴ϴ�.
				System.out.println("2�� �ԷµǾ����ϴ�.");
				break;
			default: // 1 Ȥ�� 2 �̿��� ����  �Էµ� ��� ����˴ϴ�.
				System.out.println("1 Ȥ�� 2�� �Է��Ͻʽÿ�.");
				break;
		}

	}

}
