<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/join.css">
</head>
<body>
<div class="join-container">
    <h2>회원가입</h2>

    <form action="${pageContext.request.contextPath}/join.do" method="post">
        <div class="input-group">
            <label for="id">아이디</label>
            <input type="text" id="id" name="id" required placeholder="사용할 아이디 입력">
        </div>
        
        <div class="input-group">
            <label for="pwd">비밀번호</label>
            <input type="password" id="pwd" name="pwd" required placeholder="비밀번호 입력">
        </div>
        
        <div class="input-group">
            <label for="name">이름</label>
            <input type="text" id="name" name="name" required placeholder="실명 입력">
        </div>
        
        <button type="submit" class="join-btn">가입하기</button>
    </form>

    <div class="back-link">
        이미 회원이신가요? <a href="${pageContext.request.contextPath}/loginui.do">로그인하러 가기</a>
    </div>
</div>
</body>
</html>