package com.javaex.oop.casting;

public class CastingEx {

	public static void main(String[] args) {
		//	자신의 인스턴스를 자신의 타입으로 참조
		Dog dog1 = new Dog("멍멍이");
		dog1.eat();
		dog1.walk();
		dog1.bark();
		
		//	자식의 인스턴스를 부모의 타입으로 참조할 수 있다(다형성)
		Animal dog2 = new Dog("스누피");
		dog2.eat();
		dog2.walk();
//		dog2.bark();	//	참조 타입의 설계도 내에 있는 것만 이용할 수 있다
		
		//	참조타입을 자기자신으로 변경(다운캐스팅)
		((Dog)dog2).bark();
		
		Animal pet = new Dog("아지");
		pet.eat();
		pet.walk();
		
		pet = null;
		
		pet = new Cat("야옹");
		pet.eat();
		pet.walk();
		
//		((Dog)cat).bark();	//	cat 인스턴스는 Dog 클래스의 인스턴스가 아니다
		//	중요: 다운캐스팅을 하기 전에 반드시 해당 인스턴스의 설계도 클래스를 인스턴스화 한 것인지 확인
		if (pet instanceof Dog) {	//	개 클래스?
			((Dog)pet).bark();
		} else if (pet instanceof Cat) {	//	고양이 클래스?
			((Cat)pet).meow();
		}
	}

}




