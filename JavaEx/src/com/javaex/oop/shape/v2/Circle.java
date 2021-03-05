package com.javaex.oop.shape.v2;

public class Circle extends Shape implements Drawable {
	//	필드
	private double radius;
	
	//	생성자
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

//	추상 클래스를 상속받은 자식 클래스는 반드시 부모의
	//	추상 메서드를 구현해야 한다
	@Override
	public void draw() {
		System.out.printf(
				"원[x=%d, y=%d, r=%f, area=%f]을 그렸습니다.%n",
				x, y, radius, area());
	}

	@Override
	public double area() {
//		double area = Math.PI * Math.pow(radius, 2);
//		return area;
		return Math.PI * Math.pow(radius, 2);
	}
	
	
	
}
