package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 입출력의 기본
 * 스트림(Stream)의 원리
 * 
 * @author yoman
 * 
 * 2019. 10. 10
 * 
 * 입력과 출력의 주요 대상은 화면 또는 키보드 그리고 '파일'입니다.
 * Java에서는 이러한 다양한 장비에 대한 입출력을 '일관된 방법'으로
 * 처리할 수 있습니다.
 * 
 * 이를 지원하기 위해 도입된 개념이 스트림입니다.
 * 
 * [참고]
 * System.out : 표준 출력
 * System.in : 표준 입력
 */
public class StreamSample01 {

	public static void main(String[] args) {
		// 스트림 사용 예제
		
		System.out.println("문자열을 입력하세요.");
		
		try {
			// InputStreamReader 클래스 : 문자나 문자열을 읽고 쓰기위해 사용되는 스트림
			// BufferedReader 클래스 : 버퍼를 경유하여 읽기 및 쓰기 효율이 좋아집니다.
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			System.out.println(str + "(이)가 입력되었습니다.");
		} catch(IOException e) {
			System.out.println("입출력 에러가 발생했습니다.");
		}

	}

}
