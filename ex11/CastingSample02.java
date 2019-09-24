package com.ezen.example;

/**
 * 형변환
 * 캐스트 연산자(Cast operator)
 * 
 * @author yoman
 * 
 * 2019. 09. 24
 * 
 * 작은 데이터형 변수를 큰 데이터형 변수에 대입할 때는 특별한 작업을 하지 않았습니다.
 * 하지만 큰 데이터형 변수를 작은 데이터형 변수에 대입할 때는 '명시적'으로 형변환을 시켜주어야 합니다.
 */
public class CastingSample02 {

	public static void main(String[] args) {
		// 작은 사이즈의 형에 대입하기 예제
		double dnum = 160.5;
		System.out.println("키는 " + dnum + "센티미터 입니다.");
		
		System.out.println("int형 변수에 대입합니다.");
		
		// 작은 데이터형 변수에는 대입할 수 없습니다.
		// int inum = dnum;
		
		// 따라서 캐스트 연산자를 사용하여 ( ) 안에서 지정한 자로형으로 강제 변환 시킵니다.
		int inum = (int)dnum;
		
		// 소수점 이하는 버려진 정수형 변수 inum을 출력시킵니다.
		System.out.println("키는 " + inum + "센티미터 입니다.");

	}

}
