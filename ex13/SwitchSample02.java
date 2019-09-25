package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 조건문
 * switch ~ case 문에서 break의 중요성
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * Java에서 break란
 * 블록 내부 문장의 흐름을 강제 종료 시킵니다.
 * 
 * switch ~ case 문은 break 문이 나오거나
 * 블록이 종료될 때까지 블록 안의 문장을 순서대로 실행시킵니다.
 * 따라서 올바른 위치에 break 문을 넣지 않으면 의도하지 않느 결과가
 * 출력 될 수 있습니다.
 */
public class SwitchSample02 {

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
			case 1: 
				// break 가 빠져 있는 경우 의도하지 않는 결과가 출력 될 수 있습니다.
				System.out.println("1이 입력되었습니다.");
			case 2: 
				System.out.println("2가 입력되었습니다.");
				break;
			default: 
				System.out.println("1 혹은 2를 입력하십시오.");
				break;
		}

	}

}
