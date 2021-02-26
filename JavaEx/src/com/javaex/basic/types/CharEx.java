package com.javaex.basic.types;

//	char(2)
//	유니코드 캐릭터 1글자
public class CharEx {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = '한';
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1 + c2);
		
		String str = "A한";	//	String은 char의 연결된 자료 구조
		System.out.println(str);
	}

}
