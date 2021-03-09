package com.javaex.collection.hash;

public class ClassRoom {
	//	필드
	private String subject;
	private String roomName;
	
	//	생성자
	public ClassRoom(String subject) {
		this.subject = subject;
	}
	
	public ClassRoom(String subject, String roomName) {
		this.subject = subject;
		this.roomName = roomName;
	}

	@Override
	public int hashCode() {
		// 가정: 과목은 같으나 강의실은 다를 수 있다
		//	과목의 hashCode가 같으면 식별자가 같은 것으로 하자
		return subject.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ClassRoom) {
			//	다운 캐스팅
			ClassRoom other = (ClassRoom)obj;
			return subject.equals(other.subject);
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}
}
