package com.javaex.api.generics.v3;

public class BoxApp {

	public static void main(String[] args) {
		//	Generic으로 설계된 클래스는
		//	new (인스턴스화) 할 때 내부 데이터 타입을 지정할 수 있다
		GenericBox<Integer> intBox = new GenericBox<>();	//	Integer 객체를 내부 데이터의 타입
		GenericBox<String> strBox = new GenericBox<>();		//	내부 데이터를 String
		
		intBox.setContent(2021);	//	컴파일러가 내부에 담길 타입 체크
//		intBox.setContent("Java");	//	컴파일러가 타입 체크를 할 수 있음 -> 안정성 확보
		
		strBox.setContent("Java");
		
		int retVal = intBox.getContent();	//	캐스팅 불필요
		String retStr = strBox.getContent();
		
		System.out.println("intBox 내용물:" + retVal);
		System.out.println("strBox 내용물:" + retStr);
	}

}
