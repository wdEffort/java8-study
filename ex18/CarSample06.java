package com.ezen.example;

/**
 * 클래스(Class)
 * 클래스 파일(.class) 생성 확인
 * 
 * @author yoman
 * 
 * 2019. 09. 29
 * 
 * 하나의 소스파일에 두 개 이상의 클래스가 선언되어 있다면
 * 컴파일할 때 두 개 이상의 클래스 파일이 생성됩니다.
 * 
 * 보통 두 개 이상의 클래스를 선언할 때에는
 * 파일을 분할한 다음 각각의 소스코드를 작성합니다. (=> 추후 Import의 개념에서 배워봅니다.)
 */
class Car06 {
	int num;
	double gas;
	
}

class CarSample06 {

	public static void main(String[] args) {
		// 코드 작성후 컴파일을 시켜보고 Workspace(작업공간)을 확인해 보세요.
		// 예) C:\Ezen\workspace\ex18\bin\com\ezen\example
		Car06 audi = new Car06();
		audi.num = 5678;
		audi.gas = 30.5;
		
		Car06 bmw = new Car06();
		bmw.num = 1234;
		bmw.gas = 28.7;

	}

}
