package com.prod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



// ojdc라이브러리 추가, 오라클db 연결(db접속주소,hr,hr), connection객체
// query실행(Statement, PreparedStatement)
public class JDBCSample {
	static Connection conn;
	static Statement stmt; //쿼리실행
	static ResultSet rs;
	static PreparedStatement psmt;

	public static Connection getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("연결성공");
		return conn;
	}
	public static void disconnect() {
		try {
			if(rs!=null)
			rs.close();
			if(stmt!=null)
			stmt.close();
			if(conn !=null)
			conn.close();
			if(psmt !=null)
				psmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
//		DriverManager
		conn = getConnect();
		// Statement 생성.
		try {
			
//         입력. 사원번호, last_name, 입사일자, 이메일, job_id
			int emp_id=302;
			String last_name = "홍길동";
			String hire_date = "2020-03-05";
			String email = "kdong@email.com";
			String job = "IT_PROG";
			
			String fn = "kildong";
			String pn = "010-xxxx-7xx4";
			int salary = 6000;
			String sql = "delete from emp_java\r\n"
					+ "where employee_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, emp_id);
			
			
			
			int r = psmt.executeUpdate(); // 입력, 수정, 삭제
			System.out.println(r+"건 삭제됨.");
//			String sql = "update emp_java "
//					+ "set first_name = ?, "
//					+ "phone_number = ?, "
//					+ "salary = ? "
//					+ "where employee_id = ? ";
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, fn);
//			psmt.setString(2, pn);
//			psmt.setInt(3, salary);
//			psmt.setInt(4, emp_id);
//			삽입
//			String sql = "insert into emp_java(employee_id,last_name,email,hire_date,job_id) \r\n" 
//					+ "values("+emp_id+",'"+last_name+"','"+email+"','"+hire_date+"','"+job+"')";
			//수정			
//			String sql = "update emp_java\r\n"
//					+ "set first_name = '"+fn+"',\r\n"
//					+ "phone_number = '"+pn+"',\r\n"
//					+ "email = '"+email+"',\r\n"
//					+ "salary = "+salary+"\r\n"
//					+ "where employee_id = "+emp_id+"";
			//조회
//			rs = stmt.executeQuery("select*from emp_java");
//			while (rs.next()) {
//				System.out.println("사원번호: " + rs.getInt("employee_id"));
//				System.out.println("이름: " + rs.getString("First_name"));
//
//			}
		} catch (SQLException e1) { //
			e1.printStackTrace();
		}

		disconnect();
	}
}
