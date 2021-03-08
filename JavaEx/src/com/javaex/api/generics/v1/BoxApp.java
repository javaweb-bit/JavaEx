package com.javaex.api.generics.v1;

public class BoxApp {

	public static void main(String[] args) {
		IntBox intBox = new IntBox();
		intBox.setContent(2021);
		
		//	값을 가져와 봅니다.
		int retVal = intBox.getContent();
		System.out.println("내용물:" + retVal);
		
		StringBox strBox = new StringBox();
		strBox.setContent("Java");
		
		String strVal = strBox.getContent();
		System.out.println("strBox 내용물:" + strVal);
		
		ObjectBox objBox = new ObjectBox();
		objBox.setContent(2021);
		
		ObjectBox objBox2 = new ObjectBox();
		objBox2.setContent("Java");
		
		//	내용물 확인
		//	내부 데이터가 Object여서 Java 컴파일러가 체크가 힘들어진다
		//	데이터를 불러올 때, 캐스팅 필요 -> 불편, 위험
		Integer retVal2 = (Integer)objBox.getContent();

	}

}
