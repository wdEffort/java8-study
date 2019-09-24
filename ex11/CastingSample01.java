package com.ezen.example;

/**
 * 형변환
 * 큰 사이즈의 형에 대입하기
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * 형변환이란
 * 데이터의 자료형을 바꾸는 작업을 뜻합니다.
 */
public class CastingSample01 {

	public static void main(String[] args) {
		// 형변환 예제
		int inum = 160;
		
		System.out.println("키는 " + inum + "센티미터 입니다.");
		
		System.out.println("double형 변수에 대입합니다.");
		
		// int : 4byte, double : 8byte
		// 정수형 변수 inum을 큰 사이즈형 변수 dnum에 대입합니다.
		double dnum = inum;
		
		System.out.println("키는 " + dnum + "센티미터 입니다.");
		

	}

}
