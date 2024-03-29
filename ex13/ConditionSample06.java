package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 조건문
 * if ~ else if ~ else 문
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * 두 개 이상의 조건을 판단하고 실행시킬 수 있도록 
 * if ~ else if ~ else 문을 배워봅니다.
 * 
 * 사용법
 * if (조건1)
 *   문장;
 * else if (조건2)
 *   문장;
 * else
 *    문장;
 */
public class ConditionSample06 {

	public static void main(String[] args) throws IOException {
		// if ~ else if ~ else 사용 예제

		// 키보드 입력을 요구하는 메시지를 출력시킵니다.
		System.out.println("정수를 입력하십시오.");

		// 키보드로부터 입력을 받을 수 있게 하는 도구를 선언합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 키보드로부터 입력을 받아 문자열 변수 str에 대입합니다.
		String str = br.readLine();
		// 문자열 str 변수으 값을 정수형으로 변환시켜 res에 대입합니다.
		int res = Integer.parseInt(str);
		
		if (res == 1) {
			System.out.println("1이 입력되었습니다."); // 1이 입력된 경우 실행됩니다.
		} else if (res == 2) {
			System.out.println("2가 입력되었습니다."); // 2가 입력된 경우 실행됩니다.
		} else {
			System.out.println("1 혹은 2를 입력하십시오."); // 1 혹은 2 이외의 수가 입력된 경우 실행됩니다.
		}
		
		System.out.println("처리를 종료합니다.");

	}

}
