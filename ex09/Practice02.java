package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �� ��° �������� - 02
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * ����� ����Դϱ�?
 * 23 (<< �Է�)
 * ����� 23���Դϴ�.
 * 
 * ���� ���� ȭ�鿡 ����ϴ� �ڵ带 �ۼ��Ͻʽÿ�.
 */
public class Practice02 {

	public static void main(String[] args) throws IOException {
		// Ű���� �Է��� �䱸�ϴ� �޽����� ��½�ŵ�ϴ�.
		System.out.println("����� �� ���Դϱ�?");
		
		// Ű����κ��� �Է��� ���� �� �ְ� �ϴ� ������ �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Ű����� �Է��� ���ڿ��� ���� str�� �����մϴ�.(=> Ű����� �Է��� �� Enter key�� �����ϴ�.)
		String str = br.readLine();
		
		// ���ڿ� ���� str�� ���������� ��ȯ��Ų �� ���� num�� �����մϴ�.
		int num = Integer.parseInt(str);
		
		// ���� str�� ��½�ŵ�ϴ�.
		System.out.println("����� " + num + "���Դϴ�.") ;

	}

}
