package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �� ������
 * ������ ���� �Ǵ��ϱ�
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 */
public class LogicalSample02 {

	public static void main(String[] args) throws IOException {
		// �� �����ڸ� �̿��� ������ ���� �Ǵ� �ǽ� ����
		System.out.println("����� �л��Դϱ�?");
		System.out.println("Y �Ǵ� N�� �Է��Ͻʽÿ�.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		char res = str.charAt(0);
		
		if (res == 'Y' || res == 'y') { // 'Y' �Ǵ� 'y'�� �Էµ� ��� �����մϴ�.
			System.out.println("����� �л��Դϴ�.");
		} else if (res == 'N' || res == 'n') { // 'N' �Ǵ� 'n'�� �Էµ� ��� �����մϴ�.
			System.out.println("����� �л��� �ƴմϴ�.");
		} else { // 'Y', 'y', 'N', 'n' �̿��� ���ڰ� �Էµ� ��� �����մϴ�.
			System.out.println("Y �Ǵ� N�� �Է��Ͻʽÿ�.");
		}
	}

}
