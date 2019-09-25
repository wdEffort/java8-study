package com.ezen.example;

/**
 * 네 번째 연습문제 - 01
 * 
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * 1 ~ 10까지의 짝수를 출력합니다.
 * 2
 * 4
 * 6
 * 8
 * 10
 * 
 * 위와 같이 출력하는 코드를 작성하세요.
 */
public class Practice01 {

	public static void main(String[] args) {
		System.out.println("1 ~ 10까지의 짝수를 출력합니다.");
		
		// 반복문 for 문을 이용합니다.
		for (int i = 1; i <= 10; i++) {
			// 변수 i를 2로 나눈 나머지값이 0인 경우 출력합니다.
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
