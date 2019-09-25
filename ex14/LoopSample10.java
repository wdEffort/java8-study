package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���μ��� �帧�� ����
 * break
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * break : ó���� �帧�� ������ �����Ű��, �� ��Ͽ��� ���������ϴ�.
 */
public class LoopSample10 {

	public static void main(String[] args) throws IOException {
		// break ��� ����
		
		System.out.println("�� ��°���� �ݺ����� ���� �����ðڽ��ϱ�? (1~10)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		// �� 10�� �ݺ��ϴ� for ���� �����մϴ�.
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "��° �ݺ��մϴ�.");
			
			if (i == res) // Ű����� �Է¹��� Ƚ����ŭ �ݺ��� �� for ���� ���������ϴ�.
				break;
		}

	}

}
