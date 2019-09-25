package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 논리 연산자
 * 복접한 조건 판단하기
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 */
public class LogicalSample02 {

	public static void main(String[] args) throws IOException {
		// 논리 연산자를 이용한 복잡한 조건 판단 실습 예제
		System.out.println("당신은 학생입니까?");
		System.out.println("Y 또는 N을 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		char res = str.charAt(0);
		
		if (res == 'Y' || res == 'y') { // 'Y' 또는 'y'가 입력된 경우 실행합니다.
			System.out.println("당신은 학생입니다.");
		} else if (res == 'N' || res == 'n') { // 'N' 또는 'n'가 입력된 경우 실행합니다.
			System.out.println("당신은 학생이 아닙니다.");
		} else { // 'Y', 'y', 'N', 'n' 이외의 문자가 입력된 경우 실행합니다.
			System.out.println("Y 또는 N을 입력하십시오.");
		}
	}

}
