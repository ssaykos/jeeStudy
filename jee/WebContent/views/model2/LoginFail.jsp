<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>로그인 실패 페이지</title>
</head>
<body>
	<!-- 로그인 실패의 원인이 ID값이 틀린건지 비밀번호가 틀린건지 알수있게 랜더링 -->
	<%= request.getAttribute("메세지") %>
</body>
</html>