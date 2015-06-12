<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>헬로</title>
</head>
<body>
	<div>
		<form action="<%= request.getContextPath() %>/name/hello.do"><!-- 서블릿의 가상 경로를 맞춰줘야 한다. -->
			<input type="text" id="name" name="name"/>
			<input type="submit" value="전 송"/>
		</form>
		<p>
		<form action="<%= request.getContextPath() %>/hi.do"><!-- 서블릿의 가상 경로를 맞춰줘야 한다. -->
			<input type="text" id="name" name="name"/>
			<input type="submit" value="전 송"/>
		</form>
	</div>
	
	
</body>
</html>