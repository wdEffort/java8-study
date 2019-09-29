package com.ezen.example;

/**
 * 클래스(Class)
 * 객체지향언어의 시작
 * 객체지향프로그래밍(Object Oriented Programming, OOP)
 *
 * @author yoman
 * 
 * 2019. 09. 28
 * 
 * Java 프로그램을 만들 때 반드시 클래스를 사용해야 합니다.
 * 즉, Java 코드에는 반드시 하나 이상의 클래스가 존재해야 합니다.
 * 
 * 클래스를 다룰 때는 보통 현실 세계에 존재하는 사물에 빗대어 표현합니다.
 * (예를 들어 사물이 어떠한 특징을 가지고 있는지, 어떠한 기능이 있는지...)
 * 
 * 클래스의 선언 방법
 * class 클래스명 {
 *     필드(변수); // 상태 및 특성을 표현하기 위한 수단
 *     메소드; // 기능을 표현하기 위한 수단
 * }
 */
class Test {
	// 필드 선언 방법
	// 형명 필드명; => 변수 선언 방식과 동일합니다.
	int a;
	boolean b;
	char c;
	double d;

	// 메소드 선언 방법
	// 리턴 값의 형 메소드명(인수 목록){}
	void sampleMethod1() {

	}

	int sampleMethod2(int q) {
		return 0;
	}

	double sampleMethod3(int x, double y) {
		return 0.0;
	}

}

class TestSample {

	public static void main(String[] args) {

	}

}
