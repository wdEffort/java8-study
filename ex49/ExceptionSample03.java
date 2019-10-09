package com.ezen.example;

/**
 * 예외와 클래스
 * 
 * @author yoman
 * 
 * 2019. 10. 09
 *
 * 예외란, 클래스 라이브러리 java.lang 패키지에 속한
 * 'Throwable 클래스'를 확장한 서브 클래스의 객체를 뜻합니다.
 * 
 * 즉, ArrayIndexOutOfBoundsException도 
 * Throwable 클래스의 서브 클래스를 확장한 클래스의 객체입니다.
 */
public class ExceptionSample03 {

	public static void main(String[] args) {
		try {
			int[] test = new int[5];	
			test[10] = 80;
		} catch(ArrayIndexOutOfBoundsException e) { // catch 블록이 예외 객체를 받으면 변수 e가 그 예외 객체를 가리키게됩니다.
			System.out.println("배열 길이를 넘어섰습니다.");
		}
		
		System.out.println("무사히 종료했습니다.");

	}

}
