package com.ezen.example;

/**
 * �ݺ���
 * do ~ while��
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * do ~ while���� while���� ����ϳ� �������� �ֽ��ϴ�.
 * while �������� ��� ���� �ڵ带 �����ϱ� �ռ��� ������ ���� �Ǻ��մϴ�.
 * ������ do ~ while �������� ��� �ѹ�, �ݵ�� ��� ���� �ڵ尡 ����� �� ������ �Ǻ��մϴ�.
 */
public class LoopSample07 {

	public static void main(String[] args) {
		// do ~ while �� ����
		int i = 1;
		
		do {
			System.out.println(i + "��° �ݺ��մϴ�.");
			i++;
		} while (i <= 5); // while���� �޸� ����Ŭ��(;)�� ����ߴٴ� ���� ���� �Ͻñ� �ٶ��ϴ�.
		
		System.out.println("�ݺ��� �������ϴ�.");

	}

}
