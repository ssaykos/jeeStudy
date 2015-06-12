<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>헬로우 뷰</title>
</head>
<body>
	<div>
		<h2>안녕하세요</h2>
		<mark><%= request.getAttribute("name") %> </mark>
	</div>
</body>
</html>
<!-- 보내는 넘은 <이름 +Form>이고 받는 넘은 <이름> 이다. 관례이고 유지보수의 지름길이다. -->