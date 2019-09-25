package com.ezen.example;

/**
 * 반복문
 * while문
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * while문은 for 문과 비슷하게 반복을 처리하는 구문입니다.
 * 단, while문은 조건이 참(True)인 경우에만 지정한 문장을 여러 번 반복 실행합니다.
 * 
 * 주의사항
 * while문을 사용할 때는 반드시 조건이 거짓(False)이 되는 처리를 해주어야 합니다.
 * 그렇지 않으면 영원히 반복문이 실행되어 버립니다.
 */
public class LoopSample06 {

	public static void main(String[] args) {
		// while문 예제
		int i = 1;
		
		// while 문 안에 조건이 참(True)인 경우에만 문장이 실행됩니다.
		while (i <= 5) {
			System.out.println(i + "번째 반복합니다.");
			i++; // 조건이 거짓(False)에 가까워지도록 반복 수행 될 때마다 변수 i에 1을 더하고 있습니다.
		}
		
		System.out.println("반복이 끝났습니다.");
	}

}
