package com.ezen.example;

/**
 * 변수(Variable)
 * 변수의 값 바꾸기
 * 
 * @author yoman
 * 
 * 2019. 09. 23
 *
 * 지금까지 작성한 코드를 실행시켜보면 
 * 작성한 코드 문장 하나하나가 절차적(순서대로)으로 처리되는 것을 볼 수 있습니다.
 * 
 * 이 성질을 활용하면 이미 값을 가진 변수의 값을 새로운 값으로 변경시킬 수 있습니다. 
 */
public class VariableSample04 {

	public static void main(String[] args) {
		// 변수의 값 바꾸기 예제
		
		// 변수를 선언한 뒤 값을 대입합니다.
		int num;
		num = 3;
		
		// 선언된 변수 num의 값을 출력시킵니다.
		System.out.println("변수 num의 값은 " + num + "입니다.");
		
		// 변수 num에 5를 대입함으로써 값을 변경시킵니다.
		num = 5;
		
		// 변경된 변수 num의 값을 출력시킵니다.
		System.out.println("변수 num의 값을 변경했습니다.");
		System.out.println("변수 num의 값은 " + num + "입니다.");
		
		System.out.println("=============================================");
		
		// 변수에 값을 대입할 때에는 다른 변수의 값을 대입할 수도 있습니다.
		// 변수 a, b를 선언합니다.
		int a, b;
		
		// 변수 a에 10을 대입합니다.
		a = 10;
		
		
		// 변수 a의 값을 출력시킵니다.
		System.out.println("변수 a의 값은 " + a + "입니다.");
		
		// 변수 b에 a를 대입시킵니다.
		b = a;
		
		// 변수 b의 값을 출력시킵니다.
		System.out.println("변수 a의 값을 변수 b에 대입했습니다.");
		System.out.println("변수 b의 갑은 " + b + "입니다.");
		
	}

}
