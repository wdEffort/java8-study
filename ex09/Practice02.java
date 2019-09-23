package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 두 번째 연습문제 - 02
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * 당신은 몇살입니까?
 * 23 (<< 입력)
 * 당신은 23살입니다.
 * 
 * 위와 같이 화면에 출력하는 코드를 작성하십시오.
 */
public class Practice02 {

	public static void main(String[] args) throws IOException {
		// 키보드 입력을 요구하는 메시지를 출력시킵니다.
		System.out.println("당신은 몇 살입니까?");
		
		// 키보드로부터 입력을 받을 수 있게 하는 도구를 선언합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 키보드로 입력한 문자열을 변수 str에 대입합니다.(=> 키보드로 입력한 후 Enter key를 누릅니다.)
		String str = br.readLine();
		
		// 문자열 변수 str을 정수형으로 변환시킨 후 변수 num에 대입합니다.
		int num = Integer.parseInt(str);
		
		// 변수 str을 출력시킵니다.
		System.out.println("당신은 " + num + "살입니다.") ;

	}

}
