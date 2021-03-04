package com.javaex.oop.point.v4;

//	객체를 상속 받으려면 extends 키워드
//	최상위 부모는 java.lang.Object
public class ColorPoint extends Point {
	//	필드
	private String color;
	//	생성자를 만들지 않으면 기본 생성자를 선택한다
	/*
	public ColorPoint() {
		//	특별히 명시하지 않으면 부모의 기본 생성자를 선택한다
		super();	//	-> 없어요
	}
	*/

	//	생성자
	public ColorPoint(int x, int y, String color) {
		super(x, y);	//	부모 생성자 호출
		this.color = color;
	}
	
	//	getter/setter
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//	부모로부터 draw 메서드를 물려받았지만, 다른 기능을 수행할 경우, Override (덮어쓰기)
	@Override	//	이 메서드는 오버라이드된 메서드임을 명시
	public void draw() {
		//	오버라이드가 되어도 부모의 메서드는 남아있다
		//	부모의 메서드를 호출
		super.draw();
		System.out.printf("색깔점[x=%d, y=%d, 색상=%s]을 그렸습니다.%n",
				getX(), getY(), color);
	}
	
	@Override
	public void draw(boolean show) {
		String message = String.format("색깔점[x=%d, y=%d, 색상=%s]를 ", x, y, color);
		if (show) {	//	true
			message += "그렸습니다.";
		} else {
			message += "지웠습니다.";
		}
		System.out.println(message);
	}
}
