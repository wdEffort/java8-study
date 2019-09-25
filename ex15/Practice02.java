package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 네 번째 연습문제 - 02
 * 
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * 키보드로 시험 점수를 입력받은 후,
 * 그 합계를 출력하는 코드를 작성하세요.
 * (단, 0을 입력받으면 결과를 출력합니다.)
 */
public class Practice02 {

	public static void main(String[] args) throws IOException {
		// 키보드 입력을 요구하는 메시지를 출력시킵니다.
		System.out.println("시험 점수를 입력하십시오. (0으로 종료)");
		
		// 키보드로부터 입력을 받을 수 있게 하는 도구를 선언합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		// 합계 저장할 정수형 변수를 선언합니다.
		int sum = 0;
		
		// 위 문제에서는 범위가 정해지지 않았으므로 while 문을 사용합니다.
		while (true) {
			// 점수를 입력받아 문자열 변수 str에 대입합니다.
			String str = br.readLine();
			// 입력받은 문자열을 정수형으로 변환하여 변수 num에 대입합니다.
			int num = Integer.parseInt(str);
			
			// 만약, num이 0이라면 반복문은 종료됩니다.
			if (num == 0)
				break;
			
			// 합계 변수에 입력받은 숫자를 더합니다.
			sum += num;
		}
		
		// 합계를 출력합니다.
		System.out.println("시험 점수의 합계는 " + sum + "입니다.");
	}

}
