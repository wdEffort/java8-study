package com.ezen.example;

/**
 * 네 번째 연습문제 - 04
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * *
 * **
 * ***
 * ****
 * *****
 * 
 * 위와 같이 출력하는 코드를 작성하십시오.
 */
public class Practice04 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			// 안쪽 반복문이 실행될 때의 조건은 바깥쪽 반복문에서 얻어진 변수 i의 값을 이용합니다.
			// 즉, 변수 j가 i보다 작지 않을 때 실행됩니다.
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
