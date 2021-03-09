package com.javaex.exceptions;

public class CustomArithmeticException extends ArithmeticException {
	//	필드
	private int num1;
	private int num2;
	
	//	생성자
	public CustomArithmeticException(String message, int num1, int num2) {
		//	부모 생성자 호출
		super(message);
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}
}
