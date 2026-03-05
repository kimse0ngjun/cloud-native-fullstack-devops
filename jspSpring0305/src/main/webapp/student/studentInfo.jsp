<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>학생정보 관리 시스템</title>
    <style>
    </style>
</head>
<body>
    <div class="container">
        <div class="header-container">
            <h1>학생정보 관리</h1>
        </div>
		<div class="auth-links">
		    <a href="${pageContext.request.contextPath}/student.m" class="login-link">학생목록 새로고침</a>
		</div>

		<div class="info-form">
		    <h3>학생 정보 등록</h3>
            <form action="${pageContext.request.contextPath}/insert.m" method="post">
                <div class="form-group">
                    <label>이름</label>
                    <input type="text" name="username" required>
                </div>
                <div class="form-group">
                    <label>대학교</label>
                    <input type="text" name="univ" required>
                </div>
                <div class="form-group">
                    <label>생년월일</label>
                    <input type="date" name="birth" required>
                </div>
                <div class="form-group">
                    <label>이메일</label>
                    <input type="email" name="email" required>
                </div>
                <button type="submit" class="submit-btn">정보 저장</button>
            </form>
        </div>

<table border="1">
    <thead>
        <tr>
            <th>번호</th>
            <th>이름</th>
            <th>대학교</th>
            <th>생년월일</th>
            <th>이메일</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="s" items="${student}">
            <tr>
                <td>${s.id}</td>
                <td>${s.username}</td>
                <td>${s.univ}</td>
                <td>${s.birth}</td>
                <td>${s.email}</td>
            </tr>
        </c:forEach>
        
        <c:if test="${empty student}">
            <tr>
                <td colspan="5" style="text-align:center;">조회된 학생 정보가 없습니다.</td>
            </tr>
        </c:if>
    </tbody>
</table>
    </div>
</body>
</html>