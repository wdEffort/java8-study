package com.ezen.example;

/**
 * 클래스 라이브러리
 * 문자열 처리 클래스
 * 
 * @author yoman
 * 
 * 2019. 09. 30
 * 
 * String 클래스를 다뤄봅니다
 * String 클래스의 주요 메소드
 * 1. charAt(int index) : 문자열에서 index 위치에 있는 문자를 반환(char)
 * 2. endsWith(String str) : 비교대상 문자열이 str로 끝나는지의 여부 반환(boolean) 
 * 3. equals(Object obj) : 비교대상 문자열이 obj와 같은 문자열인지의 여부 반환(boolean)
 * 4. equalsIgnoreCase(String str) : 비교대상 문자열이 대소문자 구별없이 str과 같은 문자열인지 여부 반환(boolean)
 * 5. indexOf(int ch) : 비교대상 문자열에서 ch가 최초로 출현하는 위치 반환(int)
 * 6. indexOf(String str) : 비교대상 문자열에서 str이 최초로 출현하는 위치 반환(int)
 * 7. lastIndexOf(int ch) : 비교대상 문자열에서 ch가 마지막으로 출현하는 위치 반환(int)
 * 8. lastIndexOf(String str) : 비교대상 문자열에서 str이 마지막으로 출현하는 위치 반환(int)
 * 9. length() : 문자열의 길이 반환(int)
 * 10. substring(int idx) : idx 위치에서 마지막까지의 문자열을 추출해서 반환(String)
 * 11. substring(int start, int end) : start부터 end까지의 문자열을 추출해서 반환(String)
 * 12. startsWith(String str) : 비교대상 문자열이 str로 시작하는지 여부 반환(boolean)
 * 13. toLowerCase() : 소문자로 변환 후 반환(String)
 * 14. toUpperCase() : 대문자로 변환 후 반환(String)
 */
public class StringMethodSample01 {

	public static void main(String[] args) {
		// String 클래스의 주요 메소드 사용 예제
		String str = "yoman";
		String fluit = "tomato";
		String another = "yoman"; // 비교 문자열을 선언합니다.
		String alp = "aBcD";
		
		int len = str.length();
		System.out.println("str의 길이는 " + len + "입니다.");
		
		// 문자열의 순서는 '0'부터 시작한다는 것에 주의하시기 바랍니다.
		char ch = str.charAt(2);
		System.out.println("str의 세번째 문자는 " + ch + "입니다.");
		
		System.out.println("str은 문자 \'n\'으로 끝납니까? " + str.endsWith("n"));
		
		System.out.println("str과 anoter은 같습니까? " + str.equals(another));
		System.out.println("str과 YOMAN은 스펠링이 같습니까? " + str.equalsIgnoreCase("YOMAN"));
		
		System.out.println("str에서 \'man\'만 추출하세요. " + str.substring(2));
		System.out.println("str에서 \'oma\'만 추출하세요. " + str.substring(1, 4));
		
		System.out.println("str에서 \'o\'가 최초로 출현하는 위치는? " + str.indexOf('o'));
		System.out.println("str에서 \'man\'이 최초로 출현하는 위치는? " + str.indexOf("man"));
		System.out.println("fluit에서 마지막으로 출현하는 \'t\'의 위치는? " + fluit.lastIndexOf('t'));
		System.out.println("fluit에서 마지막으로 출현하는 \'to\'의 위치는? " + fluit.lastIndexOf("to"));
		
		System.out.println("str은 \'o\'로 시작합니까? " + str.startsWith("o"));
		
		System.out.println("alp를 모두 소문자로 변경하세요. " + alp.toLowerCase());
		System.out.println("alp를 모두 대문자로 변경하세요. " + alp.toUpperCase());
		
		
	}

}
