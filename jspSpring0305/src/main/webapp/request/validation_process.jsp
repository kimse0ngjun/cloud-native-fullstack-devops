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

	if (id == null || id.equals("")) {
		out.println("아이디 입력 필요");
		return;
	}

	if (pwd.contains(id)) {
		out.println("비밀번호에 아이디 입력 불가");
		return;
	}
	%>
	
	<h2>결과</h2>
	
	아이디 : <%= id %> <br>
	비밀번호 : <%= pwd %>
</body>
</html>