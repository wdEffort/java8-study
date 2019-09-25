package com.ezen.example;

/**
 * 논리 연산자
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * 조건을 보다 상세히 평가하기 위해서는 논리 연산자(Logical operator)를 사용합니다.
 * 종류 : &&(AND), ||(OR), !(NOT)
 * 
 * 참고사항
 * && : 좌변의 조건이 참(True)인 경우에만 우변의 조건을 평가합니다.
 * || : 좌변의 조건이 거짓(False)인 경우에만 우변의 조건을 평가합니다.
 * 
 * 이외에 비트 연산자('&', '|', '^', '~')도 있지만
 * 논리 연산자와는 다르므로 주의하시기 바랍니다.(=> 정수형 값을 연산)
 */
public class LogicalSample01 {

	public static void main(String[] args) {
		// 관계 연산자 사용 예제
		
		// &&(AND) 연산자는 좌변, 우변 양 쪽이 모두 참(True)인 경우 참(True)입니다.
		System.out.println(5 > 3 && 3 == 4);
		
		// ||(OR) 연산자는 좌변, 우변 중 하나가  참(True)인 경우 참(True)입니다.
		System.out.println(1 == 1 || 1 > 2);
		
		// !(NOT) 연산자는 우변이 거짓(False)인 경우 참(True)입니다.
		System.out.println(!(2 < 3));

	}

}
