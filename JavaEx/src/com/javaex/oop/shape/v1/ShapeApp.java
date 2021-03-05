package com.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s = new Shape(10, 20);	//	추상클래스는 직접 객체화할 수 없다(중요) 
		Rectangle r = new Rectangle(10, 10, 100, 50);
		r.draw();
		
		Circle c = new Circle(30, 40, 10);
		c.draw();
	}

}
