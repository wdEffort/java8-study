package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 키보드로 입력하기
 * 숫자(소수) 입력
 * 
 * @author yoman
 * 
 * 2019. 09. 23
 *
 * 사용자로부터 숫자를 입력 받을 수 있습니다.
 * 단, 입력 받은 숫자를 다루기 위해서는 '키보드로 입력 받은 문자열을 숫자로 변환' 하는 작업이 필요합니다.
 */
public class KeyboardIOSample03 {

	public static void main(String[] args) throws IOException {
		// 숫자 입력 예제
		
		// 키보드 입력을 요구하는 메시지를 출력시킵니다.
		System.out.print("숫자(소수)를 입력합니다. > ");
		
		// 키보드로부터 입력을 받을 수 있게 하는 도구를 선언합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 키보드로 입력한 문자열을 변수 str에 대입합니다.(=> 키보드로 입력한 후 Enter key를 누릅니다.)
		String str = br.readLine();
		
		// 키보드로 입력 받은 문자열 str을 실수형으로 변환하여 변수 num에 대입합니다.
		double num = Double.parseDouble(str);
		
		// 변수 num을 출력시킵니다.
		System.out.println(num + "(이)가 입력되었습니다.");

	}

}
