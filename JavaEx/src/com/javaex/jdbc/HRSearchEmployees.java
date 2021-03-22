package com.javaex.jdbc;

import java.sql.*;
import java.util.Scanner;

public class HRSearchEmployees {

	public static void main(String[] args) {
		// 클래스 Scanner 를 사용하여 사원 이름을 입력 받아 사원 정보를 검색(부분 검색)하는 프로그램을 작성해 봅시다
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			
			System.out.print("검색어:");
			String keyword = scanner.next();
			
			//	SQL
			String sql = "SELECT first_name, last_name, " +
					"email, phone_number, hire_date " +
					"FROM employees " +
					"WHERE lower(first_name) LIKE '%" + keyword + "%' OR " +
					"lower(last_name) LIKE '%" + keyword + "%'";
			System.out.println("QUERY:" + sql);
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.printf("%s %s: %s, %s, %s%n", 
						rs.getString(1), rs.getString(2),	//	이름
						rs.getString(2),
						rs.getString("phone_number"),
						rs.getString("hire_date"));
			}
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		scanner.close();
	}
}
