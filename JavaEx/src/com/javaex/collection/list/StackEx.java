package com.javaex.collection.list;

import java.util.Stack;

public class StackEx {

	//	Stack 자료형
	//	Last Input First Output (LIFO)
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("STACK:" + stack);

		//	데이터 제공
		for (int i = 0; i < 10; i++) {
			stack.push(i);
			System.out.println("STACK:" + stack);
		}
		
		//	확인: 가장 마지막(출력 위치)의 데이터를 확인: 인출은 안함 
		System.out.println("PEEK:" + stack.peek());
		System.out.println("STACK:" + stack);
		
		//	인출: pop
		Integer item = stack.pop();
		System.out.println("POP:" + item);
		System.out.println("STACK:" + stack);
		
		//	순회
		while(!stack.empty()) {	//	stack이 비어있지 않으면
			System.out.println("POP:" + stack.pop());
			System.out.println("STACK:" + stack);
		}
	}

}
