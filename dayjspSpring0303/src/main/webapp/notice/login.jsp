<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/login.css">
</head>
<body>
<div class="login-container">
	<h2>로그인</h2>
    <c:if test="${not empty error}">
        <div class="error-msg">${error}</div>
    </c:if>

    <form action="${pageContext.request.contextPath}/login.do" method="post">
        <div class="input-group">
            <label for="id">아이디</label>
            <input type="text" id="id" name="id" required placeholder="아이디를 입력하세요">
        </div>
        <div class="input-group">
            <label for="pwd">비밀번호</label>
            <input type="password" id="pwd" name="pwd" required placeholder="비밀번호를 입력하세요">
        </div>
        <button type="submit" class="login-btn">로그인</button>
    </form>

    <div class="join-link">
        아직 회원이 아니신가요? <a href="${pageContext.request.contextPath}/joinui.do">회원가입</a>
    </div>
</div>
</body>
</html>