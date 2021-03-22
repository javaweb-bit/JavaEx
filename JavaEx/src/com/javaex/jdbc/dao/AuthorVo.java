package com.javaex.jdbc.dao;

//	DTO(VO) : 자바의 객체간 데이터 전송을 위한 값 객체
//		일반적으로 로직은 담고 있지 않다
//		필드, getter/setter, toString(), equals() 정도만 가지고 있다
public class AuthorVo {
	private Long id;	//	DTO 객체에서는 기본타입은 잘 사용하지 않는다(null이 가능해야 한다)
	private String name;
	private String bio;
	
	public AuthorVo() {
		//	기본 생성자
	}
	
	public AuthorVo(String name, String bio) {
		this.name = name;
		this.bio = bio;
	}
	
	public AuthorVo(Long id, String name, String bio) {
		this(name, bio);
		this.id = id;
	}

	//	Getters/Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	//	객체 출력
	@Override
	public String toString() {
		return "AuthorVo [id=" + id + ", name=" + name + ", bio=" + bio + "]";
	}
}
