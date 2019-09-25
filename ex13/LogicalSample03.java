package com.ezen.example;

/**
 * 조건(삼항) 연산자의 원리
 * 복접한 조건 판단하기
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * 간단한 조건의 판단이 필요하다면 if 문을 사용하지 않아도 표현이 가능합니다.
 */
public class LogicalSample03 {

	public static void main(String[] args) {
		// 조건 연산자 예제
		int a = 1;
		int b = 2;
		
		// 조건 연산자 표현법 : 조건 ? 참(True)인 경우 식 : 거짓(False)인 경우 식
		char res1 = (a == 1) ? 'Y' : 'N';
		char res2 = (b == 2 && b < 3) ? 'Y' : 'N';
		
		System.out.println("a의 값은 1입니까? " + res1);
		System.out.println("b의 값은 2이거나 3보다 작습니까? " + res2);
		
	}

}
