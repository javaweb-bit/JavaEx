package com.javaex.oop.summary;

//	상속은 단일 상속만 가능
//	인터페이스는 다중 구현이 가능
public class TheOne extends Human implements KungfuSkill, Flyable {
	//	생성자
	public TheOne(String name, int age) {
		super(name, age);
	}

	@Override
	public void kungfu() {
		System.out.println(name + ": I know kungfu!");
	}

	@Override
	public void fly() {
		System.out.println(name + ": I believe I can fly~");
	}
	
	
}
