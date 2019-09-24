package com.ezen.example;

/**
 * 식과 연산자
 * 복합 대입 연산자 - 01
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * 대입 연산자란
 * 좌변의 변수에 우변의 값을 대입하는 연산자입니다.
 * 
 * 대입 연산자는 다른 연산기호와 결합시켜 다양하게 사용 할 수 있습니다.
 */
public class ExpressionSample07 {

	public static void main(String[] args) {
		// 대입 연산자 사용 예제
		int a = 2;
		int b = 3;
		
		a += b; // a = a + b
		System.out.println("a에 b를 더한 값은 " + a + "입니다.");
		
		a -= b; // a = a - b
		System.out.println("a에 b를 뺀 값은 " + a + "입니다.");
		
		a *= b; // a = a * b
		System.out.println("a에 b를 곱한 값은 " + a + "입니다.");
		
		a /= b; // a = a / b
		System.out.println("a에 b를 나눈 값은 " + a + "입니다.");
		
		System.out.println();
		
		// 증감 연산자의 또다른 표현법
		int c = 0;	

		// c++;
		c = c + 1;
		System.out.println("c의 값을 1 증가 시킵니다.");
		
		// c--;
		c = c - 1;
		System.out.println("c의 값을 1 감소 시킵니다.");
	
		System.out.println("최종적으로 c의 값은 " + c + "입니다.");
	}

}
