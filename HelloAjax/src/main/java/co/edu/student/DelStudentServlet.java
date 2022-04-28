package co.edu.student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DelStudentServlet
 */
@WebServlet("/ajax/delStudentServlet")
public class DelStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DelStudentServlet() {
        super();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
    	String id = req.getParameter("delId");
		
		StudentDAO dao = new StudentDAO();
		boolean success = dao.removeStudent(id);
		if(success) {
			// {"retCode":"OK", "retVal" : id}
			resp.getWriter().println("{\"retCode\":\"OK\", \"retVal\" : "+ id+"}");
		}else {
			// {"retCode":"NO", "retVal" : id}
			resp.getWriter().println("{\"retCode\":\"NO\", \"retVal\" : "+ id+"}");
		}
		
		
		dao.removeStudent(id);
	}
    
    
    }

//    @Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//		
//		String id = request.getParameter("delId");
//		
//		StudentDAO dao = new StudentDAO();
//		boolean success = dao.removeStudent(id);
//		if(success) {
//			// {"retCode":"OK", "retVal" : id}
//			response.getWriter().println("{\"retCode\":\"OK\", \"retVal\" : "+ id+"}");
//		}else {
//			// {"retCode":"NO", "retVal" : id}
//			response.getWriter().println("{\"retCode\":\"NO\", \"retVal\" : "+ id+"}");
//		}
//		
//		
//		dao.removeStudent(id);
//	}


