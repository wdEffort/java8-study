package com.ezen.example;

/**
 * 조건문
 * 조건(식)과 관계 연산자
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * Java에서는 다양한 상황을 표기하기 위해 
 * 조건(Condition)이라는 개념을 사용합니다.
 * 
 * 참(True), 거짓(False) 두 개의 값 중 하나를 표현하는 식을 
 * Java에서는 '조건' 혹은 '조건식'이라고 합니다. 
 * 
 * 조건을 만들기 위해서는 
 * '==', '!=', '>', '>=', '<', '<='과 같이 
 * 관계 연산자(Relational operator)를 사용합니다.
 */
public class ConditionSample01 {

	public static void main(String[] args) {
		// 관계 연산자 사용 예제
		
		// 작다, 크다
		System.out.println("3은 5보다 작습니다. : " + (3 < 5));
		System.out.println("3은 5보다 큽니다. : " + (3 > 5));
		
		// 같다, 다르다
		System.out.println("1과 1은 같습니다. : " + (1 == 1));
		System.out.println("1과 2는 같습니다. : " + (1 == 2));
		System.out.println("1과 2는 다릅니다. : " + (1 != 2));
		
		// 같거나 작다, 같거나 크다
		System.out.println("4는 5보다 같거나 작습니다. : " + (4 <= 5));
		System.out.println("4는 5보다 같거나 큽니다. : " + (4 >= 5));
		System.out.println("4는 4보다 같거나 큽니다. : " + (4 >= 4));
		
	}

}
