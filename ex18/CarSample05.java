package com.ezen.example;

/**
 * Ŭ����(Class)
 * 2�� �̻��� ��ü ����
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * Java���� ��ü�� �󸶵��� ���� �� �ֽ��ϴ�.
 */
class Car05 { // Car05 Ŭ������ �����մϴ�.
	int num;
	double gas;
	
}

class CarSample05 {

	public static void main(String[] args) {
		// ù ��° �ڵ����� 'audi'�� �����մϴ�. (��ü1)
		Car05 audi = new Car05();
		audi.num = 5678;
		audi.gas = 30.5;
		
		// �� ��° �ڵ����� 'bmw'�� �����մϴ�. (��ü2)
		Car05 bmw = new Car05();
		bmw.num = 1234;
		bmw.gas = 28.7;
		
		// �̷��� �� ���� �ڵ����� ���� �ڽ��� ���� ��ȣ�� ������ ���� ������ �˴ϴ�.
		// ��ü�� ���� �� ���� �� �����Ƿ� ���� ���� �ڵ����� �����ϴ� ���α׷��� �ۼ��� �� �ְ� �Ǿ����ϴ�.

	}

}
