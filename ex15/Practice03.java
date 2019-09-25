package com.ezen.example;

/**
 * 네 번째 연습문제 - 03
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * 탭 문자(\n)를 사용해서 아래와 같이 구구단을 화면에 출력하는 코드를 작성하십시오.
 * 1	2	3	4	5	6	7	8	9
 * 2	4	6	8	10	12	14	16	18
 * ...
 * 9	18	27	36	45	54	63	72	81
 */
public class Practice03 {

	public static void main(String[] args) {
		// 바깥쪽 반복문이 한번 실행될 때 안쪽 반복문은 9번 실행됩니다.
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}

	}

}
