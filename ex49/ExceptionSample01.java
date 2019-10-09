package com.ezen.example;

/**
 * 예외(Exception)의 기본
 * 
 * @author yoman
 * 
 * 2019. 10. 09
 * 
 * 프로그램은 실행 시에 다양한 오류가 발생할 수 있습니다.
 * 어떠한 오류들은 컴파일 할 때 찾을 수 없습니다.
 * 즉, 프로그램을 실행시키고 나서야 비로소 에러가 있음을 알 수 있습니다.
 * 
 * Java는 이러한 프로그램 실행 중 발생 오류에 대응하기 위한
 * '예외 처리' 메커니즘을 제공합니다.
 */
public class ExceptionSample01 {

	public static void main(String[] args) {
		// 예외 발생 실습 예제
		
		int[] test;
		test = new int[5];
		
		System.out.println("test[10]에 값을 대입합니다.");
		
		// 배열 요소의 개수를 초과했으므로 예외가 발생합니다.(ArrayIndexOutOfBoundsException)
		test[10] = 80;
		
		// 예외가 발생하면
		// 에러 메시지 출력과 동시에 프로그램이 종료됩니다.
		// 따라서 아래 코드는 실행되지 않습니다.
		System.out.println("test[10]dp 80을 대입했습니다.");
		System.out.println("무사히 종료했습니다.");

	}

}
