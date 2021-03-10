package com.javaex.thread.ex03;

public class MainThread {

	public static void main(String[] args) {
		// main thread의 흐름과 다른 별도의 작업 흐름
		// thread의 우선순위를 결정할 수 있다: 1(MIN) ~ 7(NORMAL)~ 10(MAX)
		//	CPU 자원이 부족할 때, 어느 쓰레드를 우선 실행시킬지 결정
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		thread.setPriority(Thread.MAX_PRIORITY); // 10
		// 주의
//		thread.run();	//	-> 일반 메서드로 run을 수행한 것

		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.setName("AlphabetRunnable");
		thread2.setPriority(Thread.MIN_PRIORITY); // 1
		
		//		쓰레드 시작
		thread.start(); // start() 메서드 내에서 run 메서드를 대신 수행

		// 생성자에 run 메서드가 구현된 Runnable 객체를 전달
		thread2.start();

		// Working Thread의 제어권을 유지하기 위해
		// 작업 흐름을 main 쓰레드에 합류
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("MainThread 종료!");
	}

}
