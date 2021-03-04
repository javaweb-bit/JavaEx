package com.javaex.oop.goods.v4;

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods("LG Gram", 1500000);	//	사용자 정의 생성자 활용		
		Goods smartphone = new Goods("iPhone SE", 650000);
		
		notebook.showInfo();
		
		//	누군가 악의적, 실수로
		/*
		notebook.setPrice(15000);
		notebook.showInfo();
		*/
		
		System.out.printf("%s, %d원%n", 
				notebook.getName(), notebook.getPrice());
		notebook.showInfo();
		
		System.out.printf("%s, %d원%n",
				smartphone.getName(), smartphone.getPrice());
		smartphone.showInfo();
	}

}
