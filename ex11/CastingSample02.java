package com.ezen.example;

/**
 * ����ȯ
 * ĳ��Ʈ ������(Cast operator)
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * ���� �������� ������ ū �������� ������ ������ ���� Ư���� �۾��� ���� �ʾҽ��ϴ�.
 * ������ ū �������� ������ ���� �������� ������ ������ ���� '�����'���� ����ȯ�� �����־�� �մϴ�.
 */
public class CastingSample02 {

	public static void main(String[] args) {
		// ���� �������� ���� �����ϱ� ����
		double dnum = 160.5;
		System.out.println("Ű�� " + dnum + "��Ƽ���� �Դϴ�.");
		
		System.out.println("int�� ������ �����մϴ�.");
		
		// ���� �������� �������� ������ �� �����ϴ�.
		// int inum = dnum;
		
		// ���� ĳ��Ʈ �����ڸ� ����Ͽ� ( ) �ȿ��� ������ �ڷ������� ���� ��ȯ ��ŵ�ϴ�.
		int inum = (int)dnum;
		
		// �Ҽ��� ���ϴ� ������ ������ ���� inum�� ��½�ŵ�ϴ�.
		System.out.println("Ű�� " + inum + "��Ƽ���� �Դϴ�.");

	}

}
