<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>답변글 쓰기 화면</title>
</head>
<body>
<form action="reply.do" method="post">
	<input type="hidden" name="num" value="${}">
	<input type="hidden" name="repRoot" value="${}">
	<input type="hidden" name="repStep" value="${}">
	<input type="hidden" name="repIndent" value="${}">
	원래글번호: ${}&nbsp;&nbsp;&nbsp;&nbsp;
	조회수: ${}<br>
	제목: <input type="text" name="title" value="${}"><br>
	작성자: <input type="text" name="author" value="${}"><br>
	내용<textarea rows="5" cols="20" name="content">${}</textarea><br>
	<input type="submit" value="답변달기">
</form>
<a href="list.do">[목록보기]</a>
</body>
</html>