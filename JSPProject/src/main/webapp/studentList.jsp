<%@page import="co.edu.StudentDAO"%>
<%@page import="java.util.List" %>
<%@page import="co.edu.Student" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>studentList.jsp</title>
</head>
<body>
<table border="1">
 <thead>
 <tr><th>학생번호</th><th>학생이름</th><th>영어</th><th>국어</th></tr>
 </thead>
 <tbody>
   <%
   	StudentDAO dao = new StudentDAO();	
   	List<Student> list = dao.studentList();
   	for(Student student : list){
	   	out.print("<tr><td><a href = StudentGetServlet?cmd=search&user_id="+student.getStudentNo()+">"+student.getStudentNo()+"</a></td><td>"+student.getStudentName()+"</td><td>"+student.getEngScore()+"</td><td>"+student.getKorScore()+"</td></tr>");
   		
   	}
   	
   		
   %>


 </tbody>
 <caption>학생목록</caption>
</table>
<a href = "form.jsp">돌아가기</a>
<script>

</script>
</body>
</html>