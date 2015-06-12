<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>request 객체</title>
</head>
<body>
	<!-- 
		request 기본 객체가 제공하는 기능
			1. 브라우저 정보 읽기
			2. 서버정보 읽기
			3. 파라미터 읽기 ★★★★
			4. 헤더 읽기
			5. 쿠키 읽기
			6. 속성 처리 기능 ★★★★★
	
	 -->	
	 
	 컨텍스트 경로(프로젝트 폴더 이름) =<%= request.getContextPath() %><br>
	 요청 url(컨텍스트 경로부터 해당 파일이 있는 위치) = <%= request.getRequestURI() %>
</body>
</html>