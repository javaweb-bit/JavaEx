package com.javaex.jdbc.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorDaoOracleImpl implements AuthorDao {
	//	공통 코드인 접속 코드 로직을 분리합시다.
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			//	드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl, "C##NAMSK", "1234");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		}
		return conn;
	}
	@Override
	public List<AuthorVo> getList() {
		//	자바 객체를 이용 주고받기	: SQL RS -> Java 객체로 변환
		List<AuthorVo> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			
			String sql = "SELECT id, name, bio FROM author";
			rs = stmt.executeQuery(sql);
			
			//	루프를 돌면서 자바 객체로 변환
			while(rs.next()) {
				Long id = rs.getLong("id");
				String name = rs.getString("name");
				String bio = rs.getString("bio");
				
				//	VO 객체 생성
				AuthorVo vo = new AuthorVo(id, name, bio);
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AuthorVo> search(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthorVo get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(AuthorVo vo) {
		//	매개변수 vo를 전달받아서 author 테이블에 insert
		// INSERT, UPDATE, DELETE 수행시 executeUpdate 메서드 -> 결과 int(영향 받은 레코드 수)
		Connection conn = null;
		String sql = "INSERT INTO author VALUES(seq_author.NEXTVAL, ?, ?)";	//	실행계획
		int insertedCount = 0;
		
		try {
			conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//	파라미터 연결
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getBio());
			
			insertedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return insertedCount == 1;	//	INSERT 문장의 성공 여부
	}

	@Override
	public boolean update(AuthorVo vo) {
		// VO 객체 전달 name, bio 필드를 교체
		Connection conn = null;
		PreparedStatement pstmt = null;
		int updatedCount = 0;
		
		try {
			conn = getConnection();
			String sql = "UPDATE author SET name=?, bio=? WHERE id=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getBio());
			pstmt.setLong(3, vo.getId());
			
			updatedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return updatedCount == 1;
	}

	@Override
	public boolean delete(Long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int deletedCount = 0;
		
		try {
			conn = getConnection();
			String sql = "DELETE FROM author WHERE id=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setLong(1, id);
			deletedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return deletedCount == 1;
	}

}
