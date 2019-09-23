package com.ezen.example;

/**
 * 첫 번째 연습문제 - 05
 * 
 * @author yoman
 * 
 * 2019. 09. 23
 * 
 * 8진수 16진수를 사용하여 6, 20, 13을 출력하는 코드를 작성하십시오.
 * 
 * 'Tab' 기호를 표혀하는 이스케이프 시퀀스를 사용하여 위와 같은 문장을 출력하십시오.
 */
public class Practice05 {

	public static void main(String[] args) {
		// 6
		System.out.println("6을 8진수로 표현 : " + 006); // 8진수
		System.out.println("6을 16진수로 표현 : " + 0x06); // 16진수
		
		// 20
		System.out.println("20을 8진수로 표현 : " + 024); // 8진수
		System.out.println("20을 16진수로 표현 : " + 0x14); // 16진수
		
		//13
		System.out.println("13을 8진수로 표현 : " + 0xD); // 8진수
		System.out.println("13을 16진수로 표현 : " + 015); // 16진수
		
	}

}
