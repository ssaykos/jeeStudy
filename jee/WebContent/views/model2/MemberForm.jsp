<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>회원가입 및 로그인</title>
	<style>
		@import url("<%= request.getContextPath() %>/css/koup.css");
	</style>
</head>
<body>
	<div>
	
			<form action="<%= request.getContextPath() %>/model2/join.do" method="post">
			<fieldset>
			<legend>회원가입</legend>
				<table>
					<tr>
						<td>아이디</td>
						<td><input type="text" name="아이디" placeholder="소수점 첫째자리 까지만 입력하세요."></td>
					</tr>
					<tr>
						<td>비밀번호</td>
						<td><input type="password" name="비밀번호"></td>
					</tr>
					<tr>
						<td>이름</td>
						<td><input type="text" name="이름" placeholder="이름을 입력하세요."></td>
					</tr>
					<tr>
						<td>나이</td>
						<td><input type="text" name="나이" placeholder="나이를 입력하세요."></td>
					</tr>
					<tr>
						<td>주소</td>
						<td><input type="text" name="주소" placeholder="주소를 입력하세요."></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" name="전송" value="전송"></td>
					</tr>
				</table>
				</fieldset>
			</form>
		<form action="<%= request.getContextPath() %>/model2/login.do" method="post">
			<fieldset>
			<legend>로그인</legend>
				<table>
					<tr>
						<td>아이디</td>
						<td><input type="text" name="아이디" placeholder="아이디 입력하세요."></td>
					</tr>
					<tr>
						<td>비밀번호</td>
						<td><input type="password" name="비밀번호"></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" name="전송" value="전송"></td>
					</tr>
				</table>
				</fieldset>
			</form>
	</div>
</body>
</html>