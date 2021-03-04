package com.javaex.practice02;

public class Problem01 {

	public static void main(String[] args) {
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		
		//	3의 배수의 갯수와, 3의 배수의 합
		int total = 0, count = 0;
		
		for (int num: data) {
			if (num % 3 == 0) {
				total += num;
				count++;
			}
		}
		
		System.out.println("3의 배수의 합:" + total);
		System.out.println("3의 배수의 갯수:" + count);

	}

}
