package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���ǹ�
 * if ~ else if ~ else ��
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * �� �� �̻��� ������ �Ǵ��ϰ� �����ų �� �ֵ��� 
 * if ~ else if ~ else ���� ������ϴ�.
 * 
 * ����
 * if (����1)
 *   ����;
 * else if (����2)
 *   ����;
 * else
 *    ����;
 */
public class ConditionSample06 {

	public static void main(String[] args) throws IOException {
		// if ~ else if ~ else ��� ����

		// Ű���� �Է��� �䱸�ϴ� �޽����� ��½�ŵ�ϴ�.
		System.out.println("������ �Է��Ͻʽÿ�.");

		// Ű����κ��� �Է��� ���� �� �ְ� �ϴ� ������ �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Ű����κ��� �Է��� �޾� ���ڿ� ���� str�� �����մϴ�.
		String str = br.readLine();
		// ���ڿ� str ������ ���� ���������� ��ȯ���� res�� �����մϴ�.
		int res = Integer.parseInt(str);
		
		if (res == 1) {
			System.out.println("1�� �ԷµǾ����ϴ�."); // 1�� �Էµ� ��� ����˴ϴ�.
		} else if (res == 2) {
			System.out.println("2�� �ԷµǾ����ϴ�."); // 2�� �Էµ� ��� ����˴ϴ�.
		} else {
			System.out.println("1 Ȥ�� 2�� �Է��Ͻʽÿ�."); // 1 Ȥ�� 2 �̿��� ���� �Էµ� ��� ����˴ϴ�.
		}
		
		System.out.println("ó���� �����մϴ�.");

	}

}
