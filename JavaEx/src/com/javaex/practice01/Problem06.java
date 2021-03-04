package com.javaex.practice01;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		//	입력 -> 홀수 1부터, 짝수 2부터 2간격으로 for
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int num = scanner.nextInt();
		
		int startNum = (num % 2 == 0) ? 2:1;
		int sum = 0;
		
		for (int i = startNum; i <= num; i += 2) {
			sum += i;
		}
		
		System.out.println("결과:" + sum);
		scanner.close();
	}

}
