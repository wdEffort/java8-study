package com.ezen.example;

/**
 * Ŭ���� ���̺귯��
 * StringBuffer �ֿ� �޼ҵ� �˾ƺ���
 * 
 * @author yoman
 * 
 * 2019. 09. 30
 * 
 * 1. append(char c) : ���ڸ� ���� �߰�(StringBuffer)
 * 2. append(String str) : ���ڿ��� ���� �߰�(StringBuffer)
 * 3. deleteCharAt(int idx) : idx ��ġ�� ���ڸ� ����(StringBuffer)
 * 4. insert(int offset, char c) : offset�� ����Ű�� ��ġ�� ���� �߰�(StringBuffer)
 * 5. insert(int offset, String str) : offset�� ����Ű�� ��ġ�� ���ڿ� �߰�(StringBuffer)
 * 6. length() : ���� ���� ��ȯ(int)
 * 7. replace(int start, int end, String str) : start���� end�� ���ڿ��� str ���ڿ��� ����(StringBuffer)
 * 8. reverse() : ���ڿ��� �������� ��ȯ(StringBuffer)
 * 9. setCharAt(int idx, char c) : idx ��ġ�� ���ڸ� �μ��� ���޵� ���ڷ� ����(void) 
 * 10. toString() : String Ŭ���� ��ü�� ��ȯ(String)
 */
public class StringBufferSample02 {

	public static void main(String[] args) {
		// StringBuffer Ŭ������ �ֿ� �޼ҵ� ��� ����
		String str = "�ȳ��ϼ���.";
		StringBuffer sb = new StringBuffer(str);
		
		sb.append('��');
		System.out.println(str + "�� \'��\'�� �߰��ϸ� " + sb + "�Դϴ�.");
		
		sb.deleteCharAt(6);
		System.out.println(sb + "�� \'��\'�� �����ϸ� " + sb + "�Դϴ�.");
		
		System.out.print(sb + "�� �� ��° ���� �ڿ� \', ����\'�� �߰��ϸ� ");
		sb.insert(2, ", ����");
		System.out.println(sb + "�Դϴ�.");
		
		System.out.println(sb + "���� \'�λ縻\'�� �����غ��ϴ�. >> " + sb.replace(0, 4, ""));
		
		sb.setCharAt(3, '��');
		System.out.println("���� sb ���� �� ��° ���ڸ� \'��\'�� �ٲٸ�" + sb + "�Դϴ�.");
	
	}

}
