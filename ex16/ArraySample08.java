package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 배열의 응용
 * 정렬
 * 
 * @author yoman
 * 
 * 2019. 09. 26
 * 
 * 배열 안에 들어 있는 값을 정렬 할 수 있습니다.
 */
public class ArraySample08 {

	public static void main(String[] args) throws IOException {
		// 배열 요소를 정렬하는 예제
		int[] test = new int[5];
				
		System.out.println("값을 입력하세요.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 배열 변수 test의 크기(길이)만큼 값을 입력 받아 대입합니다.
		for (int i = 0; i < test.length; i++) {
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}
		
		// 배열 변수 test 요소의 값에 대해 내림차순 정렬을 진행합니다.
		// 바깥쪽 for 문에서는 마지막 요소에 대해서는 검사가 필요 없으므로 (길이 - 1) 만큼 반복합니다.
		for (int j = 0; j < (test.length - 1); j++) {
			// 안쪽 for 문에서는 배열의 다음 요소와 비교하기 위하여 바깥쪽 for 문 시작 위치 +1 위치부터 시작하도록 합니다.
			for (int k = (j + 1); k < test.length; k++) {
				// 현재 값과 이전 요소의 값을 비교하여 정렬이 진행됩니다.
				if (test[k] > test[j]) {
					int tmp = test[k];
					test[k] = test[j];
					test[j] = tmp;
				}
			}
		}
		
		System.out.println("정렬된 결과를 출력합니다.");
		
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + "\t");
		}

	}

}
