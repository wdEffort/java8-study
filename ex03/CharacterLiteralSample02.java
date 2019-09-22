package com.ezen.example;

/**
 * 문자 리터럴 - 02
 * 이스케이프 시퀀스(Escape sequence)
 * 
 * @author yoman
 * 
 * 2019. 09. 22
 * 
 * 이스케이프 시퀀스란?
 * '\'와 특정 문자를 결합하여 Java 언어 특성상
 * 표현할 수 없는 문자를 표시해주는 문자를 의미합니다.
 * 
 * '\' -> 백슬래쉬(Backslash)로 부릅니다.
 */
public class CharacterLiteralSample02 {

	public static void main(String[] args) {
		// 이스케이프 시퀀스 실습 예제
		System.out.println("백슬래시를 표기합니다. 때론 원화로 표기됩니다. => \\");
		System.out.println();
		System.out.println("작은 따옴표를 표기합니다. => \'");
		System.out.println();
		System.out.println("큰 따옴표를 표기합니다. => \"");
		System.out.println();
		System.out.println("수평탭만큼 띄어쓰기가 표기됩니다. => 가\t나\t다\t라");
		System.out.println();
		System.out.println("개행을 표기합니다. => 아버지가\n방에들어가신다.");
	}

}
