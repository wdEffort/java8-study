package com.ezen.example;

/**
 * �ݺ��� ��ø
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * �ݺ��� �ȿ��� �ݺ����� ��ø ����� �� �ֽ��ϴ�.
 */
public class LoopSample08 {

	public static void main(String[] args) {
		// for �� ��ø ����
		
		// �ٱ� �ݺ����� �ѹ� ���� �Ǹ� ���� �ݺ����� ���� ����˴ϴ�.
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i�� " + i + ", j�� " + j);
			}
		}

	}

}
