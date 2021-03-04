package com.javaex.oop.staticmember;

//	미션:
//		어떤 상황에서도 단 하나의 인스턴스만 유지
//		생성자 -> 접근 금지
public class Singleton {
	//	static 영역에 단 하나의 인스턴스객체를 담아둔다
	private static Singleton instance = new Singleton();
	
	//	생성자
	private Singleton() {
		//	new 호출 불가
	}

	public static Singleton getInstance() {
		return instance;
	}
}
