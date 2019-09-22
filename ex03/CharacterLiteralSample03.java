package com.ezen.example;

/**
 * 문자 리터럴 - 03
 * 유니코드(Unicode)
 * 
 * @author yoman
 * 
 * 2019. 09. 22
 * 
 * 컴퓨터 내부에서는 문자를 숫자로 취급합니다.
 * 이러한 각 문자에 해당하는 숫자를 문자 코드(Character code)라고 하며
 * Java에서는 유니코드(Unicode)라는 문자 코드가 사용됩니다.
 */
public class CharacterLiteralSample03 {

	public static void main(String[] args) {
		// 유니코드 실습 예제
		System.out.println("\101"); // 8진수 문자코드를 가지는 값을 출력합니다.
		System.out.println("\u0061"); // 16진수 문자코드를 가지는 값을 출력합니다.
	}

}
