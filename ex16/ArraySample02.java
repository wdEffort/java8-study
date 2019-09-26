package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 배열(Array)
 * 키보드로 배열 길이 입력
 * 
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * 배열 요소의 개수를 코드 안에서 결정할 수 없는 경우
 * 키보드로 입력을 받아 요소의 개수를 지정할 수 있습니다.
 */
public class ArraySample02 {

	public static void main(String[] args) throws IOException {
		// 키보드로 배열 길이를 정하는 예제
		System.out.println("배열 요소의 개수를 입력하세요.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 배열 요소의 개수를 입력 받습니다.
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		// 배열 변수 test를 선언합니다.
		int[] test;
		// 위에서 입력한 배열 요소의 개수만큼 배열을 생성합니다.
		test = new int[num];
		
		System.out.println("각 요소의 값을 입력하세요.");
		
		// 배열 요소의 개수만큼 반복하며 값을 입력하고 배열에 저장합니다.
		for (int i = 0; i < num; i++) {
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
		}
		
		// 배열 요소의 값을 출력합니다.
		for (int i = 0; i < num; i++) {
			System.out.println((i + 1)+ "번째 값은 " + test[i] +"입니다.");
		}

	}

}
