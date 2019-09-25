package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 반복문
 * for 문 응용 예제 - 02
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * 1부터 입력한 숫자까지의 합 구하기
 */
public class LoopSample05 {

	public static void main(String[] args) throws IOException {
		System.out.println("숫자 몇까지의 합을 구하시겠습니까?");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		int sum = 0; // 합을 저장하는 변수를 선언하고 0으로 초기화 시킵니다.
		
		for (int i = 1; i <= num; i++) {
			sum += i; // i가 입력한 숫자와 같아질 때 까지 더합니다. 
		}
		
		// 합을 출력합니다.
		System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");

	}

}
