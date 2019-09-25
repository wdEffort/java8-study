package com.ezen.example;

/**
 * 조건, 반복의 중첩
 * 
 * @author yoman
 * 
 * 2019. 09. 25
 * 
 * if 문 등과 조합하여 반복문을 사용할 수 있습니다.
 */
public class LoopSample09 {

	public static void main(String[] args) {
		// if 문과 반복문의 중첩 예제
		
		// 참(True), 거짓(False)의 값을 가지고 있는 변수 b1을 선언하고 거짓(False)로 초기화합니다.
		boolean b1 = false;
		
		// 바깥 반복문이 한번 실행 되면 안쪽 반복문은 다섯번 실행됩니다.
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (b1 == false) { // b1의 값이 거짓(Flase)인 경우 실행됩니다.
					System.out.print("*");
					b1 = true;
				} else { // b1의 값이 참(True)인 경우 실행됩니다.
					System.out.print("-");
					b1 = false;
				}
			}
			System.out.println("\n");
		}

	}

}
