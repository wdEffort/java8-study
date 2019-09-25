package com.ezen.example;

/**
 * 반복문
 * do ~ while문
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * do ~ while문은 while문과 비슷하나 차이점이 있습니다.
 * while 문에서는 블록 안의 코드를 실행하기 앞서서 조건을 먼저 판별합니다.
 * 하지만 do ~ while 문에서는 적어도 한번, 반드시 블록 안의 코드가 실행된 후 조건을 판별합니다.
 */
public class LoopSample07 {

	public static void main(String[] args) {
		// do ~ while 문 예제
		int i = 1;
		
		do {
			System.out.println(i + "번째 반복합니다.");
			i++;
		} while (i <= 5); // while문과 달리 세미클론(;)을 사용했다는 점에 유의 하시기 바랍니다.
		
		System.out.println("반복이 끝났습니다.");

	}

}
