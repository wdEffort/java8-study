package com.ezen.example;

/**
 * 변수(Variable)
 * 변수의 초기화(Initialize)
 * 
 * @author yoman
 * 
 * 2019. 09. 23
 *
 * 초기화란?
 * 변수를 선언했을 때, 동시에 변수에 값을 저장하는 행위
 */
public class VariableSample03 {

	public static void main(String[] args) {
		// 초기화 예제
		
		// 기존 코드
		int num; // 변수를 선언합니다.
		num = 1; // 변수 num에 값 1을 대입합니다.
		
		System.out.println("변수 num의 값은 " + num + "입니다.");
		
		// 변수 선언과 동시에 값을 대입합니다.
		// 이를 변수의 초기화라고 합니다.
		int num2 = 2;
		
		System.out.println("변수 num2의 값은 " + num2 + "입니다.");

	}

}
