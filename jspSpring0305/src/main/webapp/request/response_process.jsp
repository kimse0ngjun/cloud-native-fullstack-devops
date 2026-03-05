<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검증</title>
</head>
<body>
	<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	if ("test1234".equals(id) && "test1234".equals(pwd)) {
		response.sendRedirect("response_success.jsp");
	} else {
		response.sendRedirect("response_fail.jsp");
	}
	%>
</body>
</html>