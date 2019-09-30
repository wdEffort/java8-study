package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 클래스 라이브러리
 * 문자열 추가하기
 * 
 * @author yoman
 * 
 * 2019. 09. 30
 * 
 * String 클래스는 생성된 객체의 내용(문자열)을 변경할 수 없습니다.
 * 즉, 새로 생성은 가능하나 조작(변경) 할 수 있는 메소드는 없습니다.
 * => 문자열의 문자를 변경하는 경우, 별도로 StringBuffer 클래스를 사용해야 합니다. 
 * 
 * 문자열을 추가하는 경우
 * append() 메소드를 사용합니다.
 */
public class StringBufferSample01 {

	public static void main(String[] args) throws IOException {
		// StringBuffer 클래스 사용 예제
		System.out.println("문자열을 입력하세요.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		System.out.println("추가할 문자를 입력하세요.");
		
		String str2 = br.readLine(); // 추가할 문자를 입력합니다.
		StringBuffer sb = new StringBuffer(str1); // 문자열을 조작하기 위한 StringBuffer 객체를 생성합니다.
		sb.append(str2); // 입력받은 문자열을 추가합니다.
		
		System.out.println(str1 + "에 " + str2 + "을(를) 추가하면 " + sb + "입니다.");
		
	}

}
