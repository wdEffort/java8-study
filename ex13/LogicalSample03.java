package com.ezen.example;

/**
 * ����(����) �������� ����
 * ������ ���� �Ǵ��ϱ�
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * ������ ������ �Ǵ��� �ʿ��ϴٸ� if ���� ������� �ʾƵ� ǥ���� �����մϴ�.
 */
public class LogicalSample03 {

	public static void main(String[] args) {
		// ���� ������ ����
		int a = 1;
		int b = 2;
		
		// ���� ������ ǥ���� : ���� ? ��(True)�� ��� �� : ����(False)�� ��� ��
		char res1 = (a == 1) ? 'Y' : 'N';
		char res2 = (b == 2 && b < 3) ? 'Y' : 'N';
		
		System.out.println("a�� ���� 1�Դϱ�? " + res1);
		System.out.println("b�� ���� 2�̰ų� 3���� �۽��ϱ�? " + res2);
		
	}

}
