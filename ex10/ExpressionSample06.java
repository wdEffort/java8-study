package com.ezen.example;

/**
 * 식과 연산자
 * 증감 연산자
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * 전위 증감 연산자 : 값을 증가(또는 감소)시킨 다음, 대입
 * 후위 증감 연산자 : 값을 대입한 다음, 증가(또는 감소)
 * 
 * 증감 연산자는 '전위'를 쓰느냐 '후위'를 쓰느냐에 따라 실행 결과가 달라질 수 있다는 점에 유의하세요.
 */
public class ExpressionSample06 {

	public static void main(String[] args) {
		// 증감 연산자 예제
		int a = 0;
		int b = 0;
		
		b = a++;
		
		System.out.println("대입 후에 증가 연산자를 사용했습니다. b의 값은 " + b + "입니다.");
		
		b = ++a;
		
		System.out.println("대입 전에 증가 연산자를 사용했습니다. b의 값은 " + b + "입니다.");

	}

}
