package com.ezen.example;

/**
 * 다차원 배열
 * 또 다른 선언 방법
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * 1차원 배열과 비슷합니다.
 */
public class MultiArraySample02 {

	public static void main(String[] args) {
		// 다차원 배열의 선언 방법 예제
		
		// 다차원 배열 변수 a를 선언 한 후 생성합니다.
		int[][] a;
		a = new int[2][3];
		
		// 다차원 배열 변수 b를 선언과 동시에 생성합니다.
		int[][] b = new int[2][3];
		
		// 다차원 배열 변수 c를 선언, 생성과 동시에 값을 대입합니다.
		int[][] c = {
			{3, 6, 9}, {5, 10, 15}
		};

	}

}
