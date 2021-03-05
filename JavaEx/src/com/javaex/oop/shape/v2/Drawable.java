package com.javaex.oop.shape.v2;

//	인터페이스
//		부자연스러운 상속관계를 설정하지 않고도
//		비슷한 기능을 추가할 수 있는 횡적 확장
//	내부에 필드는 없고, 오직 추상 클래스만 선언(abstract 쓰지 않는다)
public interface Drawable {
	public void draw();
}
