package com.ezen.example;

/**
 * 추상 클래스(Abstract class)
 * 추상 클래스란?
 * 
 * @author yoman
 * 
 * 2019. 10. 06
 *
 * Java에서는 추상 클래스라는 것이 존재합니다.
 * 추상 클래스를 선언할 때에는 'abstract' 접근 제한자가 붙습니다.
 * 
 * 특징
 * 1. 객체를 생성할 수 없음
 * 2. 몸체가 없는 메소드를 가짐(=> 추상 메소드)
 *
 * [추상 클래스의 선언]
 * abstract class 클래스명 {
 *    필드 선언;
 *    abstract 리턴형 메소드명(인수 목록);
 * }
 * 
 */
abstract class Vehicle01 {
	protected int speed;
	
	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("속도를 " + speed + "로 변경했습니다.");
	}
	
	// 추상 메소드에는 몸체(실행 구문)가 없습니다.
	abstract void show();
}

class AbstractSample01 {

	public static void main(String[] args) {
		Vehicle01 vc;
		// 추상 클래스로는 객체를 생성할 수 없습니다.
		// vc = new Vehicle01(); // ERROR 

	}

}
