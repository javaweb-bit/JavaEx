package com.javaex.basic;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx01();
//		whileGugu();
//		doWhileEx();
//		infLoop();
//		forGugu();
//		continueEx();
//		breakEx();
//		nestedFor();
//		nestedForStar();
		sixRandom();
	}
	
	private static void sixRandom() {
		//	1 ~ 45 정수난수 6개를 출력
		for (int i = 1; i <= 6; i++) {
//			System.out.println(Math.random());
			System.out.println((int)(Math.random() * 45) + 1);
		}
		//	TODO: While문 버전으로 만들어 보자
	}
	
	private static void nestedForStar() {
		int rowCount = 10;
		
		for (int row = 1; row <= rowCount; row ++) {
			for (int col = 1; col <= row; col ++) {
				System.out.print("*");
			}
			System.out.println();	//	개행
		}
		
		//	TODO: while문 버전으로 만들어보자
	}
	
	private static void nestedFor() {
		//	2단 ~ 9단까지의 구구표를 모두 출력
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단");
			
			//	중첩 loop 
			for (int num = 1; num <= 9; num++) {
				System.out.println(dan + "*" + num + "=" + (dan * num));
			}
		}
		
		//	TODO: while 문으로 작성 
	}
	
	private static void breakEx() {
//		6의 배수이자 14 의 배수인 가장 적은 정수 찾기
		int num = 1;
		
		while(true) {
			if (num % 6 == 0 && num % 14 == 0) break;	//	break문을 만나면 루프를 탈출한다
			num ++;
		}
		
		System.out.println(num);
	}
	private static void continueEx() {
//		1에서 20 까지의 수에서 2 의배수와 3 의배수를 제외한
//		숫자를 출력하세요
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0 || i % 3 == 0) { continue; }
			System.out.println(i);
		}
	}
	
	private static void forGugu() {
		//	입력받은 단의 구구표 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력하세요:");
		int dan = scanner.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
		
		scanner.close();
	}
	
	private static void infLoop() {
		//	while, do - while의 경우, 반복 조건은 개발자가 책임
		//	반복 조건이 true일 경우 무한루프에 빠진다
		//	특별한 경우가 아니라면 무한루프는 피하도록 하자
		while (true) {
			System.out.println("Press Terminate Button");
		}
	}
	
	private static void doWhileEx() {
		//	최소 1회는 반드시 실행되어야 하는 반복문을 작성
//		사용자의
//		숫자를 입력받아 더하는 프로그램을
//		작성하세요 (0 이면 종료)
		int total = 0;	//	합산 결과
		Scanner scanner = new Scanner(System.in);
		int num = 0;	//	사용자 입력 값
		do {
			System.out.print("정수를 입력하세요 [0이면 종료]:");
			num = scanner.nextInt();
			total = total + num;
//			total += num;
		} while(num != 0);	//	num가 0이 아니면 반복
		
		System.out.println("합산값:" + total);
		scanner.close();
	}
	
	private static void whileGugu() {
		//	단을 입력 -> 해당 단의 구구표를 출력
		Scanner scanner = new Scanner(System.in);
		int num = 1;
		System.out.print("단을 입력하세요:");
		int dan = scanner.nextInt();
		
		while(num <= 9) {
			System.out.println(dan + "*" + num + "=" + (dan * num));
			num++;
		}
		
		scanner.close();
	}
	
	//	while 문 
	private static void whileEx01() {
		//	I like java0 ~ java5 출력
		int i = 0;
		
		while(i <= 5) {	//	반복 조건
			System.out.println("I like java" + i);
			//	임의로 반복 조건을 설정
			i++;	//	종료될 수 있는 상황을 개발자가 직접 설정
		}
	}
}
