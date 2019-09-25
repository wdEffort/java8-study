package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �� ��° �������� - 05
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * Ű����� ������ �Է¹޾Ƽ�, �� ���� �Ҽ�����
 * ���θ� �Ǵ��ϴ� �ڵ带 �ۼ��ϼ���
 * 
 * �Ҽ� : 1 �Ǵ� �� �̿��� ���� ������ �������� �ʴ� �� (����� 1�� �ڱ� �ڽŻ��� ��)
 * Ex) 2, 3, 7, 11, 13, ...
 * ��� : ���� 0�� �ƴ� ���� D�� �������� �� ������ �������� ��� D�� N�� ������ �մϴ�.
 */
public class Practice05 {

	public static void main(String[] args) throws IOException {
		// Ű���� �Է��� �䱸�ϴ� �޽����� ��½�ŵ�ϴ�.
		System.out.println("2 �̻��� ���ڸ� �Է��ϼ���.");

		// Ű����κ��� �Է��� ���� �� �ְ� �ϴ� ������ �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		// �Է¹��� ���ڿ� ���� ����� ������ �����ϴ� ������ �����մϴ�.
		int count = 0;
		
		// 1�� �ڱ� �ڽ��� ������ ���������� �ݺ����� ó���˴ϴ�.
		for (int i = 2; i < num; i++) {
			// �Է¹��� ���� i�� �������� �� ������ �������� count�� ���� 1 ������ŵ�ϴ�.
			if (num % i == 0) {
				count++;
			}
		}
		
		// ����, count�� ���� 0�� ��� ����� �����ٴ� ���̹Ƿ� �Ҽ��� �Ǻ��˴ϴ�.
		if (count == 0) {
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		} else { // �׷��� ���� ��� �Է¹��� ���ڴ� �Ҽ��� �ƴմϴ�.
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
		}

	}

}
