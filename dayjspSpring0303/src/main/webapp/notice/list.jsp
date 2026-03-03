<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<html>
<head>
<meta charset="UTF-8">
<title>공지 사항 목록</title>
</head>
<body>
	<table border="1">
		<tr>
			<td colspan="6">
				<form action="search.do">
					<select>
						<option value="writer">작성자</option>
						<option value="tiele">글제목</option>
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
	</table>
<a href="writeui.do">[글쓰기]</a>
</body>
</html>