package com.ezen.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 파일 다루기
 * 파일에 출력하기
 * 
 * @author yoman
 * 
 * 2019. 10. 10
 * 
 * 키보드로 데이터를 입력하거나 화면에 출력하는 프로그램은 매우 편리합니다.
 * 그러나 데이터를 오랫동안 보존하거나 데이터를 대량으로 읽어들이기 위해서는
 * '파일'을 사용하여 데이터를 관리해야 합니다.
 * 
 * 스트림을 사용하여 파일 입출력 코드를 작성할 수 있습니다.
 * 파일을 사용하면 데이터를 저장하거나 읽어들이는 실용적인 프로그램을 만들 수 있습니다.
 * 
 * [java.io.Writer 클래스의 서브 플래스]
 * FileWriter : 파일에 기록하기 위한 문자 스트림
 * BufferedWriter : 버퍼를 경유해서 기록하기 위한 문자 스트림
 * PrintWriter : 한 줄씩 기록하기 위한 문자 스트림
 * 
 * [참고]
 * 출력 : 파일로 내보내는 행위
 * 입력 : 파일을 읽어들이는 행위
 */
public class StreamSample02 {

	public static void main(String[] args) {
		// 파일 출력 실습 예제
		
		try {
			// 파일 이름을 입력하여 표준 입력을 사용하기 위한 문자스트림을 생성합니다.
			// 버터를 경유하여 읽어들이고, 한 줄씩 기록하기 위해 PrintWriter 클래스의 객체를 생성합니다.
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")));
			
			// println() 메소드를 사용하여 한 줄씩 기록합니다.
			pw.println("Hello!");
			pw.println("Goodbye!");
			
			System.out.println("파일에 기록되었습니다.");
			
			// 파일을 닫습니다.
			pw.close();
		} catch(IOException e) {
			System.out.println("입출력 에러가 발생했습니다.");
		}

	}

}
