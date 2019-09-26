package com.ezen.example;

/**
 * 다차원 배열
 * 
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * 다차원 배열의 개념과 예제를 통해 학습합니다.
 * 대표적으로 2차원 배열에 대해 학습합니다.
 * 
 * 2차원 배열 : 행 X 열의 형태를 띕니다.
 */
public class MultiArraySample01 {

	public static void main(String[] args) {
		// 다차원 배열 사용 예제(2차원 배열)
		
		// 2차원 배열을 선언합니다.
		int[][] test;
		// 2차원 배열을 생성합니다.(=> 크기 지정)
		test = new int[2][5];
		
		// 2차원 배열 요소에 값을 대입합니다.
		test[0][0] = 50;
		test[0][1] = 60;
		test[0][2] = 70;
		test[0][3] = 30;
		test[0][4] = 40;
		
		test[1][0] = 90;
		test[1][1] = 30;
		test[1][2] = 70;
		test[1][3] = 80;
		test[1][4] = 50;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println((i + 1) + "행 " + (j + 1) + "열의 값은 " + test[i][j] + "입니다.");
			}
			System.out.println();
		}

	}

}
