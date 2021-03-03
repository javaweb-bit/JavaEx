package com.javaex.practice01;

public class Problem04 {

	public static void main(String[] args) {
		for (int row = 1; row <= 10; row++) {
			for (int col = row; col <= row + 9; col++) {
				System.out.print(col + "\t");
			}
			System.out.println();
		}
	}

}
