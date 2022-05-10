<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>조회결과페이지</h3>
	<c:if test="${!empty bookm }">
<h4>${bookm.bookCode } / ${bookm.bookTitle } / ${bookm.bookAuthor } / ${bookm.bookPress } / ${bookm.bookPrice }</h4>
</c:if>
    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>
</html>