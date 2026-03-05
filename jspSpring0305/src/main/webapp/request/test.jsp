<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="cloud.utils.DBUtils" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DBUtils</title>
</head>
<body>
	<% Connection conn = DBUtils.getConnection();
		if (conn != null) {
			out.println("DB 연결 성공~");
		} else {
			out.println("DB 연결 실패~");
		}
	%>
</body>
</html>