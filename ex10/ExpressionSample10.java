package com.ezen.example;

/**
 * 식과 연산자
 * 연산자 우선 순위
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * 연산자는 우선 순위가 있습니다.
 * 우선 순위를 변경하려면 ( )를 사용해야 합니다.
 * 우선순위가 동일한 경우 반드시 '왼쪽에서 오른쪽으로' 계산됩니다.
 * 대입 연산자는 오른쪽부터 먼저 평가됩니다.
 */
public class ExpressionSample10 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		
		int sum1 = a + b * c;
		int sum2 = (a + b) * c;
		
		System.out.println("sum1의 값은 " + sum1 + "입니다.");
		System.out.println("sum2의 값은 " + sum2 + "입니다.");
	}

}
