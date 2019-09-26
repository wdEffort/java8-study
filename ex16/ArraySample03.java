package com.ezen.example;

/**
 * 배열(Array)
 * 배열을 선언하는 다른 방법
 * 
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * 배열의 선언과 배열 요소의 생성 작업은 하나로 합칠 수 있습니다.
 * 또한, '배열선언 + 요소 생성'과 동시에 값을 대입할 수도 있습니다.
 */
public class ArraySample03 {

	public static void main(String[] args) {
		// 기존 배열 생성 방법(배열 선언 + 배열 요소 생성)
		int[] test;
		test = new int[5];
		
		// 위 두 문장을 하나로 합칠 수 있습니다.
		int[] test2 = new int[5];

		// 배열 생성 시 값을 대입하여 생성 할 수도 있습니다. (=> 배열의 초기화)
		int[] test3 = {1, 2, 3, 4, 5};
				
 	}

}
