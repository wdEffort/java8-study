package com.ezen.example;

/**
 * 예외 처리하기(Exception Handling)
 * 
 * @author yoman
 * 
 * 2019. 10. 09
 * 
 * ExceptionSample01에서는 예외 발생에 대비하여 별다른 처리를 하지 않았습니다.
 * 그러나 예외를 적절하게 처리하는 코드를 작성하게 되면,
 * 견고한 프로그램을 작성할 수 있습니다.
 * 
 * 이를 '예외 처리'라고 부릅니다.
 * 
 * [예외 처리 방법]
 * try {
 *     예외 발생을 조사할 문장;
 * } catch(예외 클래스 변수명) {
 *     예외가 발생했을 때 실행시킬 코드;
 * } finally {
 *     마지막에 반드시 실행시켜야 하는 코드;
 * }
 * => 예외 발생시 던져진(throw) 예외의 종류와 catch 블록 안의
 *    예외가 일치할 경우, catch 블록 안의 코드가 실행됩니다. 
 */
public class ExceptionSample02 {

	public static void main(String[] args) {
		// 예외 처리 실습 예제
		
		// 여기에서부터 예외 발생을 조사합니다.
		try {
			int[] test;
			test = new int[5];
			
			System.out.println("test[10]에 값을 대입합니다.");
		
			test[10] = 80; // 예외가 발생합니다.(=> 코드의 실행을 중단하고 catch 블록으로 넘어갑니다.)
			
			System.out.println("test[10]dp 80을 대입했습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			// 예외 발생시 * 프로그램이 종료되지 않고 *, 'catch' 블록 안의 코드가 실행됩니다.
			System.out.println("배열 길이를 넘어섰습니다.");
		} finally {
			// 예외의 발생 유무에 관계없이 마지막에 실행됩니다.
			System.out.println("반드시 실행되는 코드입니다.");
		}
		
		System.out.println("무사히 종료했습니다.");

	}

}
