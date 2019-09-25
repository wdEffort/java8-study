package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 반복문
 * for 문 응용 예제 - 01
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * 입력한 숫자만큼 '*'를 출력하는 예제
 */
public class LoopSample04 {

	public static void main(String[] args) throws IOException {
		System.out.println("몇 개의 *를 출력 하시겠습니까?");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		// 입력한 수 만큼 반복해서 '*'를 출력합니다.
		for (int i = 1; i <= num; i++) {
			System.out.print("*");
		}

	}

}
