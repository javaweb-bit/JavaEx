package com.javaex.practice01;

public class Problem03 {

	public static void main(String[] args) {
		for (int num = 1; num <= 9; num++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.printf("%d*%d=%d\t", dan, num, dan * num);
				
			}
			System.out.println();
		}
	}

}
