package com.ezen.example;

/**
 * 다양한 예외 처리  
 * 
 * @author yoman
 * 
 * 2019. 10. 09
 *
 * catch 블록은 얼마든지 추가할 수 있습니다.
 * 즉, 예외 클래스의 종류별로 처리를 분리할 수 있습니다.
 * 
 * 또한, Exception과 같이 슈퍼 클래스의 변수를 사용하면
 * 그를 상속받은 모든 예외 클래스를 받아내어 처리할 수 있습니다.
 */
public class ExceptionSample05 {

	public static void main(String[] args) {
		try {
			int[] test = new int[5];	
			test[10] = 80;
		} catch(ArrayIndexOutOfBoundsException ae) { // 배열 길이를 넘어 섰을 경우의 에러 처리
			System.out.println("배열 길이를 넘어섰습니다.");
			System.out.println(ae + " 이라는 예외가 발생했습니다.");
		} catch(NullPointerException ne) { // 값이 없는 변수에 특정 작업을 할 때 발생하는 에러에 대한 처리
			
		} catch(Exception e) { // 배열 범위 에러와 Null 에러를 처리(=> 맨 마지막에 선언해야 합니다.)
			
		}
		
		System.out.println("무사히 종료했습니다.");

	}

}
