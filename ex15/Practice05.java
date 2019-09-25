package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 네 번째 연습문제 - 05
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * 키보드로 정수를 입력받아서, 그 수가 소수인지
 * 여부를 판단하는 코드를 작성하세요
 * 
 * 소수 : 1 또는 그 이외의 수로 나누어 떨어지지 않는 수 (약수가 1과 자기 자신뿐인 수)
 * Ex) 2, 3, 7, 11, 13, ...
 * 약수 : 정수 0이 아닌 정수 D로 나누었을 때 나누어 떨어지는 경우 D를 N의 약수라고 합니다.
 */
public class Practice05 {

	public static void main(String[] args) throws IOException {
		// 키보드 입력을 요구하는 메시지를 출력시킵니다.
		System.out.println("2 이상의 숫자를 입력하세요.");

		// 키보드로부터 입력을 받을 수 있게 하는 도구를 선언합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		// 입력받은 숫자에 대해 약수의 개수를 저장하는 변수를 선언합니다.
		int count = 0;
		
		// 1과 자기 자신을 제외한 범위내에서 반복문이 처리됩니다.
		for (int i = 2; i < num; i++) {
			// 입력받은 수를 i로 나누었을 때 나누어 떨어지면 count의 값을 1 증가시킵니다.
			if (num % i == 0) {
				count++;
			}
		}
		
		// 만약, count의 값이 0인 경우 약수가 없었다는 것이므로 소수로 판별됩니다.
		if (count == 0) {
			System.out.println(num + "은 소수입니다.");
		} else { // 그렇지 않은 경우 입력받은 숫자는 소수가 아닙니다.
			System.out.println(num + "은 소수가 아닙니다.");
		}

	}

}
