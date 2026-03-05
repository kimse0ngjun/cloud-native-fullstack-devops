<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>validation</title>
</head>
<body>
	<form action="validation_process.jsp" method="get" onsubmit="return checkForm()">
		<label>아이디</label>
		<input type="text" id="id" name="id"><br>
		<label>비밀번호</label>
		<input type="text" id="pwd" name="pwd"><br>
		<input type="submit" value="전송">
	</form>
	
	<script>
		function checkForm() {
			var id = document.getElementById("id").value;
			var pwd = document.getElementById("pwd").value;
			
			if(id == "") {
				alert("아이디를 입력해주세요.")
				return false;
			} else if (pwd.includes(id)) {
				alert("비밀번호는 ID를 포함할 수 없습니다.")
				return false;
			}
			
			return true;
		}
	</script>
</body>


</html>