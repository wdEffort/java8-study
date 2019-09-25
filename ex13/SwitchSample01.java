package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 조건문
 * switch ~ case 문
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * if 문처럼 조건에 따라 처리를 제어할 수 있는 switch ~ case 문을 배워봅니다.
 * 흡사 자판기를 떠올려 주세요.
 * 
 * 사용법
 * switch (조건) {
 *   case 값 1:
 *       문장;
 *       break;
 *   case 값2:
 *       문장;
 *       break;
 *   default:
 *       문장;
 *       break;
 * }
 * 
 * 원리는 if ~ else if ~ else 문과 비슷합니다.
 */
public class SwitchSample01 {

	public static void main(String[] args) throws IOException {
		// switch ~ case 예제

		// 키보드 입력을 요구하는 메시지를 출력시킵니다.
		System.out.println("정수를 입력하십시오.");

		// 키보드로부터 입력을 받을 수 있게 하는 도구를 선언합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 키보드로부터 입력을 받아 문자열 변수 str에 대입합니다.
		String str = br.readLine();
		// 문자열 str 변수으 값을 정수형으로 변환시켜 res에 대입합니다.
		int res = Integer.parseInt(str);
		
		switch (res) {
			case 1: // 1이 입력된 경우 실행됩니다.
				System.out.println("1이 입력되었습니다.");
				break;
			case 2: // 2가 입력된 경우 실행됩니다.
				System.out.println("2가 입력되었습니다.");
				break;
			default: // 1 혹은 2 이외의 수가  입력된 경우 실행됩니다.
				System.out.println("1 혹은 2를 입력하십시오.");
				break;
		}

	}

}
