package com.javaex.practice01;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}
		scanner.close();
	}

}
