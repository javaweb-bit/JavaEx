package com.javaex.practice02;

public class Problem05 {

	public static void main(String[] args) {
		int scoreboard[][] = {
				{ 80, 75, 90, 95, 78 },
				{ 92, 88, 89, 92, 70 },
				{ 78, 80, 85, 86, 63 },
				{ 83, 84, 89, 87, 75 },
				{ 89, 83, 93, 94, 78 }
				};
		//	85점 이상인 점수의 합과 평균
		int total = 0, count = 0;
		
		//	행루프
		for (int row = 0; row < scoreboard.length; row++) {
			//	열 루프
			for (int col = 0; col < scoreboard[row].length; col++) {
				//	비교
				if (scoreboard[row][col] >= 85) {
					total += scoreboard[row][col];
					count++;
				}
			}
		}
		
		//	결과 출력
		System.out.println("합계:" + total);
//		System.out.println("평균:" + ((double)total / count));
		System.out.printf("평균:%.2f%n", ((double)total / count));
	}

}
