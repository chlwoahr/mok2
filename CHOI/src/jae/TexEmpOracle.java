package jae;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TexEmpOracle extends DAO implements TexempIf {

	@Override
	public void insertTexEmp(TexEmp texemp) {// 회원추가
		conn = getConnect();

		String sql = "insert into tex_emp (emp_nu , emp_na, emp_hi, emp_jo, emp_sa, emp_ar, emp_pa) "
				+ "VALUES(?,?,?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, texemp.getEmpnu());
			psmt.setString(2, texemp.getEmpna());
			psmt.setString(3, texemp.getEmphi());
			psmt.setString(4, texemp.getEmpjo());
			psmt.setInt(5, texemp.getEmpsa());
			psmt.setString(6, texemp.getEmpar());
			psmt.setInt(7, texemp.getEmppa());
			;
			int r = psmt.executeUpdate();
			System.out.println(r + "건 추가");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public TexEmp getTexEmp(int nu) {// 회원정보조회
		conn = getConnect();
		TexEmp t = new TexEmp();
		String sql = "select*\r\n" + "from tex_emp\r\n" + "where emp_nu = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, nu);
			rs = psmt.executeQuery();
			if (rs.next()) {
				t.setEmpnu(rs.getInt("emp_nu"));
				t.setEmpna(rs.getString("emp_na"));
				t.setEmphi(rs.getString("emp_hi"));
				t.setEmpjo(rs.getString("emp_jo"));
				t.setEmpsa(rs.getInt("emp_sa"));
				t.setEmpar(rs.getString("emp_ar"));
				t.setEmppa(rs.getInt("emp_pa"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return t;
	}

	@Override
	public List<TexEmp> texemplist() {// 회원리스트
		conn = getConnect();
		List<TexEmp> t = new ArrayList<TexEmp>();
		String sql = "select *\r\n" + "from texemp";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				TexEmp t1 = new TexEmp();
				t1.setEmpnu(rs.getInt("emp_nu"));
				t1.setEmpna(rs.getString("emp_na"));
				t1.setEmphi(rs.getString("emp_hi"));
				t1.setEmpjo(rs.getString("emp_jo"));
				t1.setEmpsa(rs.getInt("emp_sa"));
				t1.setEmpar(rs.getString("emp_ar"));
				t1.setEmppa(rs.getInt("emp_pa"));
				t.add(t1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return t;
	}

	@Override
	public void modifyTexEmp(TexEmp texemp) {// 회원수정
		conn = getConnect();
		String sql = "update tex_emp\r\n" + "set \r\n" + "emp_jo = ? ,\r\n" + "emp_pa = ? \r\n" + "where emp_nu = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, texemp.getEmpjo());
			psmt.setInt(2, texemp.getEmppa());
			psmt.setInt(3, texemp.getEmpnu());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void removeTexEmp(int a) {// 회원삭제
		conn = getConnect();
		String sql = "delete from tex_emp\r\n" + "where emp_nu = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, a);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public TexEmp log(int a, int b) {
		conn = getConnect();
		TexEmp t = new TexEmp();
		String sql = "select *\r\n"
				+ "from tex_emp\r\n"
				+ "where emp_nu = ? and emp_pa = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1,a);
			psmt.setInt(2,b);
			rs = psmt.executeQuery();
			if(rs.next()) {
				t.setEmpnu(rs.getInt("emp_nu"));
				t.setEmpna(rs.getString("emp_na"));
				t.setEmphi(rs.getString("emp_hi"));
				t.setEmpjo(rs.getString("emp_jo"));
				t.setEmpsa(rs.getInt("emp_sa"));
				t.setEmpar(rs.getString("emp_ar"));
				t.setEmppa(rs.getInt("emp_pa"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return t;
		
		
	}

}
