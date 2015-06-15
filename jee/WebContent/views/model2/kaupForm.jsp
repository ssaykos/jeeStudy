<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>카우프 지수 구하기</title>
	<style>
		@import url("<%= request.getContextPath() %>/css/koup.css");
	</style>
</head>
<body>
	<div>
		<form action="<%= request.getContextPath() %>/model2/kaup.do">
			<table>
				<tr>
					<td>키</td>
					<td><input type="text" name="키" placeholder="소수점 첫째자리 까지만 입력하세요."></td>
				</tr>
				<tr>
					<td>몸무게</td>
					<td><input type="text" name="몸무게" placeholder="소수점 첫째자리 까지만 입력하세요."></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" name="전송" value="전송"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>