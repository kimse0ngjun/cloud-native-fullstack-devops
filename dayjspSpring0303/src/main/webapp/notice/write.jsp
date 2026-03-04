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
<h1>공지 글쓰기 화면</h1>

<c:if test="${empty sessionScope.loginUser}">
    <script>
        alert("로그인 후 이용하세요.");
        location.href = "loginui.do";
    </script>
</c:if>

<form action="write.do" method="post">
	제목<input type="text" name="title"><br>
	작성자 : ${sessionScope.loginUser.userId} <br>
	내용<textarea rows="5" cols="20" name="content"></textarea>
	<input type="submit" value="저장">
</form>
<a href="list.do">목록</a>
</body>
</html>