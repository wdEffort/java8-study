package com.ezen.example;

/**
 * Ŭ���� ���̺귯��
 * ���ڿ� ó�� Ŭ����
 * 
 * @author yoman
 * 
 * 2019. 09. 30
 * 
 * String Ŭ������ �ٷﺾ�ϴ�
 * String Ŭ������ �ֿ� �޼ҵ�
 * 1. charAt(int index) : ���ڿ����� index ��ġ�� �ִ� ���ڸ� ��ȯ(char)
 * 2. endsWith(String str) : �񱳴�� ���ڿ��� str�� ���������� ���� ��ȯ(boolean) 
 * 3. equals(Object obj) : �񱳴�� ���ڿ��� obj�� ���� ���ڿ������� ���� ��ȯ(boolean)
 * 4. equalsIgnoreCase(String str) : �񱳴�� ���ڿ��� ��ҹ��� �������� str�� ���� ���ڿ����� ���� ��ȯ(boolean)
 * 5. indexOf(int ch) : �񱳴�� ���ڿ����� ch�� ���ʷ� �����ϴ� ��ġ ��ȯ(int)
 * 6. indexOf(String str) : �񱳴�� ���ڿ����� str�� ���ʷ� �����ϴ� ��ġ ��ȯ(int)
 * 7. lastIndexOf(int ch) : �񱳴�� ���ڿ����� ch�� ���������� �����ϴ� ��ġ ��ȯ(int)
 * 8. lastIndexOf(String str) : �񱳴�� ���ڿ����� str�� ���������� �����ϴ� ��ġ ��ȯ(int)
 * 9. length() : ���ڿ��� ���� ��ȯ(int)
 * 10. substring(int idx) : idx ��ġ���� ������������ ���ڿ��� �����ؼ� ��ȯ(String)
 * 11. substring(int start, int end) : start���� end������ ���ڿ��� �����ؼ� ��ȯ(String)
 * 12. startsWith(String str) : �񱳴�� ���ڿ��� str�� �����ϴ��� ���� ��ȯ(boolean)
 * 13. toLowerCase() : �ҹ��ڷ� ��ȯ �� ��ȯ(String)
 * 14. toUpperCase() : �빮�ڷ� ��ȯ �� ��ȯ(String)
 */
public class StringMethodSample01 {

	public static void main(String[] args) {
		// String Ŭ������ �ֿ� �޼ҵ� ��� ����
		String str = "yoman";
		String fluit = "tomato";
		String another = "yoman"; // �� ���ڿ��� �����մϴ�.
		String alp = "aBcD";
		
		int len = str.length();
		System.out.println("str�� ���̴� " + len + "�Դϴ�.");
		
		// ���ڿ��� ������ '0'���� �����Ѵٴ� �Ϳ� �����Ͻñ� �ٶ��ϴ�.
		char ch = str.charAt(2);
		System.out.println("str�� ����° ���ڴ� " + ch + "�Դϴ�.");
		
		System.out.println("str�� ���� \'n\'���� �����ϱ�? " + str.endsWith("n"));
		
		System.out.println("str�� anoter�� �����ϱ�? " + str.equals(another));
		System.out.println("str�� YOMAN�� ���縵�� �����ϱ�? " + str.equalsIgnoreCase("YOMAN"));
		
		System.out.println("str���� \'man\'�� �����ϼ���. " + str.substring(2));
		System.out.println("str���� \'oma\'�� �����ϼ���. " + str.substring(1, 4));
		
		System.out.println("str���� \'o\'�� ���ʷ� �����ϴ� ��ġ��? " + str.indexOf('o'));
		System.out.println("str���� \'man\'�� ���ʷ� �����ϴ� ��ġ��? " + str.indexOf("man"));
		System.out.println("fluit���� ���������� �����ϴ� \'t\'�� ��ġ��? " + fluit.lastIndexOf('t'));
		System.out.println("fluit���� ���������� �����ϴ� \'to\'�� ��ġ��? " + fluit.lastIndexOf("to"));
		
		System.out.println("str�� \'o\'�� �����մϱ�? " + str.startsWith("o"));
		
		System.out.println("alp�� ��� �ҹ��ڷ� �����ϼ���. " + alp.toLowerCase());
		System.out.println("alp�� ��� �빮�ڷ� �����ϼ���. " + alp.toUpperCase());
		
		
	}

}
