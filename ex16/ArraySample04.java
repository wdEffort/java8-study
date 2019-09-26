package com.ezen.example;

/**
 * �迭(Array)
 * �迭 ������ �� �����ϱ�
 * 
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * ���� ������(=)�� ����Ͽ� �̹� ������ �迭�� �����ϴ� ����� �ֽ��ϴ�.
 */
public class ArraySample04 {

	public static void main(String[] args) {
		// �迭 ������ �� �����ϱ� ����
		int[] a = new int[3];
		
		System.out.println("�迭 a�� �����ϰ�, ��Ҹ� �����Ͽ����ϴ�.");
		
		// �迭 a�� ���� �����մϴ�.
		a[0] = 1;
		a[1] = 10;
		a[2] = 100;
		
		int[] b;
		System.out.println("�迭 b�� �����Ͽ����ϴ�.");
		
		System.out.println("�迭 ���� b�� a�� �����մϴ�.");
		b = a;
		
		// �迭 a ����� ���� ����մϴ�.
		for (int i = 0; i < 3; i++) {
			System.out.println("a�� ����Ű��" + (i + 1) + "��° ���� " + a[i] + "�Դϴ�.");
		}
		
		// �迭 b ����� ���� ����մϴ�.		
		for (int i = 0; i < 3; i++) {
			System.out.println("b�� ����Ű��" + (i + 1) + "��° ���� " + b[i] + "�Դϴ�.");
		}
		
	}

}
