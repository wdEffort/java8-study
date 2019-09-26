package com.ezen.example;

/**
 * 다차원 배열
 * 
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * Java의 다차원 배열에서 각 요소의 수가 맞아 떨어질 필요는 없습니다.
 * 즉, 길이가 일정하지 않는 배열도 만들 수 있습니다.
 */
public class MultiArraySample03 {

	public static void main(String[] args) {
		// 길이가 일정하지 않은 다차원 배열 에제
		int[][] test = {
			{80, 60, 22, 50}, {90, 55, 68, 72, 56}, {33, 75, 63}
		};
		
		// 다차원 배열 변수 test의 길이만큼 반복합니다.
		// test.length => 배열의 전체 길이
		// test[첨자].length => 각 배열 요소의 길이
		for (int i = 0; i < test.length; i++) {
			System.out.println((i + 1) + "번째 배열 요소의 길이는 " + test[i].length + "입니다.");
		}

	}

}
