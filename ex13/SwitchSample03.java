package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���ǹ�
 * �Էµ� ���ڷ� �б�ó�� �ϱ�
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * ���ݱ����� ���ڷθ� �б�ó���� �ؿԽ��ϴ�.
 * ���ڷ� �б��ϴ� ����� ������ϴ�.
 */
public class SwitchSample03 {

	public static void main(String[] args) throws IOException {
		// Ű���� �Է��� �䱸�ϴ� �޽����� ��½�ŵ�ϴ�.
		System.out.println("a Ȥ�� b�� �Է��Ͻʽÿ�.");

		// Ű����κ��� �Է��� ���� �� �ְ� �ϴ� ������ �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Ű����κ��� �Է��� �޾� ���ڿ� ���� str�� �����մϴ�.
		String str = br.readLine();
		// �Է¹��� ���ڿ��� ���� ù��° ���ڸ� �̾Ƴ��ϴ�. (charAt()�� ���ؼ��� ���Ŀ� �ڼ��� �ٷ�ϴ�.)
		char res = str.charAt(0);

		switch (res) {
			case 'a':
				System.out.println("a�� �ԷµǾ����ϴ�.");
				break;
			case 'b':
				System.out.println("b�� �ԷµǾ����ϴ�.");
				break;
			default:
				System.out.println("a Ȥ�� b�� �Է��Ͻʽÿ�.");
				break;
		}

	}

}
