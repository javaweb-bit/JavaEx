package com.javaex.oop.staticmember;

public class StaticApp {

	public static void main(String[] args) {
		//	1번째 로드: static -> 생성자
		StaticEx s1 = new StaticEx();
		System.out.println("참조카운트:" + s1.refCount);
//		static 멤버는 new를 하지 않고도 호출할 수 있다.
		System.out.println("참조카운트:" + StaticEx.refCount);
		
		//	2번째 로드: static 블록은 수행되지 않음
		StaticEx s2 = new StaticEx();
		System.out.println("참조카운트:" + StaticEx.refCount);
		
		//	해제
		s1 = null;
		System.out.println("s1 해제");
		System.out.println("참조카운트:" + StaticEx.refCount);
		
		//	임의로 gc 부르지 말자! 
		System.gc(); // 가비지 콜렉터 호출
		try {
			Thread.sleep(1000); //	1초 대기
			System.out.println("참조카운트:" + StaticEx.refCount);
		} catch (Exception e) {
			
		}
	}

}
