package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �ݺ���
 * for �� ���� ���� - 01
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * �Է��� ���ڸ�ŭ '*'�� ����ϴ� ����
 */
public class LoopSample04 {

	public static void main(String[] args) throws IOException {
		System.out.println("�� ���� *�� ��� �Ͻðڽ��ϱ�?");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		// �Է��� �� ��ŭ �ݺ��ؼ� '*'�� ����մϴ�.
		for (int i = 1; i <= num; i++) {
			System.out.print("*");
		}

	}

}
