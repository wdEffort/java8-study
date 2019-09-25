package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 조건문
 * if 문의 원리 이해하기
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * Java에서 다양한 상황에 따른 처리를 하기 위한
 * 대표적인 조건 판단문(Conditional statement)으로 if 문을 사용합니다.
 * 
 * 사용법
 * if (조건)
 *   문장; << 조건이 참(True)일 때 실행됩니다.
 */
public class ConditionSample02 {

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
		if (res == 1)
			System.out.println("1이 입력되었습니다.");
		
		System.out.println("처리를 종료합니다.");
	}

}
