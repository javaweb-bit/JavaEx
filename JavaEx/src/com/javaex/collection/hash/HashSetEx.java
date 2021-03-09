package com.javaex.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
//		basicHashSetEx();
		customHashSetEx();
	}

	private static void customHashSetEx() {
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student("홍길동", 10);
		Student s2 = new Student("장길산", 20);
		Student s3 = new Student("전우치", 30);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println("학생부:" + hs);
		
		Student s4 = new Student("홍길동", 10);
		hs.add(s4);
		System.out.println("hashcode of s1:" + s1.hashCode());
		System.out.println("hashcode of s4:" + s4.hashCode());
		System.out.println("s1 equals s4 ? " + s1.equals(s4));
		
		System.out.println("학생부:" + hs);
		
		//	포함 여부 확인
		boolean exists = hs.contains(new Student("홍길동", 10));
		System.out.println("홍길동(10) exists:" + exists);
	}
	
	private static void basicHashSetEx() {
		HashSet<String> hs = new HashSet<>();
		
		//	요소 추가
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		
		System.out.println("HashSet:" + hs);	//	순서는 유지하지 않음
		System.out.println("요소의 수:" + hs.size());
		
		hs.add("Java");
		System.out.println("HashSet:" + hs);	//	중복을 허용하지 않음
		
		//	요소의 포함 여부 확인
		System.out.println("contains Java ? " + hs.contains("Java"));
		System.out.println("contains Linux ? " + hs.contains("Linux"));
		
		System.out.println("HashSet:" + hs);
		
		//	요소의 삭제
		hs.remove("C++");
		System.out.println("HashSet:" + hs);
		
		//	비우기
		hs.clear();
		System.out.println("HashSet:" + hs);
		
	}

}
