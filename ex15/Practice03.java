package com.ezen.example;

/**
 * �� ��° �������� - 03
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * �� ����(\n)�� ����ؼ� �Ʒ��� ���� �������� ȭ�鿡 ����ϴ� �ڵ带 �ۼ��Ͻʽÿ�.
 * 1	2	3	4	5	6	7	8	9
 * 2	4	6	8	10	12	14	16	18
 * ...
 * 9	18	27	36	45	54	63	72	81
 */
public class Practice03 {

	public static void main(String[] args) {
		// �ٱ��� �ݺ����� �ѹ� ����� �� ���� �ݺ����� 9�� ����˴ϴ�.
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}

	}

}
