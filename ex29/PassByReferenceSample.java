package com.ezen.example;

/**
 * Pass By Reference
 * 참조의 전달
 * 
 * Pass By Value
 * 값의 전달
 * 
 * @author yoman
 * 
 * 2019. 10. 01
 * 
 * 기본형은 값이 전달됩니다.
 * 기본형 변수를 인수로 전달하게 되면 '가인수'와 '실인수'는 각각 다른 것이 됩니다.
 * 기본형 값이 복사되어 전달되기 때문입니다.
 * 
 * 
 * 객체는 참조가 전달됩니다.
 * 클래스형 변수를 인수로 전달하게 되면 '가인수'와 '실인수'는 같은 객체를 가리키게 됩니다.
 */
class Car {
	private int num;
	private double gas;
	private String name;
	
	public Car() {
		num = 0;
		gas = 0.0;
		name = "무명";
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
	}
	
	public void setName(String nm) {
		name = nm;
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은 " + gas + "입니다.");
		System.out.println("아름은 " + name + "입니다.");
	}
}

class PassByReferenceSample {

	public static void main(String[] args) {
		Car c = new Car();
		
		int number = 1234;
		double gasoline = 30.5;
		String str = "1호차";
		
		c.setCar(number, gasoline); // 값의 전달
		c.setName(str); // 참조의 전달
		c.show();
		
	}

}
