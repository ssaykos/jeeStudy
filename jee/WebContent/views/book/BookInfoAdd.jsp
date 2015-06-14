<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title> 책 정보 입력 확인 페이지</title>
</head>
<body>
	<%= request.getAttribute("일련번호") %>
	<%= request.getAttribute("책제목") %>
	<%= request.getAttribute("저자명") %>
	<%= request.getAttribute("출판사") %>
	<%= request.getAttribute("출판일") %>
	<%= request.getAttribute("책분류") %>
	<%= request.getAttribute("입고일") %>

	
</body>
</html>