package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 여덟 번째 연습문제 - 03
 * 
 * @author yoman
 * 
 * 2019. 10. 02
 * 
 * Math 클래스의 메소드를 사용하여 아래와 같이 출력되는 코드를 작성하세요.
 * 
 * 정수 2개를 입력하세요.
 * 5
 * 10
 * 5과 10 중 작은 쪽은 5입니다. 
 */
class Practice03 {
	public static void main(String[] args) throws IOException {
		System.out.println("정수 2개를 입력하세요.");
		
		// 키보드로 부터 입력받기 위한 객체를 생성합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 키보드로 부터 정수 2개를 입력받고 각각 str1, str2에 대입합니다.
		String str1 = br.readLine();
		String str2 = br.readLine();
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		// Math 클래스의 min() 매소드를 사용하여 주어진 두 숫자중 작은 수를 출력합니다.
		System.out.println(num1 + "과 " + num2 + "중 작은 쪽은 " + Math.min(num1, num2) + "입니다.");
		
	}
}
