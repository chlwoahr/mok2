package com.edu.collect;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class StudentServiceOracle extends DAO implements StudentService {

	@Override
	public void insertStudent(Student student) {
		conn = getConnect();
		String sql = "insert into student_info (student_no, student_name, eng_score, kor_score) " 
		+ "values(?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getNu());
			psmt.setString(2, student.getNa());
			psmt.setInt(3, student.getK());
			psmt.setInt(4, student.getE());
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
		String sql = "select * "
				+ "from student_info "
				+ "where student_no = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, sno);
			rs = psmt.executeQuery();
			if(rs.next()) {
				
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
		String sql = "select * from student_info order by student_no";
		List<Student> list = new ArrayList<Student>();// 조회된 결과값을 담기위한 컬렉션
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); // 실행건수만큼 반복자
			while (rs.next()) { // 반복자를 통해 요소를 가지고 올수있는지 체크, 있는만큼 가져옴
				Student student = new Student();
				student.setNu(rs.getInt("student_no"));
				student.setNa(rs.getString("student_name"));
				student.setE(rs.getInt("eng_score"));  //천천히 하나씩 하기!! set 메소드 확인
				student.setK(rs.getInt("kor_score"));
				list.add(student);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public void modifyStudent(Student student) {
		conn = getConnect();
		String sql = "update student_info set eng_score = ?, kor_score = ? where student_no = ?" ;
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getE());
			psmt.setInt(2, student.getK());
			psmt.setInt(3, student.getNu());
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removest(int a) {
		conn = getConnect();
		String sql = "delete from student_info "
				+ "where student_no = ? " ;
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
			
			while(rs.next()) {
				Student s1 = new Student();
				s1.setNu(rs.getInt("student_no"));
				s1.setNa(rs.getString("student_name"));
				s1.setE(rs.getInt("eng_score"));
				s1.setK(rs.getInt("kor_score"));
				s.add(s1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} return s;
	}

	@Override
	public void saveTofile() {

	}

}
