package com.ezen.example;

/**
 * 배열의 응용
 * 
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * Java의 배열에서는 요소의 개수를 모르는 경우
 * 이를 해결할 수 있는 기능을 제공합니다. (=> 코드 작성이 편해집니다.)
 */
public class ArraySample06 {

	public static void main(String[] args) {
		// 배열의 길이를 출력하는 예제
		int[] test = {10, 20, 30, 40, 50};
		
		// 배열 변수.length를 사용하면 자동으로 배열 요소의 개수를 구할 수 있습니다.
		System.out.println("배열 변수 test의 길이는 " + test.length + "입니다.");

	}

}
