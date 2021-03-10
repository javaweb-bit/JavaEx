package com.javaex.thread.synchronize;

public class SharedMemory {
	private int memory;

	public int getMemory() {
		return memory;
	}

	//	임계 영역 : 여러곳에서 동시에 사용하면 안되는 영역 -> synchronized 
	//	사용이 끝날 때까지 메서드가 잠김(Lock);
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(1000); //	1초 대기
		} catch (InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
	
	
}
