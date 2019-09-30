package com.ezen.example;

/**
 * 클래스 라이브러리
 * Math 클래스
 * 
 * @author yoman
 * 
 * 2019. 10. 01
 * 
 * Java에서는 수학적인 계산 기능을 구현한
 * Math 클래스가 있습니다.
 * 
 * 주요 '클래스 메소드'
 * 1. abs(double d) : 실수형 인수의 절대값 반환(double)
 * 2. abs(int i) : 정수형 인수의 절대값 반환(int)
 * 3. ceil(double d) : 실수형 인수의 올림 값을 반환(double)
 * 4. cos(double a) : 실수형 인수의 코사인 값을 반환(double)
 * 5. floor(doulbe d) : 실수형 인수의 내림값을 반환(double)
 * 6. max(double a, double b) : 2개의 실수형 인수중 큰 값을 반환(double)
 * 7. max(int a, int b) : 2개의 정수형 인수중 큰 값을 반환(int)
 * 8. min(double a, double b) : 2개의 실수형 인수중 작은 값을 반환(double)
 * 9. pow(double a, double b) : 첫 번째 인수를 두 번째 인수로  거듭 제곱한 결과를 반환(double)
 * 10. random() : 0.0 ~ 1.0 미만의 난수를 반환(double)
 * 11. rint(double d) : 실수형 인수에 가장 가까운 정수값을 반환(double)
 * 12. sin(double d) : 인수의 사인값을 반환(double)
 * 13. sqrt(double d) : 실수형 인수의 제곱근을 반환(double)
 * 14. tan(double d) : 실수형 인수의 탄젠트 값을 반환(double)
 */
public class MathSample01 {

	public static void main(String[] args) {
		// Math 클래스 주요 메소드 사용예제
		System.out.println("-1.2의 절대값은 " + Math.abs(-1.2) + "입니다.");
		System.out.println("1.4를 올림하면 " + Math.ceil(1.4) + "입니다.");
		System.out.println("-1.9를 올림하면 " + Math.ceil(-1.9) + "입니다.");
		System.out.println("2.5을 내림하면 " + Math.floor(2.5) + "입니다.");
		System.out.println("1과 2중 큰 값은 " + Math.max(1, 2) + "입니다.");
		System.out.println("-1.3과 -2.8중 작은 값은" + Math.min(-1.3, -2.8) + "입니다.");
		System.out.println("3의 3의 제곱값은 " + Math.pow(3, 3) + "입니다.");
		System.out.println("1.9에 가장 가까운 정수값은 " + Math.rint(1.9) + "입니다.");
		System.out.println("1024의 제곱근은 " + Math.sqrt(1024) + "입니다.");

		// random() 메소드 사용법
		// 필요한 숫자 값을 구할 때에는, 난수 값에 추가로 덧셈을 하거나 곱셈을 해야 합니다.
		// 아래는 1 ~ 6 사이의 정수값을 구하는 코드입니다. (=> 여러번 실행시켜 보세요.)
		int num = (int) (Math.random() * 6) + 1;
		System.out.println("발생한 난수는 " + num + "입니다.");
	}

}
