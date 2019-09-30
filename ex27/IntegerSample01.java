package com.ezen.example;

/**
 * 클래스 라이브러리
 * Wrapper 클래스
 * 
 * @author yoman
 * 
 * 2019. 10. 01
 * 
 * Java에서는 '기본형'을 위해 다양한 기능을 제공하는
 * 래퍼 클래스(Wrapper class)가 있습니다.
 * 
 * 종류 : Byte, Character, Short, Integer, Long, Float, Double
 * 
 * 래퍼 클래스는 '클래스 메소드'를 가지고 있습니다.
 * 
 * 여기서는 Integer 클래스에 대해 다룹니다.
 * 
 * 주요 '클래스 메소드'
 * 1. parseInt(String str) : 문자열을 정수(기본형)로 변환(int)  
 * 2. valueOf(String str) : 인수로 전달된 문자열의 값으로 초기화된 Integer 객체를 반환(Integer)
 */
public class IntegerSample01 {

	public static void main(String[] args) {
		// Integer 클래스의 메소드 사용 예제
		String str = "100";
		
		// 문자열 변수를 정수형 값으로 변환시킵니다.
		int num = Integer.parseInt(str);
		System.out.println("num 값은 " + num + "입니다.");
		
		// 400으로 초기화된 Integer 객체를 생성합니다.
		Integer num2 = Integer.valueOf("400");
		System.out.println("num2 값은 " + num2 + "입니다.");
	}

}
