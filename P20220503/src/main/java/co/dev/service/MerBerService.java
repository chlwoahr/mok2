package co.dev.service;

import co.dev.dao.MemberDAO;
import co.dev.vo.MemberVo;
import java.util.List;
//DB CRUD작업 클래스
public class MerBerService {
	MemberDAO dao = new MemberDAO(); // db CRUD작업.
	
	public MemberVo memberSearch(String id) {
		return dao.searchMember(id);
	}
	
	public void memberInsert(MemberVo member) {
		dao.insertMember(member);
	}

	public List<MemberVo> memberList(){
		return dao.listMember();
	}
	public void memberUpdate(MemberVo member) {
		dao.updateMember(member);
	}
	public void memberDelete(String id) {
		dao.deleteMember(id);
	}
	
}
