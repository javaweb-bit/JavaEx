package com.javaex.oop.summary;

public class Panda extends Animal {
	// 생성자
	public Panda(String name, int age) {
		super(name, age);
	}

	// 부모의 추상 메서드는 반드시 Override!
	@Override
	public void say() {
		System.out.println(name + ": zzz~");
	}
}
