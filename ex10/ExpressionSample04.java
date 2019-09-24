package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 식과 연산자
 * 키보드로 입력한 값에 대한 연산
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 */
public class ExpressionSample04 {

	public static void main(String[] args) throws IOException {
		// 키보드로 입력한 두개의 값을 더하는 예제
		System.out.println("정수를 2개 입력하십시오.");
		
		// 키보드로부터 입력을 받을 수 있게 하는 도구를 선언합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 두개의 문자열을 입력 받습니다. (=> 여기서는 숫자를 입력합니다.)
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		// 입력받은 두개의 문자열 str1, str2를 정수형 변수로 변형합니다.
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		// 입력받은 두 변수 num1, num2를 더한 결과를 출력합니다.
		System.out.println("덧셈의 결과는 " + (num1 + num2) + "입니다.");
	}

}
