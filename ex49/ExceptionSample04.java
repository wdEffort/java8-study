package com.ezen.example;

/**
 * 예외 정보 출력하기
 * 
 * @author yoman
 * 
 * 2019. 10. 09
 *
 * 예외를 받아낸 변수(e)를 활용하면
 * 예외 정보를 출력하는 것 또한 가능합니다.
 */
public class ExceptionSample04 {

	public static void main(String[] args) {
		try {
			int[] test = new int[5];	
			test[10] = 80;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이를 넘어섰습니다.");
			System.out.println(e + " 이라는 예외가 발생했습니다.");
		}
		
		System.out.println("무사히 종료했습니다.");

	}

}
