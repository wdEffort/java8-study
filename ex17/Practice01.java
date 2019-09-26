package com.ezen.example;

/**
 * 다섯 번째 연습문제 - 01
 *
 * @author yoman
 * 
 * 2019. 09. 27
 * 
 * 잘못된 코드를 찾아서 고치세요.
 */
public class Practice01 {

	public static void main(String[] args) {
		int[] test;
		test = new int[5];
		
		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 75;
		// test[5] = 100; // ERROR (=> 배열의 크기를 넘어서 값을 대입할 수 없습니다.)
		
		for (int i = 0; i < 5; i ++) {
			System.out.println((i + 1) + "번째 사람의 점수는 " + test[i] + "입니다.");
		}
		
	}

}
