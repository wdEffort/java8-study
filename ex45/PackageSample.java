package com.ezen.example;

/**
 * 패키지(Package)
 * 클래스를 패키지에 포함시키기
 * 
 * @author yoman
 * 
 * 2019. 10. 07
 * 
 * 대규모 프로그램을 작성할 때에는 
 * 때때로 클래스 이름이 충돌하는 경우가 발생합니다.
 * 
 * 이러할 때 Java에서는 패키지를 사용하여 
 * 클래스 이름을 구분하고 충돌하는 것을 방지합니다.
 * 
 * [클래스를 패키지에 포함시키는 방법]
 * package 패키지명;
 * 
 * class 클래스명 { ... }
 * 
 * 아래 예제에서 Car 클래스와 PackageSample01 클래스는
 * 모두 com.ezen.example 패키지에 포함됩니다.
 * 
 * 같은 패키지에 포함된 클래스들은 
 * 패키지를 특별히 의식하지 않고 서로를 사용할 수 있습니다.
 */
class Car {
	private int num;
	private double gas;
	
	public Car() {
		this.num = 0;
		this.gas = 0.0;
	}
	
	public void setCar(int num, double gas) {
		this.num = num;
		this.gas = gas;
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료의 양은" + gas + "입니다.");
	}
}

class PackageSample {

	public static void main(String[] args) {
		Car car = new Car();
		car.show();

	}

}
