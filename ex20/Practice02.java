package com.ezen.example;

/**
 * 여섯 번째 연습문제 - 02
 * 
 * @author yoman
 * 
 * 2019. 09. 30
 * 
 * 정수값 좌표(x, y)를 나타내는 MyPoint 클래스를 작성하세요.
 */
class MyPoint {
	int x;
	int y;
	
	// 정수값 x좌표를 저장하는 메소드
	void setX(int x) {
		this.x = x;
	}
	
	// 정수값 y좌표를 저장하는 메소드
	void setY(int y) {
		this.y = y;
	}
	
	// x좌표를 취득하는 메소드
	int getX() {
		return this.x;
	}
	
	// y좌표를 취득하는 메소드	
	int getY() {
		return this.y;
	}
}

class Practice02 {

	public static void main(String[] args) {
		MyPoint myPoint = new MyPoint();
		// 객체의 필드에 접근하여 값을 대입합니다.
		myPoint.x = 10;
		myPoint.y = 20;
		
		// 객체의 필드에 접근하여 값을 출력합니다
		System.out.println("입력하신 x 좌표는 " + myPoint.x + "입니다.");
		System.out.println("입력하신 y 좌표는 " + myPoint.y + "입니다.");

	}

}
