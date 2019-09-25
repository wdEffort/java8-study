package com.ezen.example;

/**
 * 조건문
 * if 문에 { }을 사용하지 않는다면?
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * if 문 안에서 여러 문장을 실행 시킬 때 { }으로 감싸지 않으면
 * 의도하지 않은 결과를 가져올 수 있습니다.
 */
public class ConditionSample04 {

	public static void main(String[] args) {
		// { } 사용하지 않는 예제
		int a = 2;
		
		if (a == 1) 
			System.out.println("a의 값은 1입니다."); // 이 문장만 if 문의 제어를 받습니다.
		System.out.println("a에 1이 대입 되었습니다."); // 이 문장은 if 문 밖에서 실행됩니다.
		
		System.out.println("처리를 종료합니다.");
		
	}

}
