package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.dev.service.MerBerService;
import co.dev.vo.MemberVo;

public class MemberInsertJson implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/json;charset=utf-8");
		MemberVo vo = null;
		boolean isMulit = ServletFileUpload.isMultipartContent(request);
		if (isMulit) {
			String saveDir = "upload";
			saveDir = request.getServletContext().getRealPath(saveDir); // 실제 폴더가있는위치 가져오기
			int maxSize = 1024 * 1024 * 5; // 업로드최대파일크기
			String encoding = "UTF-8";
			// multipart 요청.
			// request, 저장위치, 파일최대크기, 인코딩 방식, 리네임정책 : 동일한파일이있을경우 - file.jpg, file1.jpg
			MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, encoding,
					new DefaultFileRenamePolicy());

			String id = multi.getParameter("id");
			String ps = multi.getParameter("passwd");
			String nm = multi.getParameter("name");
			String em = multi.getParameter("email");
			String pf = multi.getFilesystemName("profile");

			vo = new MemberVo();
			vo.setId(id);
			vo.setName(nm);
			vo.setPasswd(ps);
			vo.setEmail(em);
			vo.setProfile(pf);

			MerBerService service = new MerBerService();
			service.memberInsert(vo);

		} else { // key=value&key1=value1
			String id = request.getParameter("id");
			String ps = request.getParameter("passwd");
			String nm = request.getParameter("name");
			String em = request.getParameter("email");

			vo = new MemberVo();
			vo.setId(id);
			vo.setName(nm);
			vo.setPasswd(ps);
			vo.setEmail(em);

			MerBerService service = new MerBerService();
			service.memberInsert(vo);

		}
		// json 형태의 결과 반환.
		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(vo));

	}

}
