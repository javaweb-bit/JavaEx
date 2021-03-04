package com.javaex.oop.point.v2;

//	v2. 생성자
public class Point {
	//	필드
	private int x;
	private int y;
	
	//	생성자가 하나도 없으면
	//	컴파일러가 기본 생성자를 추가
	//	-> 생성자가 없는 것이 아니다
	public Point() {
		//	기본 생성자 -> 파라미터가 없음
		System.out.println("기본 생성자 호출");
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("사용자 정의 생성자 호출");
	}
	
	//	getter/setter
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//	출력 메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", x, y);
	}
}
