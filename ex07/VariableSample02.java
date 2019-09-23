package com.ezen.example;

/**
 * 변수(Variable)
 * 식별자 선언 방법
 * 
 * @author yoman
 * 
 * 2019. 09. 23
 *
 * 식별자란 변수의 이름으로 사용할 수 있는 문자와 숫자의 조합이라고 했습니다.
 * 단, Java에서 식별자가 되기 위해서는 다음과 같은 규칙을 따라야 합니다.
 * 
 * 1. 일반적으로 영문자와 숫자와 밑줄(_), $ 등을 사용합니다.
 * 2. 길이에는 제한이 없습니다.
 * 3. 미리 Java가 예약한 토큰인 '키워드'를 사용할 수 없습니다. 
 * (토큰 : '단어', 즉 특정 의미를 가진 문자(또는 조합) => 리터럴, 키워드, 식별자, 연산자, 구분자 등)
 * 4. 숫자로 시작할 수 없습니다.
 * 5. 알파벳 대문자와 소문자는 다른 문자로 구별됩니다.
 */
public class VariableSample02 {

	public static void main(String[] args) {
		// 식별자 예제
		
		// 식별자로 사용 가능합니다.
		int a;
		int abc;
		int ab_c;
		int F1;
		
		// 식별자로 사용 불가능합니다.
		// int 12a;
		// int return;
		// int is-a;
		

	}

}
