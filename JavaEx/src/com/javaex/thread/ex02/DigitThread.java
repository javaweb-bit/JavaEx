package com.javaex.thread.ex02;

//	방법 1. Thread 상속
//		-> 스레드 내부 로직을 정밀하게 제어 가능
public class DigitThread extends Thread {

	@Override
	public void run() {
		// 실제 쓰레드의 실행 로직
		for (int i = 1; i <= 30; i++) {
			System.out.printf("%s:%d%n", getName(), i);
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}

}
