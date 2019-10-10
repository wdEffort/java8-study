package com.ezen.example;

import java.io.*;

/**
 * 파일 다루기
 * 파일로 입력하기
 * 
 * @author yoman
 * 
 * 2019. 10. 10
 * 
 * StreamSample02에서 생성된 .txt 파일을 읽어들이는
 * 예제 코드를 작성해 봅니다.
 * 
 * [java.io.Reader 클래스의 서브 플래스]
 * FileReader : 파일을 읽어들이기 위한 문자 스트림
 * BufferedReader : 버퍼를 경유해 읽어 들이기 위한 문자 스트림
 * 
 * [참고]
 * 출력 : 파일로 내보내는 행위
 * 입력 : 파일을 읽어들이는 행위
 */
public class StreamSample03 {

	public static void main(String[] args) {
		// 파일 읽어들이는 예제
		
		try {
			// 파일 이름을 입력하여 표준 입력을 사용하기 위한 문자스트림을 생성합니다.
			// 버퍼를 경유하여 읽어들입니다.
			BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
			
			// 한 줄씩 읽어들입니다.
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			System.out.println("파일에 기록된 2개의 문자열은 ");
			System.out.println(str1 + "입니다.");
			System.out.println(str2 + "입니다.");
			
			// 스트림을 닫습니다.
			br.close();
		} catch(IOException e) {
			System.out.println("입출력 에러가 발생했습니다.");
		}
		
	}

}
