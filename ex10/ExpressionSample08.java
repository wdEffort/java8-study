package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 식과 연산자
 * 복합 대입 연산자 - 02
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 */
public class ExpressionSample08 {

	public static void main(String[] args) throws IOException {
		// 키보드로 입력 받은 3개의 정수를 더하는 예제
		
		// 키보드로 입력한 두개의 값을 더하는 예제
		System.out.println("정수를 3개 입력하십시오.");
		
		// 키보드로부터 입력을 받을 수 있게 하는 도구를 선언합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		
		int sum = 0;
		// 복합 대입 연산자를 사용하여 sum의 값에 입력받은 3개의 정수를 더해줍니다.
		sum += Integer.parseInt(str1);
		sum += Integer.parseInt(str2);
		sum += Integer.parseInt(str3);
		
		// sum의 값을 출력합니다.
		System.out.println("3개 정수의 합은 " + sum + "입니다.");
	}

}
