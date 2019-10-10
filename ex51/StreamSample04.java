package com.ezen.example;

import java.io.*;

/**
 * ���� �ٷ��
 * ���� ���� ������ �Է��ϱ�
 * 
 * @author yoman
 * 
 * 2019. 10. 10
 * 
 * ���Ͽ��� �����͸� �Է��ϴ� ����� Ȱ���ϸ�
 * �ؽ�Ʈ ������� ���� ���Ͽ��� ���� ���� �����͸� ������ �� �ֽ��ϴ�.
 * 
 * �ҽ� ������ �ִ� ���丮�� 'test2.txt'�� ������ �� �����͸� �Է����ּ���.
 */
public class StreamSample04 {

	public static void main(String[] args) {
		try {
			// ���� �̸��� �Է��Ͽ� ǥ�� �Է��� ����ϱ� ���� ���ڽ�Ʈ���� �����մϴ�.
			// ���۸� �����Ͽ� �о���Դϴ�.
			BufferedReader br = new BufferedReader(new FileReader("test2.txt"));
			
			// ������ �迭�� �غ��մϴ�.
			int[] test = new int[10];
			String str;
			
			// �迭�� ���̸�ŭ ���� �����͸� �� �پ� �о���Դϴ�.
			for(int i = 0; i < test.length; i++) {
				str = br.readLine();
				test[i] = Integer.parseInt(str);
			}
			
			int max = test[0];
			int min = test[0];
			
			// �ִ�, �ּ� ���� ���մϴ�.
			for(int i = 0; i < test.length; i++) {
				if(max < test[i]) {
					max = test[i];
				}
				
				if(min > test[i]) {
					min = test[i];
				}
				System.out.println(test[i]);
			}
			
			System.out.println("�ְ� ���� " + max + "�Դϴ�.");
			System.out.println("���� ���� " + min + "�Դϴ�.");
			
			// ��Ʈ���� �ݽ��ϴ�.
			br.close();
		} catch (IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}

	}

}
