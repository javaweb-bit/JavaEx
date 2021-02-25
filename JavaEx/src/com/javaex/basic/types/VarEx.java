package com.javaex.basic.types;

//	변수 연습
public class VarEx {
	public static void main(String[] args) {
		//	변수 식별자 규정
		//	문자, 숫자, $, _의 조합으로 생성
		//	숫자로 시작하면 안됨
		//	예약어는 사용할 수 없다
		
		//	자바 변수, 메서드명 관례:
		//		소문자로 작성, 단어의 조합일 경우, 뒷 단어의 첫글자는 대문자(camelCase)
		
		/*
		int myAge;	//	선언 int 타입 데이터를 담을 공간을 할당
		myAge = 48;	//	초기화, 할당
		*/
		
		int myAge = 48;	// 선언과 초기화를 동시
		
		//	java는 정적 타입 언어
		//	한번 선언되면 타입을 변경할 수 없다
//		myAge = "문자열";
		
		System.out.println("내 나이는: " + myAge);		//	조회
		
		//	한 번에 여려 변수를 선언할 때
		int v1 = 10, v2 = 20, v3 = 30;
		
		//	여러 변수에 동시에 같은 값을 할당할 때
		v1 = v2 = v3 = 40;
	}
}
