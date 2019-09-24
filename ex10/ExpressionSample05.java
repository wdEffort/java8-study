package com.ezen.example;

/**
 * 식과 연산자
 * 연산자의 종류
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * Java에는 다양한 연산자가 있습니다.
 */
public class ExpressionSample05 {
	
	public static void main(String[] args) {
		// 대표적인 연산자를 다루는 예제
		
		int num1 = 10;
		int num2 = 5;
		
		System.out.println("num1과 num2로 다양한 연산을 수행합니다.");
		System.out.println("num1 + num2는 " + (num1 + num2) + "입니다."); // 덧셈
		System.out.println("num1 - num2는 " + (num1 - num2) + "입니다."); // 뺄셈
		System.out.println("num1 * num2는 " + (num1 * num2) + "입니다."); // 곱셈
		System.out.println("num1 / num2는 " + (num1 / num2) + "입니다."); // 나누기
		System.out.println("num1 % num2는 " + (num1 % num2) + "입니다."); // 나머지
		System.out.println("num1을 음수로 표현하면 " + (-num1) + "입니다."); // 단항연산자
		
		System.out.println("안녕하세요. " + "반갑습니다."); // 문자열 연결
		
		// ""로 묶인 문자열을 피연산자로 가지는 연산은 피연산자 중 하나가 숫자라면 그 숫자는 문자열로 변환된 후 연결됩니다.
		System.out.println("num1 + num2는 " + (num1 + num2) + "입니다."); 
		
	}
	
}
