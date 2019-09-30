package com.ezen.example;

/**
 * Ŭ���� ���̺귯��
 * Math Ŭ����
 * 
 * @author yoman
 * 
 * 2019. 10. 01
 * 
 * Java������ �������� ��� ����� ������
 * Math Ŭ������ �ֽ��ϴ�.
 * 
 * �ֿ� 'Ŭ���� �޼ҵ�'
 * 1. abs(double d) : �Ǽ��� �μ��� ���밪 ��ȯ(double)
 * 2. abs(int i) : ������ �μ��� ���밪 ��ȯ(int)
 * 3. ceil(double d) : �Ǽ��� �μ��� �ø� ���� ��ȯ(double)
 * 4. cos(double a) : �Ǽ��� �μ��� �ڻ��� ���� ��ȯ(double)
 * 5. floor(doulbe d) : �Ǽ��� �μ��� �������� ��ȯ(double)
 * 6. max(double a, double b) : 2���� �Ǽ��� �μ��� ū ���� ��ȯ(double)
 * 7. max(int a, int b) : 2���� ������ �μ��� ū ���� ��ȯ(int)
 * 8. min(double a, double b) : 2���� �Ǽ��� �μ��� ���� ���� ��ȯ(double)
 * 9. pow(double a, double b) : ù ��° �μ��� �� ��° �μ���  �ŵ� ������ ����� ��ȯ(double)
 * 10. random() : 0.0 ~ 1.0 �̸��� ������ ��ȯ(double)
 * 11. rint(double d) : �Ǽ��� �μ��� ���� ����� �������� ��ȯ(double)
 * 12. sin(double d) : �μ��� ���ΰ��� ��ȯ(double)
 * 13. sqrt(double d) : �Ǽ��� �μ��� �������� ��ȯ(double)
 * 14. tan(double d) : �Ǽ��� �μ��� ź��Ʈ ���� ��ȯ(double)
 */
public class MathSample01 {

	public static void main(String[] args) {
		// Math Ŭ���� �ֿ� �޼ҵ� ��뿹��
		System.out.println("-1.2�� ���밪�� " + Math.abs(-1.2) + "�Դϴ�.");
		System.out.println("1.4�� �ø��ϸ� " + Math.ceil(1.4) + "�Դϴ�.");
		System.out.println("-1.9�� �ø��ϸ� " + Math.ceil(-1.9) + "�Դϴ�.");
		System.out.println("2.5�� �����ϸ� " + Math.floor(2.5) + "�Դϴ�.");
		System.out.println("1�� 2�� ū ���� " + Math.max(1, 2) + "�Դϴ�.");
		System.out.println("-1.3�� -2.8�� ���� ����" + Math.min(-1.3, -2.8) + "�Դϴ�.");
		System.out.println("3�� 3�� �������� " + Math.pow(3, 3) + "�Դϴ�.");
		System.out.println("1.9�� ���� ����� �������� " + Math.rint(1.9) + "�Դϴ�.");
		System.out.println("1024�� �������� " + Math.sqrt(1024) + "�Դϴ�.");

		// random() �޼ҵ� ����
		// �ʿ��� ���� ���� ���� ������, ���� ���� �߰��� ������ �ϰų� ������ �ؾ� �մϴ�.
		// �Ʒ��� 1 ~ 6 ������ �������� ���ϴ� �ڵ��Դϴ�. (=> ������ ������� ������.)
		int num = (int) (Math.random() * 6) + 1;
		System.out.println("�߻��� ������ " + num + "�Դϴ�.");
	}

}
