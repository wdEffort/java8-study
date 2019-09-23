package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 키보드로 입력하기
 * 2개 이상의 숫자 입력하기
 * 
 * @author yoman
 * 
 * 2019. 09. 23
 *
 * 지금까지는 하나의 값만 입력받는 코드를 작성했습니다.
 * 하지만 여러 개의 값도 입력 받을 수 있습니다.
 */
public class KeyboardIOSample04 {

	public static void main(String[] args) throws IOException {
		// 여러 개의 값을 입력 받는 예제
		
		// 키보드 입력을 요구하는 메시지를 출력시킵니다.
		System.out.print("정수 2개를 입력하십시오. > ");
		
		// 키보드로부터 입력을 받을 수 있게 하는 도구를 선언합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 키보드로 입력한 문자열을 변수 str1, str2에 대입합니다.(=> 각각 키보드로 입력한 후 Enter key를 누릅니다.)
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		// 키보드로 입력 받은 str1, str2를 정수형으로 변환하여 변수 num1, num2에 대입합니다.
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		// 변수 num1, num2를 출력시킵니다.
		System.out.println("먼저" + num1 + "(이)가 입력되었습니다.");
		System.out.println("그 다음으로, " + num2 + "(이)가 입력되었습니다.");
	}

}
