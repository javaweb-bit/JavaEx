package com.javaex.practice01;

public class Problem01 {

	public static void main(String[] args) {
		// 1 ~ 100 수 중에서 5의 배수, 7의 배수만 출력
		for (int num = 1; num <= 100; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				System.out.println(num);
			}
		}
	}

}
