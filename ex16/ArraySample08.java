package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �迭�� ����
 * ����
 * 
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * �迭 �ȿ� ��� �ִ� ���� ���� �� �� �ֽ��ϴ�.
 */
public class ArraySample08 {

	public static void main(String[] args) throws IOException {
		// �迭 ��Ҹ� �����ϴ� ����
		int[] test = new int[5];
				
		System.out.println("���� �Է��ϼ���.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �迭 ���� test�� ũ��(����)��ŭ ���� �Է� �޾� �����մϴ�.
		for (int i = 0; i < test.length; i++) {
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}
		
		// �迭 ���� test ����� ���� ���� �������� ������ �����մϴ�.
		// �ٱ��� for �������� ������ ��ҿ� ���ؼ��� �˻簡 �ʿ� �����Ƿ� (���� - 1) ��ŭ �ݺ��մϴ�.
		for (int j = 0; j < (test.length - 1); j++) {
			// ���� for �������� �迭�� ���� ��ҿ� ���ϱ� ���Ͽ� �ٱ��� for �� ���� ��ġ +1 ��ġ���� �����ϵ��� �մϴ�.
			for (int k = (j + 1); k < test.length; k++) {
				// ���� ���� ���� ����� ���� ���Ͽ� ������ ����˴ϴ�.
				if (test[k] > test[j]) {
					int tmp = test[k];
					test[k] = test[j];
					test[j] = tmp;
				}
			}
		}
		
		System.out.println("���ĵ� ����� ����մϴ�.");
		
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + "\t");
		}

	}

}
