package com.ezen.example;

/**
 * ���� ���� ����ϱ�
 * 
 * @author yoman
 * 
 * 2019. 10. 09
 *
 * ���ܸ� �޾Ƴ� ����(e)�� Ȱ���ϸ�
 * ���� ������ ����ϴ� �� ���� �����մϴ�.
 */
public class ExceptionSample04 {

	public static void main(String[] args) {
		try {
			int[] test = new int[5];	
			test[10] = 80;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���̸� �Ѿ���ϴ�.");
			System.out.println(e + " �̶�� ���ܰ� �߻��߽��ϴ�.");
		}
		
		System.out.println("������ �����߽��ϴ�.");

	}

}
