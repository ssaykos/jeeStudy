<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>form 태그</title>
</head>
<body>
	<form action="">
		<fieldset>
			<legend>데이터 전송</legend>
			ID:<input type="text" name="id" value="ID" /> <br/>
			비밀번호:<input type="password" name="pass" value="비밀번호" /> <br/>
			<label for="hello">인사말</label> <br/>
			<textarea name="area" id="area" rows="10" cols="30"></textarea><br/>
			<input type="image" src="../../image/4.gif" width="300" />
		</fieldset>
	</form>
</body>
</html>