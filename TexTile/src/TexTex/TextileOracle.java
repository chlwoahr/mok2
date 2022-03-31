package TexTex;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TextileOracle extends DAO implements TexIf {

	@Override
	public void insertTexTile(TexTile textile) { // 1.추가 2. 수량수정 3.색상수정 3. 리스트 4.오더번호 조회 4. 삭제
		conn = getConnect();

		String sql = "insert into textile (order_nu, tex_na, tex_co, tex_am) VALUES(?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, textile.getTexnu());
			psmt.setString(2, textile.getTexna());
			psmt.setString(3, textile.getTexco());
			psmt.setInt(4, textile.getTexam());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 추가");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void modifyTexTile(TexTile textile) {
		conn = getConnect();
		String sql = "update textile\r\n" + "set tex_co = ?,\r\n" + "tex_am = ?\r\n" + "where order_nu = ? ";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, textile.getTexco());
			psmt.setInt(2, textile.getTexam());
			psmt.setInt(3, textile.getTexnu());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public TexTile getTexTile(int nu) { // 한건조회
		conn = getConnect();
		TexTile t = new TexTile();
		String sql = "select *\r\n" + "from textile\r\n" + "where order_nu = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, nu);
			rs = psmt.executeQuery();
			if (rs.next()) {
				t.setTexnu(rs.getInt("order_nu"));
				t.setTexna(rs.getString("tex_na"));
				t.setTexco(rs.getString("tex_co"));
				t.setTexam(rs.getInt("tex_am"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return t;
	}

	@Override
	public List<TexTile> textileList() { // 전체목록
		conn = getConnect();
		List<TexTile> t = new ArrayList<TexTile>();
		String sql = "select * \r\n"
				+ "from textile ";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				TexTile t1 = new TexTile();
				t1.setTexnu(rs.getInt("order_nu"));
				t1.setTexna(rs.getString("tex_na"));
				t1.setTexco(rs.getString("tex_co"));
				t1.setTexam(rs.getInt("tex_am"));
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
	public void removeTx(int a) { // 상품삭제
		conn = getConnect();
		String sql = "delete from textile\r\n" + "where order_nu = ? ";
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

}
