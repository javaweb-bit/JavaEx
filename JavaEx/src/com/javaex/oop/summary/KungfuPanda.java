package com.javaex.oop.summary;

public class KungfuPanda extends Panda implements KungfuSkill {
	//	생성자
	public KungfuPanda(String name, int age) {
		super(name, age);
	}

	@Override
	public void kungfu() {
		//	KungfuSkill 인터페이스 내의 kungfu 추상 메서드 구현(반드시)
		System.out.println(name + ": 아뵤~");
	}
}
