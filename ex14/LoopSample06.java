package com.ezen.example;

/**
 * �ݺ���
 * while��
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * while���� for ���� ����ϰ� �ݺ��� ó���ϴ� �����Դϴ�.
 * ��, while���� ������ ��(True)�� ��쿡�� ������ ������ ���� �� �ݺ� �����մϴ�.
 * 
 * ���ǻ���
 * while���� ����� ���� �ݵ�� ������ ����(False)�� �Ǵ� ó���� ���־�� �մϴ�.
 * �׷��� ������ ������ �ݺ����� ����Ǿ� �����ϴ�.
 */
public class LoopSample06 {

	public static void main(String[] args) {
		// while�� ����
		int i = 1;
		
		// while �� �ȿ� ������ ��(True)�� ��쿡�� ������ ����˴ϴ�.
		while (i <= 5) {
			System.out.println(i + "��° �ݺ��մϴ�.");
			i++; // ������ ����(False)�� ����������� �ݺ� ���� �� ������ ���� i�� 1�� ���ϰ� �ֽ��ϴ�.
		}
		
		System.out.println("�ݺ��� �������ϴ�.");
	}

}
