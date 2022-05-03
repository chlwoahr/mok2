package co.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	 Connection conn; //sql 연결
	 Statement stmt; // 쿼리실행
	 ResultSet rs;
	 PreparedStatement psmt; // 쿼리실행

	public Connection getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.58:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("연결성공");
		return conn;
	}

	public void disconnect() {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
			if (psmt != null)
				psmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
