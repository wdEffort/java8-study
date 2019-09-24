package com.ezen.example;

/**
 * 형변환
 * 다른 형끼리 연산하기
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * 다른 형끼리의 연산이 수행되면
 * 두 피연산자의 크기(자료형의 크기)를 비교하여 
 * 그 중에서 큰 데이터형으로 형변환 시킨 후 연산을 수행합니다.
 */
public class CastingSample03 {

	public static void main(String[] args) {
		// 다른 형끼리의 연산 예제
		int d = 2;
		double pi = 3.14;
		
		// 자료형의 크기
		// int : 4byte, double : 8byte
		
		System.out.println("지름이 " + d + "센티미터인 원의 ");
		System.out.println("둘레는  " + (d * pi) + "센티미터 입니다."); // int형 변수 d가 double형으로 변환되어 연산됩니다.
	}

}
