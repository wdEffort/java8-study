package com.ezen.example;

/**
 * 배열의 응용
 * 확장 for 문 사용
 * 
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * Java에는 배열 요소를 쉽게 가져올 수 있는
 * 확장 for 문이 있습니다.
 * 
 * 사용법
 * for (타입 변수명 : 배열명) {
 *   문장;
 * }
 * 
 * 단점
 * 일반 for 문을 사용했을 때와 달리 
 * 값의 위치(첨자)를 알 수 없습니다.
 */
public class ArraySample07 {

	public static void main(String[] args) {
		// 확장 for 문 사용 예제
		int[] test = new int[5];
		
		test[0] = 10;
		test[1] = 20;
		test[2] = 30;
		test[3] = 40;
		test[4] = 50;
		
		// 확장 for 문을 사용하면 배열 변수 test 각 요소의 값을
		// 하나씩 꺼내어 정수형 변수 num에 대입합니다.
		for (int num : test) {
			// 배열 변수 test 각 요소의 값을 출력합니다.
			System.out.println(num);
		}
	}

}
