package com.ezen.example;

/**
 * ����ȯ
 * �ٸ� ������ �����ϱ�
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * �ٸ� �������� ������ ����Ǹ�
 * �� �ǿ������� ũ��(�ڷ����� ũ��)�� ���Ͽ� 
 * �� �߿��� ū ������������ ����ȯ ��Ų �� ������ �����մϴ�.
 */
public class CastingSample03 {

	public static void main(String[] args) {
		// �ٸ� �������� ���� ����
		int d = 2;
		double pi = 3.14;
		
		// �ڷ����� ũ��
		// int : 4byte, double : 8byte
		
		System.out.println("������ " + d + "��Ƽ������ ���� ");
		System.out.println("�ѷ���  " + (d * pi) + "��Ƽ���� �Դϴ�."); // int�� ���� d�� double������ ��ȯ�Ǿ� ����˴ϴ�.
	}

}
