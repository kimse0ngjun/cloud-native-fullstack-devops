<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>합계</title>
</head>
<body>
 <%!
 	int sum(int n1, int n2) {
	 return n1 + n2;
 }
 %>
 
 <%
 	out.println("<h1> 2 + 3 = " + sum(2,3) + "</h1>");
 %>
 
 <%
 	int a = 2;
 	int b = 3;
 	int sum = a + b;
 	out.println("2 + 3 = " + sum);
 %>
 
 
 
</body>
</html>