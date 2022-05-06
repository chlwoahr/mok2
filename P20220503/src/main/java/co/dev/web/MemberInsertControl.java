package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.dev.service.MerBerService;
import co.dev.vo.MemberVo;

public class MemberInsertControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// multipart : request, saveDir, maxSize, encoding, renamePolicy
		String saveDir = "upload";
		saveDir = request.getServletContext().getRealPath(saveDir); //실제 폴더가있는위치 가져오기
		int maxSize = 1024*1024*5; // 업로드최대파일크기
		String encoding = "UTF-8";
		// multipart 요청.
		// request, 저장위치, 파일최대크기, 인코딩 방식, 리네임정책 : 동일한파일이있을경우 - file.jpg, file1.jpg
		MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());
	
		
		
	String id = multi.getParameter("id");
	String ps = multi.getParameter("passwd");
	String nm = multi.getParameter("name");
	String em = multi.getParameter("email");
	String pf = multi.getFilesystemName("profile");
	
	
	MemberVo vo = new MemberVo();
	vo.setId(id);
	vo.setName(nm);
	vo.setPasswd(ps);
	vo.setEmail(em);
	vo.setProfile(pf);
	
	if(id.isEmpty()) {
		request.setAttribute("error", "아이디입력");
	}

	MerBerService service = new MerBerService();
	service.memberInsert(vo);
	
	request.setAttribute("id", id);
	request.setAttribute("name", nm);
	
	
	//Dispatcher 객체 forward.
	request.getRequestDispatcher("memberResult/memberInsertOutput.jsp").forward(request, response); // memberInsertOutput 페이지에 공유
	
	
	}

}
