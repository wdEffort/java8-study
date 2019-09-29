package com.ezen.example;

/**
 * 메소드에 대해 더 알아봅니다.
 * 리턴(return) 값
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * Java에서는 메소드를 호출한 곳에 정보를 돌려주도록
 * 지시할 수 있는 기능이 있습니다.
 * 이때 메소드가 반환하는 정보를 리턴 값(Return value)라고 부릅니다.
 * 단, 리턴 값은 단 하나만 돌려줄 수 있습니다.
 * 
 * 리턴 값을 돌려줄 때에는 'return 식;' 문장을 사용합니다.
 * 
 * 또한 'return'이라는 키워드는 코드 실행을 종료시킬 때에도 사용됩니다.
 */
class Car03 {
	int num;
	double gas;
		
	// 리턴 값을 가지지 않는 메소드에는 메소드명 앞에 'void'라고 적습니다.
	void setNum(int n) {
		num = n;
		System.out.println("차량 번호를 " + num + "바꾸었습니다.");
	}
	
	void setGas(double g) {
		gas = g;
		System.out.println("연료의 양을 " + gas + "로 바꾸었습니다.");
	}
	
	void setNumGas(int n, double g) {
		num = n;
		gas = g; 
		System.out.println("차량 번호를 " + num + "으로, 연료의 양을 " + gas + "로  바꾸었습니다.");
	}
	
	// 리턴 값이 있는 메소드 정의 방법
	// 리턴 값의 형 메소드명(인수 목록) { ... }
	int getNum() {
		System.out.println("차량 번호를 조사했습니다.");
		return num; // 값이 될 수도있고, 식이 될 수도 있습니다.
	}
	
	double getGas() {
		System.out.println("연료의 양을 조사했습니다.");
		return gas;
	}
	
	void show() {
		System.out.println("차량 번호는 " + this.num + "입니다.");
		System.out.println("연료의 양은 " + this.gas + "입니다.");
	}
	
	void showCar() {
		System.out.println("지금부터 자동차의 정보를 표시합니다.");
		this.show();
	}
}

class CarSample03 {

	public static void main(String[] args) {
		Car03 c = new Car03();
		c.setNumGas(1234, 20.5);
		
		// 리턴 값이 대입될 변수를 선언할 때에는 자료형에 주의해야 합니다.
		int number = c.getNum();
		double gasoline = c.getGas();
		
		System.out.println("샘플 자동차를 조사한 결과");
		System.out.println("차량 번호는 " + number + ", 연료의 양은 " + gasoline + "입니다.");
		
	}

}
