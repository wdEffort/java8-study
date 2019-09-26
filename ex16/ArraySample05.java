package com.ezen.example;

/**
 * 배열(Array)
 * 배열 변수에 값 대입한다는 것의 의미
 * 
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * 배열 변수에 값을 대입한다는 것은
 * 새로운 배열이 또 하나 생겨나는 것이 아닌
 * 대입되는 좌변의 배열 변수가 우변의 배열 변수를 가르키는 것입니다.
 * 즉, 동일한 하나의 배열을 가르키게 됩니다.
 */
public class ArraySample05 {

	public static void main(String[] args) {
		// 배열 변수 값 대입 테스트 예제

		// 배열 변수 a를 선언하고, 크기를 지정합니다.
		int[] a = new int[3];

		// 배열 변수 a 각 요소의 값을 대입합니다.
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;

		// 배열 변수 b를 선언합니다.
		int[] b;

		// 배열 변수 b에 a를 대입합니다.
		// 이때 부터 a와 b는 하나의 배열을 가르키게 됩니다.
		b = a;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("a가 가리키는 " + (i + 1) + "번째 요소의 값은 " + a[i] + "입니다.");
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("b가 가리키는 " + (i + 1) + "번째 요소의 값은 " + b[i] + "입니다.");
		}
		
		System.out.println("================================");
		
		// 배열 변수 a의 두 번째 요소의 값을 100으로 변경시킵니다.
		a[1] = 100;

		for (int i = 0; i < 3; i++) {
			System.out.println("a가 가리키는 " + (i + 1) + "번째 요소의 값은 " + a[i] + "입니다.");
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("b가 가리키는 " + (i + 1) + "번째 요소의 값은 " + b[i] + "입니다.");
		}
	}

}
