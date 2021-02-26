package com.javaex.basic.types;

//	byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
public class CastingEx {

	public static void main(String[] args) {
//		implicitCastingEx();
		explicitCastingEx();

	}
	
	//	명시적 캐스팅
	//	표현 범위가 넓은 자료형 -> 좁은 자료형 : 데이터의 유실 가능성
	//	개발자가 명시적으로 타입을 변환
	private static void explicitCastingEx() {
		double d = 1234.567;	//	8바이트 실수형
		System.out.println(d);
		
		float f = (float)d;	//	4바이트 실수형
		System.out.println(f);
		
		long l = (long)f;	//	8바이트 정수형
		System.out.println(l);
		System.out.println(Long.toBinaryString(l));
		
		byte b = (byte)l;
		System.out.println(b);
		
		
	}
	
	//	암묵적 캐스팅 (implicit casting: promption)
	//	표현 범위가 좁은 자료형 -> 넓을 자료형 : 자바 자동 변환
	private static void implicitCastingEx() {
		byte b = 25;	//	1바이트 정수
		System.out.println(b);
		
		short s = b;	//	2바이트 정수
		System.out.println(s);
		
		int i = s;	//	4바이트 정수
		System.out.println(i);
		
		long l = i;	//	8바이트 정수
		System.out.println(l);
		
		float f = l;	//	long이 float보다 바이트 수는 크지만 표현 범위가 좁다
		System.out.println(f);
		
		double d = f;
		System.out.println(d);
		
	}
}
