package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 키보드로 입력하기
 * Scanner, BufferedReader(여기서 다룹니다.)
 * 
 * @author yoman
 * 
 * 2019. 09. 23
 *
 * 지금까지는 작성한 코드를 화면에 출력시키는 작업을 했습니다.
 * 여기서는 사용자로부터 키보드에 입력을 받은 값을 출력시키는 코드를 작성해 보겠습니다.
 * 
 * 표준입력: System.in => 컴퓨터의 키보드
 * 표준출력 : System.out => 컴퓨터의 화면
 */
public class KeyboardIOSample01 {

	public static void main(String[] args) throws IOException {
		// 키보드 입력 및 출력 예제
		
		// 키보드 입력을 요구하는 메시지를 출력시킵니다.
		System.out.print("문자열을 입력하십시오. > ");
		
		// 키보드로부터 입력을 받을 수 있게 하는 도구를 선언합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 키보드로 입력한 문자열을 변수 str에 대입합니다.(=> 키보드로 입력한 후 Enter key를 누릅니다.)
		String str = br.readLine();
		
		// 변수 str을 출력시킵니다.
		System.out.println(str + "(이)가 입력되었습니다.");
	}

}
