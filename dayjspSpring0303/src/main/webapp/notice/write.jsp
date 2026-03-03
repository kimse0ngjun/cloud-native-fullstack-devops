<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지 글쓰기</title>
</head>
<body>
<h1>계시판 글쓰기 화면</h1>
<form action="${pageContext.request.contextPath}/write.do" method="post">
	제목<input type="text" name="title"><br>
	작성자<input type="text" name="writer"><br>
	내용<textarea rows="5" cols="20" name="content"></textarea>
	<input type="submit" value="저장">
</form>
<a href="${pageContext.request.contextPath}/list.do>">목록</a>
</body>
</html>