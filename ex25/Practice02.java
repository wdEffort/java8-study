package com.ezen.example;

/**
 * �ϰ� ��° �������� - 02
 * 
 * @author yoman
 * 
 * 2019. 09. 30
 * 
 * ������ ��ǥ�� ǥ���ϴ� MyPoint Ŭ������ �ۼ��ϼ���.
 * ��, ��ǥ���� ������ 0 ~ 100 ���̰� �Ǿ�� �մϴ�.
 */
class MyPoint {
	private int x;
	private int y;

	// �⺻ �����ڸ� �����մϴ�.
	public MyPoint() {
		this.x = 0;
		this.y = 0;
		System.out.println("�ʱ� ��ǥ�� (0, 0)���� �����Ǿ����ϴ�.");
	}

	// 2���� �μ��� ������ �����ڸ� �����մϴ�.
	public MyPoint(int x, int y) {
		// 2���� �μ��� ������ ������ ȣ�� �� ó�� �⺻ �����ڰ� ����˴ϴ�.
		this();	
		if ((x >= 0 && x <= 100) && (y >= 0 && y <= 100)) {
			this.x = x;
			this.y = y;
			System.out.println("x��ǥ�� " + x + "����, y��ǥ�� " + y + "���� �ٲ�����ϴ�.");
		} else {
			System.out.println("��ǥ���� 0 ~ 100 ���� ���� �Է����ּ���.");
		}
		
	}

	// ������ x��ǥ�� �����ϴ� �޼ҵ�
	public void setX(int x) {
		if (x >= 0 && x <= 100) {
			this.x = x;
			System.out.println("x��ǥ�� " + x + "���� ����Ǿ����ϴ�.");
		} else {
			System.out.println("x ��ǥ�� ���� 0 ~ 100 ���� ���� �Է����ּ���");
		}
		
	}

	// ������ y��ǥ�� �����ϴ� �޼ҵ�
	public void setY(int y) {
		if (y >= 0 && y <= 100) {
			this.y = y;
			System.out.println("y��ǥ�� " + y + "���� ����Ǿ����ϴ�.");
		} else {
			System.out.println("y ��ǥ�� ���� 0 ~ 100 ���� ���� �Է����ּ���");
		}
	}

	// x��ǥ�� ����ϴ� �޼ҵ�
	public int getX() {
		return this.x;
	}

	// y��ǥ�� ����ϴ� �޼ҵ�
	public int getY() {
		return this.y;
	}

}

class Practice02 {

	public static void main(String[] args) {
		// 2���� �μ� ����� ������ �����ڸ� ȣ���Ͽ� ��ü�� �����մϴ�.
		MyPoint myPoint = new MyPoint(101, 20);

		
		// ��ǥ�� �����غ��ϴ�.
		// MyPoint Ŭ������ �ʵ尡 private�� �����Ǿ� �����Ƿ�
		// ���� ������ �޼ҵ带 �̿��Ͽ� �ʵ忡 ���� �����մϴ�.
		myPoint.setX(30);
		myPoint.setY(1000);
		
		// MyPoint Ŭ������ �ʵ忡 �ٷ� ������ �� �����Ƿ�
		// ���� ������ �޼ҵ带 �̿��Ͽ� �ʵ��� ���� ��½�ŵ�ϴ�.
		System.out.println("�Է��Ͻ� x ��ǥ�� " + myPoint.getX() + "�Դϴ�.");
		System.out.println("�Է��Ͻ� y ��ǥ�� " + myPoint.getY() + "�Դϴ�.");
	}

}
