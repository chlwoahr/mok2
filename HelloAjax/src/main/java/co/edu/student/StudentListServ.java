package co.edu.student;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/studentList.json") // 접속시 이쪽서버로 연결
public class StudentListServ extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// [{"studentNo":?, "studentName": "?", "engScore": ?,"korScore":?}]
		resp.setCharacterEncoding("UTF-8"); // 한글처리
	    resp.setContentType("text/html;charset=UTF-8");
		StudentDAO dao = new StudentDAO();
		List<Student> list = dao.studentList();
		String jsonString="[";
		for(int i=0;i<list.size();i++) {
			jsonString += "{\"studentNo\":"+list.get(i).getStudentNo()
					+", \"studentName\": \""+list.get(i).getStudentName()
					+"\", \"engScore\": "+list.get(i).getEngScore()
					+",\"korScore\":"+list.get(i).getKorScore()+"}";
			if(i != list.size()-1) {
				jsonString += ",";
			}
		
		}
		jsonString+="]";
		
		resp.getWriter().print(jsonString); //화면에 뿌려줌
	}
}
