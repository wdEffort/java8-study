package com.ezen.example;

/**
 * 문자 리터럴 - 01
 * 문자(Character)
 * 
 * @author yoman
 * 
 * 2019. 09. 22
 * 
 * Java에서 문자의 표기는 ''(작읍 따옴표)로 묶어서 표기합니다.
 * 단, ''(작은 따옴표) 사이에는 하나의 문자만 들어갈 수 있습니다.
 */
public class CharacterLiteralSample01 {
	
	public static void main(String[] args) {
		// 문자 리터럴 표기 실습 예제
		System.out.println('A');
		System.out.println('a');
		System.out.println('가');
		System.out.println('1'); // 숫자를 문자로 표기합니다.
		// ''(작은 따옴표) 사이에는 하나의 문자만 올 수 있으므로 아래 코드는 ERROR가 발생합니다.
		// System.out.println('이젠컴퓨터학원');
	}
}
