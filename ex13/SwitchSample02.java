package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���ǹ�
 * switch ~ case ������ break�� �߿伺
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * Java���� break��
 * ��� ���� ������ �帧�� ���� ���� ��ŵ�ϴ�.
 * 
 * switch ~ case ���� break ���� �����ų�
 * ����� ����� ������ ��� ���� ������ ������� �����ŵ�ϴ�.
 * ���� �ùٸ� ��ġ�� break ���� ���� ������ �ǵ����� �ʴ� �����
 * ��� �� �� �ֽ��ϴ�.
 */
public class SwitchSample02 {

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
			case 1: 
				// break �� ���� �ִ� ��� �ǵ����� �ʴ� ����� ��� �� �� �ֽ��ϴ�.
				System.out.println("1�� �ԷµǾ����ϴ�.");
			case 2: 
				System.out.println("2�� �ԷµǾ����ϴ�.");
				break;
			default: 
				System.out.println("1 Ȥ�� 2�� �Է��Ͻʽÿ�.");
				break;
		}

	}

}
