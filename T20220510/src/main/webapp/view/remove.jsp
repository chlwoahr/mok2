<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>

	<h3>${error }</h3>

    <h3>도서삭제조회</h3>
    <form action="../searchBook.do" method="get">
        <input type="text" name="bookCode"><br>
        <input type="hidden" name="job" value="remove">
        <input type="submit" value="조회">
    </form>

    <!-- 도서삭제를 위한 화면 작성코드를 입력하세요. -->
	
	<h3>회원정보삭제</h3>
	<form action="${pageContext.servletContext.contextPath }/removeBook.do" method="post">
	코드: <input type="text" name="bookCode" readonly value="${bookm.bookCode }"><br>
	
	<input type="submit" value="삭제">
	</form>






    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>

</html>