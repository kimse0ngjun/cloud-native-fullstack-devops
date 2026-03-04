<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지 사항 목록</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/list.css">
</head>
<h1>공지사항 목록</h1>
 <a href="${pageContext.request.contextPath}/loginui.do" class="login-link">[로그인]</a>
<body>
	<table border="1">
		<tr>
			<td colspan="6">
				<form action="search.do">
					<select name="searchName">
						<option value="writer">작성자</option>
						<option value="title">글제목</option>
					</select>
					<input type="text" name="searchValue">
					<input type="submit" value="찾기">
				</form>
			</td>
		</tr>
			
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>내용</td>
			<td>작성자</td>
			<td>날짜</td>
			<td>조회수</td>
		</tr>
		
		<c:if test="${empty list}">
            <tr><td colspan="6" style="text-align:center;">등록된 공지사항이 없습니다.</td></tr>
        </c:if>
		
		<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.id}</td>
				<td>
					<a href="retrieve.do?id=${dto.id}">${dto.title}</a>
				</td>
				<td>${dto.content}</td>
				<td>${dto.writer}</td>
				<td>${dto.regDate}</td>
				<td>${dto.hit}</td>
			</tr>
		</c:forEach>
	</table>

<div class="pagination-wrapper">
    <c:if test="${p.prev}">
        <a href="list.do?page=${p.startPage - 1}" class="page-btn">이전</a>
    </c:if>

    <c:forEach var="i" begin="${p.startPage}" end="${p.endPage}">
        <c:choose>
            <c:when test="${i == p.currentPage}">
                <span class="page-btn active">${i}</span>
            </c:when>
            <c:otherwise>
                <a href="list.do?page=${i}" class="page-btn">${i}</a>
            </c:otherwise>
        </c:choose>
    </c:forEach>

    <c:if test="${p.next}">
        <a href="list.do?page=${p.endPage + 1}" class="page-btn">다음</a>
    </c:if>
</div>

<div class="action-bar">
    <a href="${pageContext.request.contextPath}/writeui.do" class="write-link">[글쓰기]</a>
</div>
</body>
</html>