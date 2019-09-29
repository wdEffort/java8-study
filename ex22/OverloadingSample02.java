package com.ezen.example;

/**
 * 메소드의 오버로딩(Overloading)주의할 점
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * 만약, 인수의 형(type)과 개수가 동일하며
 * 리턴 값만 다른 두 개의 메소드가 오버로딩 된다면 어떻게 될까요?
 * 
 * => 메소드 호출시 둘 중 어느 메소드를 호출해야 할지 판단할 수 없으므로
 *    ERROR가 발생합니다.
 */
class Car02 {
	int num;
	double gas;
	
	// 리턴값이 정수형인 setCar() 메소드를 정의합니다.
	public int setCar(int n) {
		num = n;
		System.out.println("차량 번호를 " + num + "으로 바꾸었습니다.");
		
		return n;
	}

	// 리턴값이 없는 setCar() 메소드를 정의합니다.(실행 시 주석을 제거해주세요.)
	/*public void setCar(int n) {
		num = n;
		System.out.println("차량 번호를 " + num + "으로 바꾸었습니다.");
	}*/
	
}

public class OverloadingSample02 {

	public static void main(String[] args) {
		Car02 c = new Car02();
		
		// 리턴값이 정수형인 setCar()를 호출해야하는건가?
		// 리턴값이 없는 setCar()를 호출해야 하는건가?
		c.setCar(1234);

	}

}
