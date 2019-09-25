package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 프로세스 흐름의 변경
 * break
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * break : 처리의 흐름을 강제로 종료시키고, 그 블록에서 빠져나갑니다.
 */
public class LoopSample10 {

	public static void main(String[] args) throws IOException {
		// break 사용 예제
		
		System.out.println("몇 번째에서 반복문을 빠져 나가시겠습니까? (1~10)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		// 총 10번 반복하는 for 문을 선언합니다.
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "번째 반복합니다.");
			
			if (i == res) // 키보드로 입력받은 횟수만큼 반복한 후 for 문을 빠져나갑니다.
				break;
		}

	}

}
