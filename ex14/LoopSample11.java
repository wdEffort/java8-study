package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 프로세스 흐름의 변경
 * continue
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * continue : 반복처리를 건너 뛴 다음, 블록의 시작 위치로 돌아가서 다음 작업을 진행합니다.
 */
public class LoopSample11 {

	public static void main(String[] args) throws IOException {
		// continue 사용 예제

		System.out.println("몇 번째 처리를 건너 뛰시겠습니까? (1 ~ 10)");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		// 총 10번 반복하는 for 문을 선언합니다.
		for (int i = 1; i <= 10; i++) {
			if (i == res) // 키보드로 입력한 수와 동일한 반복 횟수가 되면 더이상 진행하지 않고, 처음으로 돌아갑니다.
				continue;
			
			System.out.println(i + "번째 반복합니다."); // 입력한 n번째의 처리에서 이 문장은 실행되지 않습니다.
		}

	}

}
