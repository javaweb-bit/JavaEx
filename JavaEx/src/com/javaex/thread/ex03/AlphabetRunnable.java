package com.javaex.thread.ex03;

//	run 메서드만 구현, Thread의 생성자로 전달
public class AlphabetRunnable implements Runnable {

	@Override
	public void run() {
		// main thread:A ~ Z 출력
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			//	현재 Thread를 구하려면 Thread.currentThread()
			System.out.println(Thread.currentThread().getName() + ":" + ch);

			// 잠시 대기
			try {
				Thread.sleep(300); // 0.3초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
