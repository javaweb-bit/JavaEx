package com.javaex.oop.goods.v2;

//	v2. 필드의 접근 제한
//		getter/setter를 이용한 필드의 우회 접근
public class Goods {
	//	필드
	//	public > protected > default > private
	private String name;
	private int price;
	
	//	Getter/Setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	//	출력용 메서드
	public void showInfo() {
		System.out.printf("상품 이름:%s%n가격: %d원%n", name, price);
	}
}
