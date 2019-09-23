package com.ezen.example;

/**
 * 변수(Variable)
 * 변수에 값을 대입할 때 주의할 점
 * 
 * @author yoman
 * 
 * 2019. 09. 23
 *
 * 변수에 값을 대입할 때에는 변수의 형과 대입하는 값이 일치하는지 꼭! 확인해야합니다.
 */
public class VariableSample05 {

	public static void main(String[] args) {
		// 변수에 값을 대입하는 예제
		// 정수형 변수 num을 선언합니다.
		int num;
		
		// 정수형 변수 num에 소수 3.14를 대입합니다. => ERROR
		// num = 3.14;
		num = 3;
		
		
		// 변수 num의 값을 출력시킵니다.
		System.out.println("변수 num의 값은 " + num + "입니다.");

	}

}
