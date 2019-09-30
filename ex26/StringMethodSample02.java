package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 클래스 라이브러리
 * 문자열 처리 클래스
 * 
 * @author yoman
 * 
 * 2019. 09. 30
 * 
 * String 클래스의 indexOf() 메소드에 대해 알아봅니다.
 * indexOf() 메소드는 문자를 찾지 못한 경우 '-1'를 반환합니다.
 */
public class StringMethodSample02 {

	public static void main(String[] args) throws IOException {
		System.out.println("문자열을 입력하세요.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		System.out.println("검색할 문자를 입력하세요.");
		
		String str2 = br.readLine(); // 검색할 문자열을 입력합니다.
		char ch = str2.charAt(0); // 입력한 검색 문자열에서 첫 번째 문자를 저장합니다.
		int num = str1.indexOf(ch); // 검색 문자의 최초 출력 위치를 저장합니다.
		
		// 검색 결과, 문자를 찾지 못한 경우
		if (num != -1) {
			System.out.println(str1 + "의 " + (num + 1) + " 번째에서 \'" + ch + "\' 을(를) 발견했습니다.");
		} else {
			System.out.println(str1 + "에서 \'" + ch + "\'을(를) 찾을 수 없었습니다.");
		}

	}

}
