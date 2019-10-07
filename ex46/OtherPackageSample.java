package com.ezen.pb;

/**
 * 패키지(Package)
 * 다른 패키지로 나누기
 * 
 * @author yoman
 * 
 * 2019. 10. 07
 * 
 * 다른 파일에 작성된 클래스를
 * 다른 패키지에 포함시키는 것도 가능합니다.
 * 
 * 다른 패키지 안의 클래스를 사용하기 위해서는 두번의 작업이 필요합니다.
 * 1. 사용될 클래스의 이름 앞에 'public' 접근 제한자 붙이기
 * 2. 클래스를 사용할 때 그 클래스의 이름 앞에 패키지 이름 붙이기
 * 
 * public 클래스 : 다른 패키지의 클래스가 사용할 수 있다. (=> 소스 파일 하나에 한 개만 작성 가능)
 * default 클래스 : 같은 패키지에 속한 클래스들만 사용할 수 있다.
 */
class OtherPackageSample {

	public static void main(String[] args) {
		// 다른 패키지 안의 클래스를 사용하기 위해
		// 클래스 이름 앞에 패키지 이름을 붙입니다.
		com.ezen.pa.Car car = new com.ezen.pa.Car();
		car.show();
		
	}

}
