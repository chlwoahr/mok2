package com.prod.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class EmpDAO extends DAO {
	// 전체조회
	public List<Employee> empList() {
		List<Employee> employess = new ArrayList<Employee>();
		conn = getConnect(); // 연결
		try {
			psmt = conn.prepareStatement("select * from emp_java");
			rs = psmt.executeQuery(); // 조회
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date").substring(0, 10));
				emp.setJobId(rs.getString("job_id"));

				employess.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return employess;
	}

	// 한건조회
	public Employee empOneList(int emo) {
		
		conn = getConnect();
		Employee emp = new Employee();
		try {
			psmt = conn.prepareStatement("select * from emp_java where employee_id = ? ");
			psmt.setInt(1, emo);
			rs = psmt.executeQuery();
			if(rs.next()) {
			emp.setEmployeeId(rs.getInt("employee_id"));
			emp.setFirstName(rs.getString("first_name"));
			emp.setLastName(rs.getString("last_name"));
			emp.setEmail(rs.getString("email"));
			emp.setSalary(rs.getInt("salary"));
			emp.setHireDate(rs.getString("hire_date").substring(0, 10));
			emp.setJobId(rs.getString("job_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return emp;
	}

	
	 //이름 조회
	public List<Employee> empNameList(String ena) {
		
		conn = getConnect();
		
		List<Employee> emp = new ArrayList<Employee>();
		 
		try {
			psmt = conn.prepareStatement("select * from emp_java where first_name = ? ");
			psmt.setString(1, ena);
			rs = psmt.executeQuery();
			
				while(rs.next()) {
					Employee e1 = new Employee();
					e1.setEmployeeId(rs.getInt("employee_id"));
					e1.setLastName(rs.getString("last_name"));
					e1.setEmail(rs.getString("email"));
					e1.setSalary(rs.getInt("salary"));
					e1.setHireDate(rs.getString("hire_date").substring(0, 10));
					e1.setJobId(rs.getString("job_id"));
					emp.add(e1);
					}
			
			

			

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return emp;
	}

	// 입력처리 executeUpdate()

	public boolean insertEmp(Employee emp) {
		conn = getConnect();
		boolean b = false;
		
		String sql = "insert into emp_java (employee_id, last_name, email, hire_date, job_id) \r\n"
				+ "values (?, ?, ?, ?, ?)\r\n";

		try {
			psmt = conn.prepareStatement(sql); // ? < 매개변수값중에서 employeeid 필드값
			psmt.setInt(1, emp.getEmployeeId());
			psmt.setString(2, emp.getLastName());
			psmt.setString(3, emp.getEmail());
			psmt.setString(4, emp.getHireDate());
			psmt.setString(5, emp.getJobId());
			
			int r = psmt.executeUpdate(); // 실행된만큼 반환
			if(r == 0) {
				b = false;
			} else if(r == 1) {
				b = true;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			return b;
		} finally {
			// 정상실행, 예외발생 > 반드시 실행코드.
			disconnect();
		}
		return b;

	}

	// 수정처리
	public boolean updateEmp(Employee emp) {
		boolean a = true;
		conn = getConnect();
		String sql = "update emp_java \r\n" + "set first_name = ? ,\r\n" + "    phone_number = ? ,\r\n"
				+ "    salary = ? \r\n" + "where employee_id = ? \r\n";
		// 쿼리 작성 > ? 작성
		try {
			psmt = conn.prepareStatement(sql);
			// 파라메터(?) 지정.
			psmt.setString(1, emp.getFirstName());
			psmt.setString(2, emp.getPhoneNumber());
			psmt.setInt(3, emp.getSalary());
			psmt.setInt(4, emp.getEmployeeId());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정됨");
			if(r>0) {
				return a;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		} return false;
	}

	// 삭제처리
	public boolean deleteEmp(int empId) {
		conn = getConnect();
		
		String sql = "delete from emp_java\r\n" + "where employee_id = ?\r\n"; // 쿼리 작성 > ? 작성
		try {
			psmt = conn.prepareStatement(sql);
			// 파라메터(?) 지정.
			psmt.setInt(1, empId);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제됨");
			if (r>0) {
				System.out.println("비정상");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		} return false;
	}
}
