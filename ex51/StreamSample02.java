package com.ezen.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * ���� �ٷ��
 * ���Ͽ� ����ϱ�
 * 
 * @author yoman
 * 
 * 2019. 10. 10
 * 
 * Ű����� �����͸� �Է��ϰų� ȭ�鿡 ����ϴ� ���α׷��� �ſ� ���մϴ�.
 * �׷��� �����͸� �������� �����ϰų� �����͸� �뷮���� �о���̱� ���ؼ���
 * '����'�� ����Ͽ� �����͸� �����ؾ� �մϴ�.
 * 
 * ��Ʈ���� ����Ͽ� ���� ����� �ڵ带 �ۼ��� �� �ֽ��ϴ�.
 * ������ ����ϸ� �����͸� �����ϰų� �о���̴� �ǿ����� ���α׷��� ���� �� �ֽ��ϴ�.
 * 
 * [java.io.Writer Ŭ������ ���� �÷���]
 * FileWriter : ���Ͽ� ����ϱ� ���� ���� ��Ʈ��
 * BufferedWriter : ���۸� �����ؼ� ����ϱ� ���� ���� ��Ʈ��
 * PrintWriter : �� �پ� ����ϱ� ���� ���� ��Ʈ��
 * 
 * [����]
 * ��� : ���Ϸ� �������� ����
 * �Է� : ������ �о���̴� ����
 */
public class StreamSample02 {

	public static void main(String[] args) {
		// ���� ��� �ǽ� ����
		
		try {
			// ���� �̸��� �Է��Ͽ� ǥ�� �Է��� ����ϱ� ���� ���ڽ�Ʈ���� �����մϴ�.
			// ���͸� �����Ͽ� �о���̰�, �� �پ� ����ϱ� ���� PrintWriter Ŭ������ ��ü�� �����մϴ�.
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")));
			
			// println() �޼ҵ带 ����Ͽ� �� �پ� ����մϴ�.
			pw.println("Hello!");
			pw.println("Goodbye!");
			
			System.out.println("���Ͽ� ��ϵǾ����ϴ�.");
			
			// ������ �ݽ��ϴ�.
			pw.close();
		} catch(IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}

	}

}
