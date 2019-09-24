package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 세 번째 연습문제 - 02
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * 키보드로 정사각형의 한 변의 길이를 정수로 입력받은 후,
 * 넓이를 출력하는 코드를 작성하십시오.
 * [정사각형의 넓이 = 한변의 길이 X 한번의 길이]
 */
public class Practice02 {

	public static void main(String[] args) throws IOException {
		// 키보드 입력을 요구하는 메시지를 출력시킵니다.
		System.out.println("정사각형의 밑변과 높이를 입력하십시오.");
		
		// 키보드로부터 입력을 받을 수 있게 하는 도구를 선언합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 키보드로 입력한 문자열을 변수 str에 대입합니다.
		String str1 = br.readLine();
		
		// 정사각형 한 변의 길이를 정수형 변수 num에 대입합니다.
		int num = Integer.parseInt(str1);
		int area = num * num;
		
		// 삼각형의 넓이를 출력합니다.
		System.out.println("정사각형의 넓이는 " + area + "입니다.");
	}

}
