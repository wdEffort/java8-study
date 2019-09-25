package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���μ��� �帧�� ����
 * continue
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * continue : �ݺ�ó���� �ǳ� �� ����, ����� ���� ��ġ�� ���ư��� ���� �۾��� �����մϴ�.
 */
public class LoopSample11 {

	public static void main(String[] args) throws IOException {
		// continue ��� ����

		System.out.println("�� ��° ó���� �ǳ� �ٽðڽ��ϱ�? (1 ~ 10)");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		// �� 10�� �ݺ��ϴ� for ���� �����մϴ�.
		for (int i = 1; i <= 10; i++) {
			if (i == res) // Ű����� �Է��� ���� ������ �ݺ� Ƚ���� �Ǹ� ���̻� �������� �ʰ�, ó������ ���ư��ϴ�.
				continue;
			
			System.out.println(i + "��° �ݺ��մϴ�."); // �Է��� n��°�� ó������ �� ������ ������� �ʽ��ϴ�.
		}

	}

}
