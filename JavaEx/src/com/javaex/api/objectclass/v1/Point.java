package com.javaex.api.objectclass.v1;

//	v1. Object 클래스를 살펴보자
//	아무것도 상속받지 않아도 최상위 부모 Object를 상속
//	객체의 출력 포맷을 변경 -> toString()을 오버라이드
public class Point {
	//	필드
	private int x;
	private int y;
	
	//	생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//	 객체 출력 or 문자열과 연결될 때 반환되는 문자열 
	@Override
	public String toString() {
		return String.format("Point(x=%d, y=%d)", x, y);
	}
}
