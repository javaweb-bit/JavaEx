package com.javaex.basic.types;

//	상수: 변하지 않는 수
//	선언, 초기화, 조회는 가능, 변경 불가
public class ConstantEx {
	static final int SPEED_LIMIT = 120;	//	상수
	
	public static void main(String[] args) {
//		final int SPEED_LIMIT = 120;	//	final -> 할당 이후에 변경 불가
		//	상수 사용 이유
		//	코드의 가독성 높인다
		//	변경 불가 -> 코드의 안정성 확보
		int speed = 120;
		
		boolean b1 = speed > SPEED_LIMIT;
		
		System.out.println("제한속도를 초과하였습니까?" + b1);
		
		System.out.println("제한속도는" + SPEED_LIMIT + "입니다");
		
//		SPEED_LIMIT = 100;	//	상수 변경 불가
		
		
	}

}
