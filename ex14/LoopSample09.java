package com.ezen.example;

/**
 * ����, �ݺ��� ��ø
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * if �� ��� �����Ͽ� �ݺ����� ����� �� �ֽ��ϴ�.
 */
public class LoopSample09 {

	public static void main(String[] args) {
		// if ���� �ݺ����� ��ø ����
		
		// ��(True), ����(False)�� ���� ������ �ִ� ���� b1�� �����ϰ� ����(False)�� �ʱ�ȭ�մϴ�.
		boolean b1 = false;
		
		// �ٱ� �ݺ����� �ѹ� ���� �Ǹ� ���� �ݺ����� �ټ��� ����˴ϴ�.
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (b1 == false) { // b1�� ���� ����(Flase)�� ��� ����˴ϴ�.
					System.out.print("*");
					b1 = true;
				} else { // b1�� ���� ��(True)�� ��� ����˴ϴ�.
					System.out.print("-");
					b1 = false;
				}
			}
			System.out.println("\n");
		}

	}

}
