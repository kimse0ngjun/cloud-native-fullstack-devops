<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지 자세히 보기</title>
</head>
<body>
<h1>공지 자세히 보기</h1>
<form action="update.do" method="post">
	<input type="hidden" name="id" value="${retrieve.id}">
	글번호:${retrieve.id}&nbsp;&nbsp;&nbsp;&nbsp;
	조회수:${retrieve.hit}<br>
	제목<input type="text" name="title" value="${retrieve.title}"><br>
	작성자<input type="text" name="writer" value="${retrieve.writer}"><br>
	내용<textarea rows="5" cols="20" name="content">${retrieve.content}</textarea><br>
	<input type="submit" value="수정">
</form>
<a href="list.do">[목록]</a>
<a href="delete.do?id=${retrieve.id}">[삭제]</a>
</body>
</html>