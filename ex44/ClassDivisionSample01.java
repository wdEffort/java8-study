package com.ezen.example;

/**
 * 파일 분할 - Sample01
 * 
 * @author yoman
 * 
 * 2019. 10. 07
 * 
 * 수많은 클래스를 다루어야 하는 큰 프로그램을
 * 작성한다면 파일을 분할하는 작업이 필수적입니다.
 */
public class ClassDivisionSample01 {

	public static void main(String[] args) {
		// Car01 클래스를 다른 파일에 작성하여 사용하고 있습니다.
		Car01 car = new Car01();
		car.show();

	}

}
