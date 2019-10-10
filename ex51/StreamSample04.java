package com.ezen.example;

import java.io.*;

/**
 * 파일 다루기
 * 많은 양의 데이터 입력하기
 * 
 * @author yoman
 * 
 * 2019. 10. 10
 * 
 * 파일에서 데이터를 입력하는 방법을 활용하면
 * 텍스트 편집기로 만든 파일에서 많은 양의 데이터를 가져올 수 있습니다.
 * 
 * 소스 파일이 있는 디렉토리에 'test2.txt'를 생성한 후 데이터를 입력해주세요.
 */
public class StreamSample04 {

	public static void main(String[] args) {
		try {
			// 파일 이름을 입력하여 표준 입력을 사용하기 위한 문자스트림을 생성합니다.
			// 버퍼를 경유하여 읽어들입니다.
			BufferedReader br = new BufferedReader(new FileReader("test2.txt"));
			
			// 정수형 배열을 준비합니다.
			int[] test = new int[10];
			String str;
			
			// 배열의 길이만큼 파일 데이터를 한 줄씩 읽어들입니다.
			for(int i = 0; i < test.length; i++) {
				str = br.readLine();
				test[i] = Integer.parseInt(str);
			}
			
			int max = test[0];
			int min = test[0];
			
			// 최대, 최소 값을 구합니다.
			for(int i = 0; i < test.length; i++) {
				if(max < test[i]) {
					max = test[i];
				}
				
				if(min > test[i]) {
					min = test[i];
				}
				System.out.println(test[i]);
			}
			
			System.out.println("최고 값은 " + max + "입니다.");
			System.out.println("최저 값은 " + min + "입니다.");
			
			// 스트림을 닫습니다.
			br.close();
		} catch (IOException e) {
			System.out.println("입출력 에러가 발생했습니다.");
		}

	}

}
