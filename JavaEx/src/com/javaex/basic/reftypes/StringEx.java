package com.javaex.basic.reftypes;

public class StringEx {

	public static void main(String[] args) {
//		stringTest();
		stringFormatEx();
	}
	
	private static void stringFormatEx() {
		//	%s(문자열), %d(10진 정수), %n(개행)
		//	__개의 __ 중에 __개를 먹었다
		String fruit = "사과";
		int total = 10;
		int eat = 3;
		
		System.out.println(total + "개의 " + fruit + "중에서 " + eat + "개를 먹었다");
		
		//	-> formatting
		String fmt = "%d개의 %s중에서 %d개를 먹었다%n";	//	템플릿을 미리 만들어두고
		System.out.printf(fmt, total, fruit, eat);
		System.out.printf(fmt, 5, "오렌지", 2);
		
		//	%f(실수), %%(%)
		//	현재 이자율은 1.25%입니다.
		System.out.printf("현재 이자율은 %f입니다.%n", 1.25f);
		fmt = "현재 이자율은 %.2f%%입니다.%n";	// %.2f -> 소숫점 2째 자리까지 표기(부가정보)
		System.out.printf(fmt, 1.25f);
	}
	
	private static void stringTest() {
		//	문자열 선언
		String str;	//	선언
		str = "Java";	//	초기화 - Literal
		System.out.println("str:" + str);
		String str2 = "Java";	// Literal
		System.out.println("str2:" + str2);
		String str3 = new String("Java"); //	새 객체 생성
		System.out.println("str3:" + str3);
		
		//	세 변수는 모두 Java라는 문자열을 담고 있다
		System.out.println("str == str2 ? " + (str == str2));	//	같은 주소임
		System.out.println("str == str3 ? " + (str == str3));	//	다른 주소임
		
		//	참조 타입의 ==, != -> 두 객체의 주소 비교
		//	값의 비교 .equals() 메서드를 사용
		System.out.println("str과 str2 내용이 같은가? " + str.equals(str2));
		System.out.println("str과 str3 내용이 같은가? " + str.equals(str3));
		
		//	String은 API 항목에서 정리
	}

}
