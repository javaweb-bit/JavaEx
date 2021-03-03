package com.javaex.basic.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
//		arrayBasic();
//		twoDimens();
//		arrayCopyFor();
		arrayCopySystem();
	}
	
	//	배열 복사 (System 객체 이용)
	private static void arrayCopySystem() {
		int source[] = { 1, 2, 3 };
		int target[] = new int[10];
		
		System.arraycopy(source,	//	원본 배열
				0,	//	복사 시작 위치 
				target,	//	타겟 배열 
				0,	//	타겟 배열의 시작 인덱스 
				source.length);	//	길이
		
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();
		
		//	Enhanced for문
		for (int value: target) {
			System.out.print(value + "\t");
		}
		System.out.println();
	}
	
	//	배열 복사 
	private static void arrayCopyFor() {
		//	배열은 크기 변경이 불가
		//	추가 공간을 확보하려면 새 배열을 만들고 원래 요소값을 복사
		int source[] = {1, 2, 3};
		int target[] = new int[10];	//	10개 배열
		
		//	복사
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		
		//	 출력
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + " ");
		}
		System.out.println();
	}
	
	//	2차원 배열
	private static void twoDimens() {
		int[][] twoDimens = new int[5][10];	//	5행 10열
		
		//	기본 데이터가 있을 경우의 초기화
		int table[][] = {
				{ 1, 2, 3, 4, 5 },	//	한 행의 배열
				{ 2, 3, 4, 5, 6 },
				{ 3, 4, 5, 6, 7 }
		};
		
		System.out.println("length of table:" + table.length);
		System.out.println("length of table[0]:" + table[0].length);
		
		//	table 배열의 모든 값을 합산
		int total = 0;
		for (int row = 0; row < table.length; row++) {
			//	행에 접근
			for (int col = 0; col < table[row].length; col++) {
				System.out.print(table[row][col] + "\t");
				total += table[row][col];
			}
			System.out.println();
		}
		
		System.out.println("배열요소의 총 합:" + total);
	}
	
	private static void arrayBasic() {
		//	배열의 선언
		String[] names;	//	타입[] 식별자
		int scores[];	//	타입 식별자[]
		
		//	초기화
		names = new String[] {
				"홍길동",
				"장길산",
				"임꺽정",
				"전우치"
		};
		
//		System.out.println(names);
		
		scores = new int[4];	//	4개의 공간을 가진 빈 배열
		//	공간에 접근하려면 인덱스
		System.out.println("Length of scores:" + scores.length);
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 75;
		scores[3] = 95;
//		scores[4] = 100;	//	범위를 벗어난 접근은 불가
		
//		System.out.println(scores);
		//	값이 있을 경우 축약형
		float heights[] = {
				178.5f,
				185.0f,
				170.5f,
				188.0f
		};
		
		for (int i = 0; i < names.length; i++) {
			//	인덱스 범위: 0 ~ length - 1
			System.out.printf("%s (%.2f) : score = %d%n", 
					names[i], heights[i], scores[i]);
		}
		
		int[] scores2 = scores;	//	참조 복사 : 내용은 동일하나 주소한 복사
		System.out.println("scores와 scores2는 같은 객체? " + (scores == scores2));
		
		scores2[3] = 100;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}
		System.out.println();
		
	}

}
