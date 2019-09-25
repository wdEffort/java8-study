package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 조건문
 * if 문으로 여러 개의 문장 실행시키기
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * if 문의 조건이 참(True)일 때 안에 있는 코드가 실행된다고 배웠습니다.
 * 만약, 여러 문장을 실행시킬 경우 { } 블록을 사용하여 문장을 적습니다.
 */
public class ConditionSample03 {

	public static void main(String[] args) throws IOException {
		// if 문 사용 예제
		
		// 키보드 입력을 요구하는 메시지를 출력시킵니다.
		System.out.println("정수를 입력하십시오.");
		
		// 키보드로부터 입력을 받을 수 있게 하는 도구를 선언합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 키보드로부터 입력을 받아 문자열 변수 str에 대입합니다.
		String str = br.readLine();
		// 문자열 str 변수으 값을 정수형으로 변환시켜 res에 대입합니다.
		int res = Integer.parseInt(str);
		
		// 정수형 변수 res의 값이 1인지 조건을 따집니다
		// 참(True)인 경우 아래 문장이 실행됩니다.
		// 거짓(False)인 경우 아래 문장이 실행되지 않습니다.
		if (res == 1) {
			// { } 블록 안의 문장들이 순서대로 실행됩니다.
			System.out.println("1이 입력되었습니다.");
			System.out.println("1이 선택되었습니다.");
		}
		
		System.out.println("처리를 종료합니다.");
	}

}
