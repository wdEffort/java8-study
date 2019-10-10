package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ������� �⺻
 * ��Ʈ��(Stream)�� ����
 * 
 * @author yoman
 * 
 * 2019. 10. 10
 * 
 * �Է°� ����� �ֿ� ����� ȭ�� �Ǵ� Ű���� �׸��� '����'�Դϴ�.
 * Java������ �̷��� �پ��� ��� ���� ������� '�ϰ��� ���'����
 * ó���� �� �ֽ��ϴ�.
 * 
 * �̸� �����ϱ� ���� ���Ե� ������ ��Ʈ���Դϴ�.
 * 
 * [����]
 * System.out : ǥ�� ���
 * System.in : ǥ�� �Է�
 */
public class StreamSample01 {

	public static void main(String[] args) {
		// ��Ʈ�� ��� ����
		
		System.out.println("���ڿ��� �Է��ϼ���.");
		
		try {
			// InputStreamReader Ŭ���� : ���ڳ� ���ڿ��� �а� �������� ���Ǵ� ��Ʈ��
			// BufferedReader Ŭ���� : ���۸� �����Ͽ� �б� �� ���� ȿ���� �������ϴ�.
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			System.out.println(str + "(��)�� �ԷµǾ����ϴ�.");
		} catch(IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}

	}

}
