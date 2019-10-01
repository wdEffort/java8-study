package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 여덟 번째 연습문제 - 01
 * 
 * @author yoman
 * 
 * 2019. 10. 02
 *
 * StringBuffer 클래스의 reverse() 메소드를 사용여 주어지는 문자열을 거꾸로 출력하세요.
 */
class Practice01 {

	public static void main(String[] args) throws IOException {
		System.out.println("문자열을 입력하세요.");
		
		// 키보드로 부터 입력받기 위한 객체를 생성합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 키보드로 부터 입력받은 문자열을 str 변수에 대입합니다.
		String str = br.readLine();
		
		System.out.println("입력한 문자열은 " + str + "입니다.");
		
		// 문자열을 조작(변경)하기 위한 StringBuffer 객체를 생성합니다.
		StringBuffer sb = new StringBuffer(str);
		
		// reverse() 메소드를 이용하여 저장된 문자열을 거꾸로 반환시킵니다.
		sb.reverse();
		
		System.out.println("입력된 문자열을 거꾸로 출력하면 " + sb + "입니다.");
		
	}

}
