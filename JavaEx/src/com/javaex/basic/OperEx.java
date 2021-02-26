package com.javaex.basic;

public class OperEx {

	public static void main(String[] args) {
//		arithOperEx();
//		logicalOperEx();
//		bitOperEx();
//		bitShiftEx();
		conditionalOperEx();

	}
	
	//	3항 연산자
	private static void conditionalOperEx() {
		int a = 10;
		
		//	만약, a가 짝수면 "짝수", 홀수면 "홀수"
		String result = a % 2 == 0 ? "짝수": "홀수";
		System.out.println(a + "는 짝수? " + result);
		
		int score = 40;
		
		//	만약 score >= 80 Good
		//	80 > score > 50 : Pass
		//	나머지 : Fail
		
		String message = score >= 80 ? "Good": score > 50 ? "Pass": "Fail";
		System.out.println("Score:" + score + ", Result:" + message);
	}
	
	//	비트 시프트 연산자 
	//	비트단위로 이동: <<, >>
	private static void bitShiftEx() {
		int val = 1;
		
		//	좌측 shift
		System.out.println(val);
		System.out.println(Integer.toBinaryString(val << 1));	//	왼쪽으로 1비트 이동
		System.out.println(Integer.toBinaryString(val << 2));	//	왼쪽으로 2비트 이동
		
		val = 0b1000;
		
		//	우측 shift
		System.out.println(Integer.toBinaryString(val));
		System.out.println(Integer.toBinaryString(val >> 1));	//	우측으로 1비트 이동
		System.out.println(Integer.toBinaryString(val >> 2));	//	우측으로 2비트 이동
	}
	
	//	비트 연산자 (&, |, ~)
	//	int 에만 적용, 비트 단위의 미세한 조정에 사용
	private static void bitOperEx() {
		int b1 = 0b1101;
		int b2 = 0b0111;
		
		System.out.println(Integer.toBinaryString(b1));
		System.out.println(Integer.toBinaryString(b2));
		
		int result = b1 & b2;	//	비트 논리곱
		System.out.println(Integer.toBinaryString(result));
		result = b1 | b2;	//	비트 논리합
		System.out.println(Integer.toBinaryString(result));
		result = ~b1; 	//	비트 논리부정
		System.out.println(Integer.toBinaryString(result));
	}
	
	//	비교, 논리연산자 -> 결과 boolean
	private static void logicalOperEx() {
		//	비교연산자 ==, !=, >, >=, <, <=
		int a = 7;
		int b = 3;
		
		System.out.println("a > b ? " + (a > b));
		System.out.println("a equals b ? " + (a == b));	//	==
		System.out.println("a not equals b ? " + (a != b));	//	!= 같지 않다
		
		//	논리연산: AND(논리곱: &&), OR(논리합: ||), NOT(논리 부정: !)
		//	집합론
		int val = 5;
		
		//	val이 0초과, 10미만의 영역에 있는가?
		//	조건 1: val > 0
		//	조건 2: val < 10
		//	조건 1 and 조건 2
		boolean r1 = val > 0;
		boolean r2 = val < 10;
		boolean r1andr2 = r1 && r2; //	= val > 0 && val < 10
		System.out.println("r1 && r2 = " + r1andr2);
		
		//	val이 0이하, 10이상의 영역에 있는가?
		//	조건 1: val <= 0
		//	조건 2: val >= 0
		//	조건 1 or 조건 2
		r1 = val <= 0;
		r2 = val >= 10;
		boolean r1orr2 = r1 || r2;	//	= val <=0 || val >= 10
		System.out.println("r1 || r2 = " + r1orr2);
		
		//	val이 0이하, 10이상의 영역에 있는가? -> 논리값을 뒤집는다
		boolean rNot = !r1orr2;	//	!(val <= 0 || val >= 10)
		System.out.println("r1orr2 논리의 부정:" + rNot);
	}
	
	//	산술 연산자
	private static void arithOperEx() {
		int a = 7;
		int b = 3;
		
		//	부호 연산자: +, -
		System.out.println(-a);
		System.out.println(-1 * a);
		
		//	산술연산자 : +, -, *, /, %(나머지)
		System.out.println(a / b);	//	int / int -> int : 나눗셈의 몫
		System.out.println(a % b);	//	나눗셈의 나머지
		
		//	int 7 / int 3 -> 실제 연산결과 
		System.out.println((float)a / (float)b);	//	7.0 / 3.0
		//	두 피연산자를 산술연산 -> 타입을 큰쪽으로 맞춘다
		System.out.println((float)a / b);	//	7.0 / 3.0(자동 변환)
		
		//	증감연산(++, --)
		//	복잡한 연산식 내에 포함하지 말고 단순 증감 용도로만 사용
		int c = 10;
		System.out.println("후위증감");
		System.out.println(c);
		System.out.println(c++);	//	사용한 후, 증가 일어남
		System.out.println(c);
		System.out.println("전위증감");
		
		c = 10;
		System.out.println(c);
		System.out.println(++c);
		System.out.println(c);
		
		//	나눗셈 보충
		int d = 10;
//		int e = 0;
		
//		System.out.println(d / 0);	//	Arithmetic Exception
		//	Infinity, NaN
		System.out.println((float)d / 0);	//	10.0 / 0 -> Infinity
		
		//	연산 결과가 유한수인지 확인
		System.out.println("10.0 / 0은 유한수?" + Double.isFinite((float)d / 0));
		
		System.out.println(0.0 / 0.0);	//	NaN (Not a Number)
		System.out.println("0.0 / 0.0 is Nan? " + Double.isNaN(0.0 / 0.0));
		
		//	Infinity가 포함된 산술 계산식 -> Infinity
		System.out.println(10.0 / 0 + 10);
		//	NaN가 포함된 산술 계산식 -> 계산 안됨(NaN)
		System.out.println(0.0 / 0.0 + 10);
		
		//	할당 연산자
//		a = a + b;
		a += b;
		
	}

}
