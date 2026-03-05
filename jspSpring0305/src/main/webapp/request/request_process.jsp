<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request 출력값</title>
</head>
<body>
	<% 
	String id = request.getParameter("id");
	out.println("아이디 : " + id);
	%><br>
	<% 
	String pwd = request.getParameter("pwd");
	out.println("비밀번호 : " + pwd);
	%>
</body>
</html>