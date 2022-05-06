package co.dev.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.multi.MultiMenuItemUI;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/fileUploadServlet")
public class FileUploadServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FileUploadServ() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		System.out.println("title:" + title + ", content: " + content);
		
		
		String saveDir = "upload";
		saveDir = getServletContext().getRealPath(saveDir); //실제 폴더가있는위치 가져오기
		int maxSize = 1024*1024*5; // 업로드최대파일크기
		String encoding = "UTF-8";
		// multipart 요청.
		// request, 저장위치, 파일최대크기, 인코딩 방식, 리네임정책 : 동일한파일이있을경우 file.jpg, file1.jpg
		MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());
		title= multi.getParameter("title");
		content = multi.getParameter("content");
		String profile = multi.getOriginalFileName("profile"); // 파일원래의이름
		String fileName = multi.getFilesystemName("profile"); // 같은이름이있는경우
		System.out.println("title:" + title + ", content: " + content +", profiel: " + profile+", file: "+fileName);
		
	}

}
