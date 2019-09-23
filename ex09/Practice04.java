package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 두 번째 연습문제 - 04
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * 키와 몸무게를 입력하십시오.
 * 165.2 (<< 입력)
 * 52.5 (<< 입력)
 * 키는 165.2센티미터입니다.
 * 몸무게는 52.5킬로그램입니다.
 * 
 * 위와 같이 화면에 출력하는 코드를 작성하십시오.
 */
public class Practice04 {

	public static void main(String[] args) throws IOException {
		// 키보드 입력을 요구하는 메시지를 출력시킵니다.
		System.out.println("키와 몸무게를 입력하십시오.");

		// 키보드로부터 입력을 받을 수 있게 하는 도구를 선언합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 키보드로 입력한 문자열을 변수 str1, str2에 대입합니다.(=> 각각 키보드로 입력한 후 Enter key를 누릅니다.)
		String str1 = br.readLine();
		String str2 = br.readLine();

		// 문자열 변수 str1, str2을 실수형으로 변환시킨 후 변수 heigth, weight에 대입합니다.
		double height = Double.parseDouble(str1);
		double weight = Double.parseDouble(str2);

		// 실수형 변수 height, weight를 출력시킵니다.
		System.out.println("키는 " + height + "센티미터입니다.");
		System.out.println("몸무게는 " + weight + "킬로그램입니다.");
	}

}
