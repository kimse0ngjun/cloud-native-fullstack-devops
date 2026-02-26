<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 리스트</title>
</head>
<body>
	<table border="1">
		<tr>
			<td colspan="3">부서 리스트</td>		
		</tr>
		<tr>
			<td>부서번호</td>
			<td>부서이름</td>
			<td>지역</td>
		</tr>
		
		<c:forEach var="dept" items="${list}" step="1">
			<tr>
				<td>${dept.deptno}</td>
				<td>${dept.dname}</td>
				<td>${dept.loc}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>