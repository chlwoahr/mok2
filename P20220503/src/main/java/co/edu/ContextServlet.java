package co.edu;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿호출 
// jsp에서는 어플리케이션 서블릿에서는 ServletContext
// ServletConfig 객체생성 어플리케이션의 전체정보
//HttpServerrequest, httpservletresponse
//init(sc);
//service(req,resp);
//destroy();

@WebServlet("/ContextServlet")
public class ContextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ServletContext sc = null;
       
    public ContextServlet() {
        super();
    }

    
    @Override
    public void init(ServletConfig config) throws ServletException {
    sc = config.getServletContext(); // sc(servlet)=> application(jsp)
    sc.setAttribute("name","Hong");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("name: "+ sc.getAttribute("name"));
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
