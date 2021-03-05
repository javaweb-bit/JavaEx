package com.javaex.oop.summary;

//	객체화 불가
//	필드를 가질 수 있다
//	일반 메서드, 추상 메서드를 가짐
public abstract class Animal {
	//	필드
	protected String name;
	protected int age;
	
	//	생성자
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal(String name, int age) {
		this(name);	//	내부의 다른 생성자를 호출
		this.age = age;
	}
	
	public void eat() {	//	일반 메서드
		System.out.println(name + "is eating...");
	}
	
	//	반드시 1개 이상의 추상 메서드를 가진다 -> 반드시 Override 해야 한다
	public abstract void say();	//	선언만 한다
}
