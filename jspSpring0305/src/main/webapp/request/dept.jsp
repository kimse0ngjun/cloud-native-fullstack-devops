<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="cloud.utils.DeptDBUtils" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dept</title>
</head>
<body>

<h2>부서 목록</h2>

<table border="1">
<tr>
	<td>deptno</td>
	<td>dname</td>
	<td>loc</td>
</tr>
<%
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	try{
		conn = DeptDBUtils.getConnection();
		stmt = conn.createStatement();
		
		String sql = "SELECT * FROM dept";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()){
	%>

	<tr>
		<td><%= rs.getInt("deptno") %></td>
		<td><%= rs.getString("dname") %></td>
		<td><%= rs.getString("loc") %></td>
	</tr>

	<%
		}

	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(rs!=null) rs.close();
		if(stmt!=null) stmt.close();
		if(conn!=null) conn.close();
	}
	%>
</table>

</body>
</html>