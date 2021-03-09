package com.javaex.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashtableEx {

	public static void main(String[] args) {
		//	Map 인터페이스
		Map<String, ClassRoom> map = new Hashtable<>();

		//	인덱스 접근이 아니라 키를 이용한 접근
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("202", new ClassRoom("C", "R202"));
		map.put("303", new ClassRoom("Python", "R303"));
		
		System.out.println("MAP:" + map);
		//	키셋 -> HashSet -> 순서가 없다
		
		//	조회
		ClassRoom room = map.get("202");	//	키 접근
		System.out.println("202 강의실:" + room);
		
		//	변경
		map.put("202", new ClassRoom("Linux", "R202"));
		System.out.println("MAP:" + map);
		//	동일한 키를 사용하면 -> 내용을 덮어쓴다
		
		//	특정 키가 포함되어 있는가?
		System.out.println("map has 202 key ? " + map.containsKey("202"));
		//	특정 값이 포함되어 있는가? -> subject가 Java인 객체가 있는가?
		System.out.println("map has subject Java ? " + 
				map.containsValue(new ClassRoom("Java")));
		
		//	반복자 활용
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			ClassRoom item = map.get(it.next());
			System.out.println(item);
		}
		
		//	삭제
		map.remove("202");
		System.out.println("MAP:" + map);
		
		//	비워봅시다.
		map.clear();
		System.out.println("MAP:" + map);
		
	}

}
