package com.ezen.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 조건문
 * 입력된 문자로 분기처리 하기
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * 지금까지는 숫자로만 분기처리를 해왔습니다.
 * 문자로 분기하는 방법을 배워봅니다.
 */
public class SwitchSample03 {

	public static void main(String[] args) throws IOException {
		// 키보드 입력을 요구하는 메시지를 출력시킵니다.
		System.out.println("a 혹은 b를 입력하십시오.");

		// 키보드로부터 입력을 받을 수 있게 하는 도구를 선언합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 키보드로부터 입력을 받아 문자열 변수 str에 대입합니다.
		String str = br.readLine();
		// 입력받은 문자열로 부터 첫번째 문자를 뽑아냅니다. (charAt()에 대해서는 추후에 자세히 다룹니다.)
		char res = str.charAt(0);

		switch (res) {
			case 'a':
				System.out.println("a가 입력되었습니다.");
				break;
			case 'b':
				System.out.println("b가 입력되었습니다.");
				break;
			default:
				System.out.println("a 혹은 b를 입력하십시오.");
				break;
		}

	}

}
