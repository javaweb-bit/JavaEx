package com.javaex.basic;

public class ConsoleEx {

	public static void main(String[] args) {
		consoleOutputEx();
	}
	
	
	// 콘솔 출력
	private static void consoleOutputEx() {
		//	표준 출력(stdout) : System.out
		//	표준 에러(stderr) : System.err
		//	메서드 print() -> 출력 후 개행을 하지 않음
		//	메서드 println() -> 출력 후 개행
		//	printf() -> 포맷 출력 -> String 항목에서 정리
		
		System.out.print("Hello ");	//	개행 안함
		System.out.println("Java");	//	개행 함
		System.out.println("New Line");
		
		//	이스케이프 문자
		//	\n(개행), \t(탭), \"(따옴표), \\(역슬래시)
		System.out.println("Hello \nJava");	//	강제 개행
		System.out.println("Hello \t\tJava");	//	탭
		System.out.println("Hello \"Java\"");
		
		String filePath = "D:\\myfolder\\myfile.txt";	//	역슬래시
		System.out.println(filePath);
	}

}
