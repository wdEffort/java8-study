package com.ezen.example;

/**
 * 반복문
 * for 문
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * 변수를 반복문 밖에서 사용할 경우
 * for 문을 시작하기 전에 미리 선언하면 됩니다.
 */
public class LoopSample03 {

	public static void main(String[] args) {
		// for 문 밖에서 변수 사용 예제
		
		// for 문 밖에서 변수 i를 사용하기 위해서는
		// for 문이 시작 되기 전 변수 i를 미리 선언합니다.
		int i;
		
		for (i = 1; i <= 5; i++) {
			System.out.println(i + "번째 반복합니다.");
		}
		
		// for 문 밖에서 변수 i를 사용 가능합니다.
		System.out.println((i - 1) + "번 반복이 끝났습니다.");

	}

}
