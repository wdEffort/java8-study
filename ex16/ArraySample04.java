package com.ezen.example;

/**
 * 배열(Array)
 * 배열 변수에 값 대입하기
 * 
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * 대입 연산자(=)를 사용하여 이미 생성된 배열을 대입하는 방법도 있습니다.
 */
public class ArraySample04 {

	public static void main(String[] args) {
		// 배열 변수에 값 대입하기 예제
		int[] a = new int[3];
		
		System.out.println("배열 a를 선언하고, 요소를 생성하였습니다.");
		
		// 배열 a에 값을 대입합니다.
		a[0] = 1;
		a[1] = 10;
		a[2] = 100;
		
		int[] b;
		System.out.println("배열 b를 선언하였습니다.");
		
		System.out.println("배열 변수 b에 a를 대입합니다.");
		b = a;
		
		// 배열 a 요소의 값을 출력합니다.
		for (int i = 0; i < 3; i++) {
			System.out.println("a가 가리키는" + (i + 1) + "번째 값은 " + a[i] + "입니다.");
		}
		
		// 배열 b 요소의 값을 출력합니다.		
		for (int i = 0; i < 3; i++) {
			System.out.println("b가 가리키는" + (i + 1) + "번째 값은 " + b[i] + "입니다.");
		}
		
	}

}
