package com.ezen.example;

/**
 * 일곱 번째 연습문제 - 02
 * 
 * @author yoman
 * 
 * 2019. 09. 30
 * 
 * 정수값 좌표를 표현하는 MyPoint 클래스를 작성하세요.
 * 단, 좌표축의 범위는 0 ~ 100 사이가 되어야 합니다.
 */
class MyPoint {
	private int x;
	private int y;

	// 기본 생성자를 정의합니다.
	public MyPoint() {
		this.x = 0;
		this.y = 0;
		System.out.println("초기 좌표가 (0, 0)으로 설정되었습니다.");
	}

	// 2개의 인수를 가지는 생성자를 정의합니다.
	public MyPoint(int x, int y) {
		// 2개의 인수를 가지는 생성자 호출 시 처음 기본 생성자가 실행됩니다.
		this();	
		if ((x >= 0 && x <= 100) && (y >= 0 && y <= 100)) {
			this.x = x;
			this.y = y;
			System.out.println("x좌표가 " + x + "으로, y좌표가 " + y + "으로 바뀌었습니다.");
		} else {
			System.out.println("좌표값은 0 ~ 100 사이 값을 입력해주세요.");
		}
		
	}

	// 정수값 x좌표를 저장하는 메소드
	public void setX(int x) {
		if (x >= 0 && x <= 100) {
			this.x = x;
			System.out.println("x좌표가 " + x + "으로 변경되었습니다.");
		} else {
			System.out.println("x 좌표의 값은 0 ~ 100 사이 값을 입력해주세요");
		}
		
	}

	// 정수값 y좌표를 저장하는 메소드
	public void setY(int y) {
		if (y >= 0 && y <= 100) {
			this.y = y;
			System.out.println("y좌표가 " + y + "으로 변경되었습니다.");
		} else {
			System.out.println("y 좌표의 값은 0 ~ 100 사이 값을 입력해주세요");
		}
	}

	// x좌표를 취득하는 메소드
	public int getX() {
		return this.x;
	}

	// y좌표를 취득하는 메소드
	public int getY() {
		return this.y;
	}

}

class Practice02 {

	public static void main(String[] args) {
		// 2개의 인수 목록을 가지는 생성자를 호출하여 객체를 생성합니다.
		MyPoint myPoint = new MyPoint(101, 20);

		
		// 좌표를 변경해봅니다.
		// MyPoint 클래스의 필드가 private로 설정되어 있으므로
		// 접근 가능한 메소드를 이용하여 필드에 값을 대입합니다.
		myPoint.setX(30);
		myPoint.setY(1000);
		
		// MyPoint 클래스의 필드에 바로 접근할 수 없으므로
		// 접근 가능한 메소드를 이용하여 필드의 값을 출력시킵니다.
		System.out.println("입력하신 x 좌표는 " + myPoint.getX() + "입니다.");
		System.out.println("입력하신 y 좌표는 " + myPoint.getY() + "입니다.");
	}

}
