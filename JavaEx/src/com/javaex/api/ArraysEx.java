package com.javaex.api;

import java.util.Arrays;

//	배열을 조작하는데 도움을 주는 클래스
public class ArraysEx {

	public static void main(String[] args) {
		arrayCopyEx();
	}
	
	//	배열 복사
	private static void arrayCopyEx() {
		//	회고
		char[] src = "Java Programming".toCharArray();
		System.out.println("원본: " + Arrays.toString(src));
	
		//	System을 이용한 복사
		char target[] = new char[src.length];
		System.arraycopy(src, //	원본배열의
				0, //	시작 인덱스
				target, //	타겟 배열
				0, //	복사 시작 위치
				src.length);	//	복사할 길이
		System.out.println("System을 이용한 배열 복사:" + Arrays.toString(target));
		
		//	Arrays 클래스를 이용한 배열의 복제 
		target = Arrays.copyOf(src, src.length);	//	src 배열을 길이만큼 복제
		System.out.println("copyOf: " + Arrays.toString(target));
		
		//	배열의 일부 복제 
		target = Arrays.copyOfRange(src, 
				5,	//	복사 시작 인덱스 
				12);	//	복사 끝 인덱스
		System.out.println("copyOfRange:" + Arrays.toString(target));
	}

}
