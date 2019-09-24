package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 세 번째 연습문제 - 04
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * 키보드로 다섯 과목의 시험 점수를 입력받은 후
 * 합계와 평균을 출력하는 코드를 작성하십시오.
 * [국어=52, 수학=68, 영어=75, 사회=83, 과학=36]
 */
public class Practice04 {

	public static void main(String[] args) throws IOException {
		// 키보드 입력을 요구하는 메시지를 출력시킵니다.
		System.out.println("국어, 수학, 영어, 사회, 과학 점수를 입력하십시오.");

		// 키보드로부터 입력을 받을 수 있게 하는 도구를 선언합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 키보드로 입력한 문자열을 변수 str1 ~ str5에 대입합니다.(=> 각각 키보드로 입력한 후 Enter key를 누릅니다.)
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		String str4 = br.readLine();
		String str5 = br.readLine();

		// 입력 받은 과목 점수를 각각 num1 ~ num5에 대입합니다.
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int num3 = Integer.parseInt(str3);
		int num4 = Integer.parseInt(str4);
		int num5 = Integer.parseInt(str5);
		// 합계를 구합니다.
		int sum = num1 + num2 +  + num3 +  + num4 +  + num5; 
		// 평균을 구합니다.(실수형 변수에 대입하기 위해서 정수형 변수 sum을 실수형으로 변환시킵니다.)
		double average = (double)sum / 5;
		
		// 삼각형의 넓이를 출력합니다.
		System.out.println("5과목의 합계는 " + sum + "점입니다.");
		System.out.println("5과목의 평균은 " + average + "점입니다.");
	}

}
