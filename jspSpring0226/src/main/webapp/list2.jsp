<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원 리스트</title>
</head>
<body>
	<table border="1">
		<tr>
			<td colspan="3">직원 리스트</td>		
		</tr>
		<tr>
			<td>직원번호</td>
			<td>직원이름</td>
			<td>지역</td>
			<td>mgr</td>
			<td>고용날짜</td>
			<td>봉금</td>
			<td>com</td>
			<td>부서번호</td>
		</tr>
		
		<c:forEach var="emp" items="${list2}" step="1">
			<tr>
				<td>${emp.empno}</td>
				<td>${emp.ename}</td>
				<td>${emp.job}</td>
				<td>${emp.mgr}</td>
				<td>${emp.hiredate}</td>
				<td>${emp.sal}</td>
				<td>${emp.com}</td>
				<td>${emp.deptno}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>