package com.ezen.example;

/**
 * 식과 연산자
 * 다양한 연산
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * 변수의 값을 사용하여 식을 만들 수 있습니다.
 * 주의사항! 
 * Java에서 식을 사용할 때 '우변 = 좌변'과 같이 '='로 표현을 하게 됩니다.
 * 수학에서 '=' 기호는 '동일하다'라는 의미가 되지만
 * 프로그래밍 언어에서는 '값을 할당(대입)한다'라는 의미를 가집니다.
 */
public class ExpressionSample03 {

	public static void main(String[] args) {
		// 변수의 값을 사용한 식의 출력 예제
		
		// 정수형 변수 num1, num을 선언과 동시에 초기화하고,
		// num1과 num2를 더한 값을 sum에 대입합니다.
		int num1 = 2;
		int num2 = 3;
		int sum = num1 + num2;
		
		System.out.println("변수 num1의 값은 " + num1 + "입니다.");
		System.out.println("변수 num1의 값은 " + num2 + "입니다.");
		System.out.println("num1 + num2의 값은 " + sum + "입니다.");
		
		num1 = num1 + 1; // num1에 1을 더한 후 다시 num1에 대입합니다.
		
		System.out.println("변수 num1의 값에 1을 더하면 " + num1 + "입니다.");
	}
	
}
