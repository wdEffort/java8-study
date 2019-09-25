package com.ezen.example;

/**
 * 반복문
 * for 문
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * 변수를 반복문 내에서 사용해봅니다.
 */
public class LoopSample02 {

	public static void main(String[] args) {
		// for 문 안에서 변수 사용 예제
		
		for (int i = 1; i <= 5 ; i++) {
			// 반복문 안에서 정수형 변수 i를 사용할 수 있습니다.
			System.out.println(i + "번째 반복합니다.");
		}
		
		// 반복문 밖에서 변수 i를 사용할 수 없습니다.
		// System.out.println(i);
		System.out.println("반복이 끝났습니다.");

	}

}
