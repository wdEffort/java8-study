package com.ezen.example;

/**
 * 식과 연산자
 * 시프트 연산자
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * 정수를 2진수로 표기했을 경우 
 * 자릿수를 왼쪽 또는 오른쪽으로 지정한 수만큼 이동시키는 연산자
 * 
 * 왼쪽 시프트 연산자 : 지정한 자릿수만큼 왼쪽으로 밀어낸 다음 밀어낸 자릿수만큼의 오른쪽을 모두 0으로 채움
 * 오른쪽 시프트 연산자 : 지정한 자릿수만큼 오른쪽으로 밀어낸 다음 밀어낸 자릿수만큼의 왼쪽을 모두 0으로 채움
 */
public class ExpressoinSample09 {

	public static void main(String[] args) {
		// 시프트 연산자 예제
		
		// 1byte 정수형 변수 a, b를 선언 후 5로 초기화 시킵니다.
		byte a = 5;
		byte b = 5;
		
		// 변수 a에 대해 오른쪽 시프트 연산을 수행합니다.
		a >>= 2;
		System.out.println(a);

		// 변수 b에 대해 왼쪽 시프트 연산을 수행합니다.
		b <<= 2;
		System.out.println(b);
	}

}
