package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 다섯 번째 연습문제 - 03
 *
 * @author yoman
 * 
 * 2019. 09. 27
 *
 * 키보드로 5명의 시험 점수를 입력받은 후
 * 합계와 평균을 출력하는 코드를 작성하세요.
 * 또한 가장 큰 점수를 출력하세요.
 */
public class Practice03 {

	public static void main(String[] args) throws IOException {
		// 배열 변수 test를 선언하고, 크기를 지정합니다.
		int[] test = new int[5];
		int sum = 0; // 합계를 저장하는 변수
		double average = 0; // 평균을 저장하는 변수
		int max = 0; // 최대값을 저장하는 변수

		System.out.println("5명의 시험 점수를 입력하십시오.");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 배열의 길이(크기)만큼 반복하면서 키보드로 입력을 받고, 배열에 입력받은 값을 대입합니다.
		for (int i = 0; i < test.length; i++) {
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
			// 합계에 입력받은 점수를 계속해서 더합니다.
			sum += test[i];
		}
		
		for (int i = 0; i < test.length; i++) {
			System.out.println((i + 1) + "번째 사람의 점수는 " + test[i] + "입니다.");
		}
		
		// 평균을 구합니다.
		average = (double) sum / test.length;

		System.out.println("5명의 시험점수 합계는 " + sum + "입니다.");
		System.out.println("5명의 시험점수 평균은 " + average + "입니다.");
		
		// 배열의 길이(크기)만큼 반복하면서 최대값을 구합니다.
		for (int i = 0; i < test.length; i++) {
			// 변수 max와 배열 변수 test 각 요소의 값을 비교하면서 최대값을 구합니다.
			if (test[i] > max) {
				max = test[i];
			}
		}
		
		System.out.println("가장 높은 점수는 " + max + "입니다.");
		
	}

}
