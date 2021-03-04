package com.javaex.practice02;

public class Problem04 {

	public static void main(String[] args) {
		// 6개의 중복되지 않은 정수난수(1 ~ 45)
		int[] nums = new int[6];
		int idx = 0; // 인덱스 변수

		while (idx < nums.length) {
			// 난수 발생
			int choice = (int) (Math.random() * 45) + 1;
			// 중복 데이터 체크
			boolean isDuplicated = false;

			if (idx != 0) {
				// 중복 체크
				for (int i = 0; i < idx; i++) {
					// 내부 값 체크
					if (nums[i] == choice) {
						// 중복
						isDuplicated = true;
						break;
					}
				}
			}

			if (!isDuplicated) {
				// 중복되지 않을 때 코드 수행
				nums[idx] = choice;
				idx++;
			}
		} // 난수 추출

		for (int value : nums) {
			System.out.print(value + " ");
		}
		System.out.println();

	}

}
