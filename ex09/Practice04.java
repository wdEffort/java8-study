package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �� ��° �������� - 04
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * Ű�� �����Ը� �Է��Ͻʽÿ�.
 * 165.2 (<< �Է�)
 * 52.5 (<< �Է�)
 * Ű�� 165.2��Ƽ�����Դϴ�.
 * �����Դ� 52.5ų�α׷��Դϴ�.
 * 
 * ���� ���� ȭ�鿡 ����ϴ� �ڵ带 �ۼ��Ͻʽÿ�.
 */
public class Practice04 {

	public static void main(String[] args) throws IOException {
		// Ű���� �Է��� �䱸�ϴ� �޽����� ��½�ŵ�ϴ�.
		System.out.println("Ű�� �����Ը� �Է��Ͻʽÿ�.");

		// Ű����κ��� �Է��� ���� �� �ְ� �ϴ� ������ �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Ű����� �Է��� ���ڿ��� ���� str1, str2�� �����մϴ�.(=> ���� Ű����� �Է��� �� Enter key�� �����ϴ�.)
		String str1 = br.readLine();
		String str2 = br.readLine();

		// ���ڿ� ���� str1, str2�� �Ǽ������� ��ȯ��Ų �� ���� heigth, weight�� �����մϴ�.
		double height = Double.parseDouble(str1);
		double weight = Double.parseDouble(str2);

		// �Ǽ��� ���� height, weight�� ��½�ŵ�ϴ�.
		System.out.println("Ű�� " + height + "��Ƽ�����Դϴ�.");
		System.out.println("�����Դ� " + weight + "ų�α׷��Դϴ�.");
	}

}
