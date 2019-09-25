package com.ezen.example;

/**
 * 반복문
 * for 문
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * Java에서는 반복되는 작업을 처리 할 수 있는 여러가지 문법을 제공합니다.
 * 먼저 for 문에 대해 알아봅니다.
 * 
 * 사용법
 * for (초기화; 조건식; 증감식) {
 *   문장;
 * }
 */
public class LoopSample01 {

	public static void main(String[] args) {
		// for 문 예제
		
		// 먼저 정수형 변수 i를 선언하고 0으로 초기화 시킵니다.
		// 변수 i가 5보다 작은지 조건을 확인합니다.
		// 조건이 참(True)인 경우 for 문 안에 문장에 실행됩니다.
		// for 문 안에 문장이 완전히 실행 된 후 변수 i의 값을 1 증가 시킵니다.
		// 다시 변수 i가 5보다 작은지 조건을 확인합니다.
		// ...
		// 조건의 결과가 거짓(False)이 되면 반복을 종료합니다.
		for (int i = 0; i < 5 ; i++) {
			System.out.println("다섯번 반복합니다.");
		}
		
		System.out.println("반복이 끝났습니다.");
		
	}

}
