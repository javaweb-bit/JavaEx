package com.javaex.api.objectclass.v3;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 10);
		Point p2 = p;	//	참조 복사 -> 주소만 복사 : 동일 객체
		
		System.out.println("p => " + p);
		System.out.println("p2 => " + p2);
		
		p2.setX(20);
		p2.setY(30);
		
		System.out.println("p => " + p);
		
		Point p3 = new Point(10, 10);
		Point p4 = p3.getClone();
		
		System.out.println("p3 => " + p3);
		System.out.println("p4 => " + p4);
		
		p4.setX(20);
		p4.setY(30);
		
		System.out.println("p3 => " + p3);
		System.out.println("p4 => " + p4);
	}
}
