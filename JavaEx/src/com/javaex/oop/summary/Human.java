package com.javaex.oop.summary;

public class Human extends Animal {
	//	생성자
	public Human(String name, int age) {
		super(name, age);
	}

	@Override
	public void say() {
		System.out.printf("안녕, 내 이름은 %s야%", name);
	}
}
