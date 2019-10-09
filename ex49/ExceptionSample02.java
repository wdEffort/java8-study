package com.ezen.example;

/**
 * ���� ó���ϱ�(Exception Handling)
 * 
 * @author yoman
 * 
 * 2019. 10. 09
 * 
 * ExceptionSample01������ ���� �߻��� ����Ͽ� ���ٸ� ó���� ���� �ʾҽ��ϴ�.
 * �׷��� ���ܸ� �����ϰ� ó���ϴ� �ڵ带 �ۼ��ϰ� �Ǹ�,
 * �߰��� ���α׷��� �ۼ��� �� �ֽ��ϴ�.
 * 
 * �̸� '���� ó��'��� �θ��ϴ�.
 * 
 * [���� ó�� ���]
 * try {
 *     ���� �߻��� ������ ����;
 * } catch(���� Ŭ���� ������) {
 *     ���ܰ� �߻����� �� �����ų �ڵ�;
 * } finally {
 *     �������� �ݵ�� ������Ѿ� �ϴ� �ڵ�;
 * }
 * => ���� �߻��� ������(throw) ������ ������ catch ��� ����
 *    ���ܰ� ��ġ�� ���, catch ��� ���� �ڵ尡 ����˴ϴ�. 
 */
public class ExceptionSample02 {

	public static void main(String[] args) {
		// ���� ó�� �ǽ� ����
		
		// ���⿡������ ���� �߻��� �����մϴ�.
		try {
			int[] test;
			test = new int[5];
			
			System.out.println("test[10]�� ���� �����մϴ�.");
		
			test[10] = 80; // ���ܰ� �߻��մϴ�.(=> �ڵ��� ������ �ߴ��ϰ� catch ������� �Ѿ�ϴ�.)
			
			System.out.println("test[10]dp 80�� �����߽��ϴ�.");
		} catch(ArrayIndexOutOfBoundsException e) {
			// ���� �߻��� * ���α׷��� ������� �ʰ� *, 'catch' ��� ���� �ڵ尡 ����˴ϴ�.
			System.out.println("�迭 ���̸� �Ѿ���ϴ�.");
		} finally {
			// ������ �߻� ������ ������� �������� ����˴ϴ�.
			System.out.println("�ݵ�� ����Ǵ� �ڵ��Դϴ�.");
		}
		
		System.out.println("������ �����߽��ϴ�.");

	}

}
