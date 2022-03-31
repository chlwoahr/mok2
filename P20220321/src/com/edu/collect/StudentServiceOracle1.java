package com.edu.collect;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceOracle1 extends DAO implements StudentService {

	@Override
	public void insertStudent(Student student) {
		conn = getConnect();
		String sql = "insert into student_info(student_no,student_name,eng_score,kor_score) " + "values(?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getNu());
			psmt.setString(2, student.getNa());
			psmt.setInt(3, student.getE());
			psmt.setInt(4, student.getK());
			psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public Student getStudent(int sno) {
		conn = getConnect();
		Student s = new Student();
		String sql = "select * from student_info where student_no = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, sno);
			rs = psmt.executeQuery();
			if (rs.next()) {

				s.setNu(rs.getInt("student_no"));
				s.setNa(rs.getString("student_name"));
				s.setE(rs.getInt("eng_score"));
				s.setK(rs.getInt("kor_score"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return s;
	}

	@Override
	public List<Student> studentList() {
		conn = getConnect();
		List<Student> st = new ArrayList<Student>();
		String sql = "select *\r\n" + "from student_info\r\n";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Student s = new Student();
				s.setNu(rs.getInt("student_no"));
				s.setNa(rs.getString("student_name"));
				s.setE(rs.getInt("eng_score"));
				s.setK(rs.getInt("kor_score"));
				st.add(s);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return st;
	}

	@Override
	public void modifyStudent(Student student) {
		conn = getConnect();
		String sql = "update student_info set eng_score = ?, kor_score = ? where student_no = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getE());
			psmt.setInt(2, student.getK());
			psmt.setInt(3, student.getNu());
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		// conn = getConnect();
//		String sql = "update student_info set eng_score = ?, kor_score = ? " + "where student_no = ?  ";
//		try {
//			psmt = conn.prepareStatement(sql);
//			psmt.setInt(1, student.getE());
//			psmt.setInt(2, student.getK());
//			psmt.setInt(3, student.getNu());
//			psmt.executeUpdate();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}

	}

	@Override
	public void removest(int a) {
		conn = getConnect();
		String sql = "DELETE from student_info\r\n" + "where student_no = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, a);
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Student> searchStudents(String name) {
		conn = getConnect();
		List<Student> s = new ArrayList<Student>();
		String sql = "select* from student_info where student_name = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Student s1 = new Student();
				s1.setNu(rs.getInt("student_no"));
				s1.setNa(rs.getString("student_name"));
				s1.setE(rs.getInt("eng_score"));
				s1.setK(rs.getInt("kor_score"));
				s.add(s1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return s;
	}

	@Override
	public void saveTofile() {

	}

}
