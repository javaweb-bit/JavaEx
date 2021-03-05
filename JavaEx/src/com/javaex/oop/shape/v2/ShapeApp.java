package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s = new Shape(10, 20);	//	추상클래스는 직접 객체화할 수 없다(중요) 
		Rectangle r = new Rectangle(10, 10, 100, 50);
		Circle c = new Circle(30, 40, 10);
		Point p = new Point(10, 20);
		String s = "Triangle";
		
		drawTest(r);
		drawTest(c);
		drawTest(p);
		drawTest(s);
	}
	
	private static void drawTest(Object obj) {
		//	obj -> Drawable 인터페이스 내부에 draw();
		//	참조 타입이 인터페이스여도 Casting 가능
		if (obj instanceof Drawable) {	//	Drawable 인터페이스를 구현한 객체인가?
			((Drawable)obj).draw();
		} else {
			System.out.println("그리기 객체가 아닙니다.");
		}
	}

}
