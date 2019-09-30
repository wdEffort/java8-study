package com.ezen.example;

/**
 * 클래스 라이브러리
 * StringBuffer 주요 메소드 알아보기
 * 
 * @author yoman
 * 
 * 2019. 09. 30
 * 
 * 1. append(char c) : 문자를 끝에 추가(StringBuffer)
 * 2. append(String str) : 문자열을 끝에 추가(StringBuffer)
 * 3. deleteCharAt(int idx) : idx 위치의 문자를 삭제(StringBuffer)
 * 4. insert(int offset, char c) : offset이 가리키는 위치에 문자 추가(StringBuffer)
 * 5. insert(int offset, String str) : offset이 가리키는 위치에 문자열 추가(StringBuffer)
 * 6. length() : 문자 개수 반환(int)
 * 7. replace(int start, int end, String str) : start에서 end의 문자열을 str 문자열로 변경(StringBuffer)
 * 8. reverse() : 문자열을 역순으로 반환(StringBuffer)
 * 9. setCharAt(int idx, char c) : idx 위치의 문자를 인수로 전달된 문자로 설정(void) 
 * 10. toString() : String 클래스 객체를 반환(String)
 */
public class StringBufferSample02 {

	public static void main(String[] args) {
		// StringBuffer 클래스의 주요 메소드 사용 예제
		String str = "안녕하세요.";
		StringBuffer sb = new StringBuffer(str);
		
		sb.append('저');
		System.out.println(str + "에 \'저\'를 추가하면 " + sb + "입니다.");
		
		sb.deleteCharAt(6);
		System.out.println(sb + "에 \'저\'를 삭제하면 " + sb + "입니다.");
		
		System.out.print(sb + "의 두 번째 문자 뒤에 \', 공부\'를 추가하면 ");
		sb.insert(2, ", 공부");
		System.out.println(sb + "입니다.");
		
		System.out.println(sb + "에서 \'인사말\'을 제거해봅니다. >> " + sb.replace(0, 4, ""));
		
		sb.setCharAt(3, '시');
		System.out.println("기존 sb 값의 네 번째 글자를 \'시\'로 바꾸면" + sb + "입니다.");
	
	}

}
