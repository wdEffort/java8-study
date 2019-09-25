package com.ezen.example;

/**
 * 반복의 중첩
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * 반복문 안에는 반복문을 중첩 사용할 수 있습니다.
 */
public class LoopSample08 {

	public static void main(String[] args) {
		// for 문 중첩 예제
		
		// 바깥 반복문이 한번 실행 되면 안쪽 반복문은 세번 실행됩니다.
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i는 " + i + ", j는 " + j);
			}
		}

	}

}
