package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 여덟 번째 연습문제 - 02
 * 
 * @author yoman
 * 
 * 2019. 10. 02
 *
 * StringBuffer 클래스의 메소드를 사용하여 아래와 같이 출력되는 코드를 작성하십시오.
 * 
 * 문자열을 입력하십시오.
 * Hello
 * 'a'가 들어갈 위치를 정수로 입력하십시오.
 * 2
 * Heallo가 되었습니다.
 */
class Practice02 {

	public static void main(String[] args) throws IOException {
		System.out.println("문자열을 입력하십시오.");
		
		// 키보드로 부터 입력받기 위한 객체를 생성합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 키보드로 부터 입력받은 문자열을 str1 변수에 대입합니다.
		String str1 = br.readLine();
		
		// 문자열을 조작(변경)하기 위한 StringBuffer 객체를 생성합니다.
		StringBuffer sb = new StringBuffer(str1);
		
		System.out.println("\'a\'가 들어갈 위치를 정수로 입력하십시오.");
		
		// 'a'가 들어갈 위치를 숫자로 입력받아 str2 변수에 대입합니다.
		String str2 = br.readLine();
		int offset = Integer.parseInt(str2);
		
		// insert() 메소드를 사용하여 원하는 위치에 'a'를 집어 넣습니다.
		sb.insert(offset, 'a');
		
		System.out.println(sb + "가 되었습니다.");
	}

}
