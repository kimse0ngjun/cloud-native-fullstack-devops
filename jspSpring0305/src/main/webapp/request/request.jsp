<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<div class="container">
		<form action="request_process.jsp">
			아이디 <input type="text" name="id" required><br>
			비밀번호 <input type="text" name="pwd" required><br>
			<input type="submit" value="전송">
		</form>
	</div>
</body>
</html>