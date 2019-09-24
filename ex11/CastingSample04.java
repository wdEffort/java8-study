package com.ezen.example;

/**
 * 형변환
 * 같은 형끼리 연산하기
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * 같은 형으로 연산이 수행되면 판별값의 형 또한 같습니다.
 * 하지만 의외의 결과를 출력하는 경우가 있습니다.
 */
public class CastingSample04 {

	public static void main(String[] args) {
		// 같은 형끼리 연산 예제
		int num1 = 5;
		int num2 = 4;
		
		double div = num1 / num2;
		
		System.out.println("5 나누기 4는 " + div + "입니다."); // 1.25가 출력되지 않습니다.
		
		// 연산되는 두 피연산자의 자료형이 모두 int형입니다.
		// 따라서 int형의 값으로 판별됩니다.
		
		// 위 코드에서 1.25라는 값을 얻기 위해서는
		// 적어도 변수 num1, num2 둘 중 하나(또는 모두)는 double형이어야 합니다. (=> 다른 형끼리 연산하기 참고)
		
		// div = (double)num1 / num2;
		div = (double)num1 / (double)num2;
		System.out.println("5 나누기 4는 " + div + "입니다."); // 1.25가 출력됩니다.

	}

}
