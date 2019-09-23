package com.ezen.example;

/**
 * 변수(Variable)
 * 변수의 선언
 * 
 * @author yoman
 * 
 * 2019. 09. 23
 *
 * 컴퓨터도 숫자를 어딘가에 '기억'해두고, 화면에 출력할 수 있습니다.
 * 이 값을 기억시켜 두는 기능을 변수(Variable)라고 합니다.
 * 
 * 형명(data type) : 변수에는 여러가지 값을 저장시킬 수 있습니다. 이때 값의 유형을 형명 또는 데이터형이라고 부릅니다.
 * 식별자 : 변수의 이름으로 사용할 수 있는 문자와 숫자의 조합을 지칭합니다.
 */
public class VariableSample01 {

	public static void main(String[] args) {
		// 변수의 선언 방법 => 형명 식별자
		int num;
		
		// 선언한 변수에 값을 대입합니다. 이때 '='라는 기호를 사용합니다.
		// 변수명 = 식
		num = 1;
		
		// 변수 num을 출력시킵니다.
		System.out.println("변수 num의 값은 " + num + "입니다.");
		

	}

}
