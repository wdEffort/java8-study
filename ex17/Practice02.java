package com.ezen.example;

/**
 * 다섯 번째 연습문제 - 02
 *
 * @author yoman
 * 
 * 2019. 09. 27
 *
 * 1번째 사람의 점수는 80입니다.
 * 2번째 사람의 점수는 60입니다.
 * 3번째 사람의 점수는 22입니다.
 * 4번째 사람의 점수는 50입니다.
 * 5번째 사람의 점수는 75입니다.
 * 6번째 사람의 점수는 100입니다.
 * 
 * 위와 같이 출력되는 코드를 작성하세요.
 */
public class Practice02 {

	public static void main(String[] args) {
		int[] test = {80, 60, 22, 50, 75, 100};
		
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + "번째 사람의 점수는 " + test[i] + "입니다.");
		}
		
	}

}
