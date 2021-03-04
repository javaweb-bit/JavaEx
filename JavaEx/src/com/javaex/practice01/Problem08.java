package com.javaex.practice01;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int balance = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("=================================");
			System.out.println("1. 입금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("=================================");
			
			System.out.print("선택>>");
			int menu = scanner.nextInt();
			int amount = 0;
			
			switch (menu) {
			case 1:	//	입금
				System.out.print("입금액>>");
				amount = scanner.nextInt();
				balance += amount;
				break;
			case 2: //	출금
				System.out.print("출금액>>");
				amount = scanner.nextInt();
				balance -= amount;
				break;
			case 3: //	잔고
				System.out.println("잔고>>" + balance);
				break;
			case 4:	//	종료
				run = false;
				break;
			default: //	없는 메뉴
				System.out.println("다시 입력해 주세요");
			}
		}
	}

}
