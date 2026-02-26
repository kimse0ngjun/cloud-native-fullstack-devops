<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
</head>
<body>
	<h2>메인페이지(지시어)</h2> <!-- 파일 구조를 모두 포함해서 컴파일 후 처리해서 결과를 보여줌 -->
	<%@ include file="header.jsp" %>
	<hr>
	<h2>메인페이지(액션)</h2> <!-- include 된 파일을 각각 호출해서 처리된 결과만 포함해 보여준다 -->
	<jsp:include page="header.jsp"/>
</body>
</html>