package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 클래스 라이브러리
 * 클래스 라이브러리란?
 * 
 * @author yoman
 * 
 * 2019. 09. 30
 * 
 * Java의 표준 개발 환경인 JDK에는 자주 사용되는 기능을 정리한
 * 클래스 라이브러리(Class library)라 불리는 클래스들이 다수 포함되어 있습니다.
 * 
 * 클래스 라이브러리는 클래스 선언을 작성하지 않아도
 * 클래스의 기능을 이용할 수 있습니다.
 */
public class LibrarySample01 {

	public static void main(String[] args) throws IOException {
		// 클래스 라이브러리 사용 예제
		System.out.println("정수를 입력하십시오.");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		System.out.println(num + "가 입력되었습니다.");
		
		// 위 예제에서 사용된 클래스 라이브러리
		/*
		 * 1. IOException
		 * 2. BufferedReader
		 * 3. InputStreamReader
		 * 4. System
		 * 5. String
		 * 6. Integer
		 */
	}

}
