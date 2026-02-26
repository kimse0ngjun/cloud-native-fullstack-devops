<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>부서 등록 폼</h2>
	<form action="write.do" method="post">
		부서번호 : <input type="text" name="deptno"><br>
		부서이름 : <input type="text" name="dname"><br>
		부서위치 : <input type="text" name="loc"><br>
		<input type="submit" value="저장">
	</form>
	<a href="list.do">[목록보기]</a>
</body>
</html>