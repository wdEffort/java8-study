package com.ezen.example;

/**
 * ���ܿ� Ŭ����
 * 
 * @author yoman
 * 
 * 2019. 10. 09
 *
 * ���ܶ�, Ŭ���� ���̺귯�� java.lang ��Ű���� ����
 * 'Throwable Ŭ����'�� Ȯ���� ���� Ŭ������ ��ü�� ���մϴ�.
 * 
 * ��, ArrayIndexOutOfBoundsException�� 
 * Throwable Ŭ������ ���� Ŭ������ Ȯ���� Ŭ������ ��ü�Դϴ�.
 */
public class ExceptionSample03 {

	public static void main(String[] args) {
		try {
			int[] test = new int[5];	
			test[10] = 80;
		} catch(ArrayIndexOutOfBoundsException e) { // catch ����� ���� ��ü�� ������ ���� e�� �� ���� ��ü�� ����Ű�Ե˴ϴ�.
			System.out.println("�迭 ���̸� �Ѿ���ϴ�.");
		}
		
		System.out.println("������ �����߽��ϴ�.");

	}

}
