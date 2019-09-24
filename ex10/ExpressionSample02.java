package com.ezen.example;

/**
 * 식과 연산자
 * 식을 출력함에 있어서 주의사항
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * 화면에 출력되는 값은 먼저 '표현식이 평가(Evaluation)' 된 후 값으로 표현됩니다.
 */
public class ExpressionSample02 {

	public static void main(String[] args) {
		// 식을 출력하는 예제
		System.out.println("1 + 2는 " + (1 + 2) + "입니다."); // 올바른 표현법
		System.out.println("1 + 2는 " + 1 + 2 + "입니다."); // 틀린 표현법
	}

}
