package com.ezen.example;

/**
 * �پ��� ���� ó��  
 * 
 * @author yoman
 * 
 * 2019. 10. 09
 *
 * catch ����� �󸶵��� �߰��� �� �ֽ��ϴ�.
 * ��, ���� Ŭ������ �������� ó���� �и��� �� �ֽ��ϴ�.
 * 
 * ����, Exception�� ���� ���� Ŭ������ ������ ����ϸ�
 * �׸� ��ӹ��� ��� ���� Ŭ������ �޾Ƴ��� ó���� �� �ֽ��ϴ�.
 */
public class ExceptionSample05 {

	public static void main(String[] args) {
		try {
			int[] test = new int[5];	
			test[10] = 80;
		} catch(ArrayIndexOutOfBoundsException ae) { // �迭 ���̸� �Ѿ� ���� ����� ���� ó��
			System.out.println("�迭 ���̸� �Ѿ���ϴ�.");
			System.out.println(ae + " �̶�� ���ܰ� �߻��߽��ϴ�.");
		} catch(NullPointerException ne) { // ���� ���� ������ Ư�� �۾��� �� �� �߻��ϴ� ������ ���� ó��
			
		} catch(Exception e) { // �迭 ���� ������ Null ������ ó��(=> �� �������� �����ؾ� �մϴ�.)
			
		}
		
		System.out.println("������ �����߽��ϴ�.");

	}

}
