package com.ezen.example;

/**
 * ���� ��° �������� - 02
 * 
 * @author yoman
 * 
 * 2019. 09. 30
 * 
 * ������ ��ǥ(x, y)�� ��Ÿ���� MyPoint Ŭ������ �ۼ��ϼ���.
 */
class MyPoint {
	int x;
	int y;
	
	// ������ x��ǥ�� �����ϴ� �޼ҵ�
	void setX(int x) {
		this.x = x;
	}
	
	// ������ y��ǥ�� �����ϴ� �޼ҵ�
	void setY(int y) {
		this.y = y;
	}
	
	// x��ǥ�� ����ϴ� �޼ҵ�
	int getX() {
		return this.x;
	}
	
	// y��ǥ�� ����ϴ� �޼ҵ�	
	int getY() {
		return this.y;
	}
}

class Practice02 {

	public static void main(String[] args) {
		MyPoint myPoint = new MyPoint();
		// ��ü�� �ʵ忡 �����Ͽ� ���� �����մϴ�.
		myPoint.x = 10;
		myPoint.y = 20;
		
		// ��ü�� �ʵ忡 �����Ͽ� ���� ����մϴ�
		System.out.println("�Է��Ͻ� x ��ǥ�� " + myPoint.x + "�Դϴ�.");
		System.out.println("�Է��Ͻ� y ��ǥ�� " + myPoint.y + "�Դϴ�.");

	}

}
