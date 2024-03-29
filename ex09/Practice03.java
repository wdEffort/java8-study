package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 두 번째 연습문제 - 03
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * 원주율의 값은 얼마입니까?
 * 3.14 (<< 입력)
 * 원주율의 값은 3.14입니다.
 * 
 * 위와 같이 화면에 출력하는 코드를 작성하십시오.
 */
public class Practice03 {

	public static void main(String[] args) throws IOException {
		// 키보드 입력을 요구하는 메시지를 출력시킵니다.
		System.out.println("원주율의 값은 얼마입니까?");

		// 키보드로부터 입력을 받을 수 있게 하는 도구를 선언합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 키보드로 입력한 문자열을 변수 str에 대입합니다.(=> 키보드로 입력한 후 Enter key를 누릅니다.)
		String str = br.readLine();
		
		// 문자열 변수 str을 실수형으로 변환시킨 후 변수 num에 대입합니다.
		double num = Double.parseDouble(str);

		// 실수형 변수 num을 출력시킵니다.
		System.out.println("원주율의 값은" + num + "입니다.");

	}

}
