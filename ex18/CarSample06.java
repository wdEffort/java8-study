package com.ezen.example;

/**
 * Ŭ����(Class)
 * Ŭ���� ����(.class) ���� Ȯ��
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * �ϳ��� �ҽ����Ͽ� �� �� �̻��� Ŭ������ ����Ǿ� �ִٸ�
 * �������� �� �� �� �̻��� Ŭ���� ������ �����˴ϴ�.
 * 
 * ���� �� �� �̻��� Ŭ������ ������ ������
 * ������ ������ ���� ������ �ҽ��ڵ带 �ۼ��մϴ�. (=> ���� Import�� ���信�� ������ϴ�.)
 */
class Car06 {
	int num;
	double gas;
	
}

class CarSample06 {

	public static void main(String[] args) {
		// �ڵ� �ۼ��� �������� ���Ѻ��� Workspace(�۾�����)�� Ȯ���� ������.
		// ��) C:\Ezen\workspace\ex18\bin\com\ezen\example
		Car06 audi = new Car06();
		audi.num = 5678;
		audi.gas = 30.5;
		
		Car06 bmw = new Car06();
		bmw.num = 1234;
		bmw.gas = 28.7;

	}

}
