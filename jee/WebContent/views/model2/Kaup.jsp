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
					<td><%= request.getAttribute("키") %></td>
				</tr>
				<tr>
					<td>몸무게</td>
					<td><%= request.getAttribute("몸무게") %></td>
				</tr>
				<tr>
					<td colspan="2"><%= request.getAttribute("비만도") %> </td>
				</tr>
				<tr>
					<td colspan="2"><%= request.getAttribute("정보") %> </td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>