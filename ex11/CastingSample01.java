package com.ezen.example;

/**
 * ����ȯ
 * ū �������� ���� �����ϱ�
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * ����ȯ�̶�
 * �������� �ڷ����� �ٲٴ� �۾��� ���մϴ�.
 */
public class CastingSample01 {

	public static void main(String[] args) {
		// ����ȯ ����
		int inum = 160;
		
		System.out.println("Ű�� " + inum + "��Ƽ���� �Դϴ�.");
		
		System.out.println("double�� ������ �����մϴ�.");
		
		// int : 4byte, double : 8byte
		// ������ ���� inum�� ū �������� ���� dnum�� �����մϴ�.
		double dnum = inum;
		
		System.out.println("Ű�� " + dnum + "��Ƽ���� �Դϴ�.");
		

	}

}
