<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
</head>
<body>
<!-- Sidebar-->
    <div class="border-end bg-white" id="sidebar-wrapper">
      <div class="sidebar-heading border-bottom bg-light">Start Bootstrap</div>
      <div class="list-group list-group-flush">
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${pageContext.request.contextPath }/memberView/memberInsert.tiles">Dashboard</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${pageContext.request.contextPath }/memberView/memberSearch.jsp">Shortcuts</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${pageContext.request.contextPath }/memberView/memberUpdate.jsp">Overview</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${pageContext.request.contextPath }/memberView/memberDelete.jsp">Events</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${pageContext.request.contextPath }/memberList.do">Profile</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${pageContext.request.contextPath }/ajax.html">Status</a>
      </div>
     </div>


</body>
</html>