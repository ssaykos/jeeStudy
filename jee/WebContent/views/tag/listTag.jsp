<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>리스트 태그</title>
	<style>
		@import url("<%=request.getContextPath()%>/css/listTag.css");
	</style>
</head>
<body>
	<!-- ul>li*n -->
	<ul class="multi">
		<li>&nbsp;&nbsp;리스트 스타일</li> 
			<ul>
				<li>리스트 스타일</li>
				<ul>
					<li>&nbsp;&nbsp;HTML or CSS</li>
					<li>&nbsp;&nbsp;상대경로 -> 현재의 위치를 기준으로 자원 경로를 표시 하는 방식</li>
					<li>&nbsp;&nbsp;./ 현재 폴더(생략가능) ../ 한개 상위폴더</li>
					<li>&nbsp;&nbsp;../../ 두개 상위 폴더 ../../../ 세개 상위 폴더</li>
				</ul>
				<li>JSP</li>
				<li>절대경로 -> 드라이브 부터나 http등 주소의 시작?근원?부터 해당부터 전부를 적은것</li>
				<li>ex)c:/asd/dsf/aa.html  or http://ssykos.com/index.html </li>
			</ul>
		<li>그러한 것이다 것이다 것이다..</li>
		<li>그러한 것이다 것이다 것이다..</li>
		<li>그러한 것이다 것이다 것이다..</li>
	</ul>
</body>
</html>