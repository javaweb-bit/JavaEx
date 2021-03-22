package com.javaex.jdbc.dao;

import java.util.List;
import java.sql.*;

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
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(AuthorVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
