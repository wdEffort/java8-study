package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 세 번째 연습문제 - 03
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * 키보드로 삼각형의 밑변과 높이를 정수로 입력받은 후 
 * 넓이를 출력하는 코드를 작성하십시오.
 * [삼각형의 넓이 = (밑변 X 높이) / 2]
 */
public class Practice03 {

	public static void main(String[] args) throws IOException {
		// 키보드 입력을 요구하는 메시지를 출력시킵니다.
		System.out.println("삼각형의 밑변과 높이를 입력하십시오.");
		
		// 키보드로부터 입력을 받을 수 있게 하는 도구를 선언합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 키보드로 입력한 문자열을 변수 str1, str2에 대입합니다.(=> 각각 키보드로 입력한 후 Enter key를 누릅니다.)
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		// 삼각형의 밑변과 높이의 값을 각각 정수형 변수 num1과 num2에 대입합니니다.
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		// 정확한 값을 얻기위하여 정수형 변수 num1을 실수형으로 변환시킨 후 계산합니다.
		double area = ((double)num1 * num2) / 2;
		
		// 삼각형의 넓이를 출력합니다.
		System.out.println("삼각형의 넓이는 " + area + "입니다.");
	}

}
