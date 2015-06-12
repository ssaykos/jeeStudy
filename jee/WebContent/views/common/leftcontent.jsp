<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Left content Frame</title>
	<style>
	@import url("<%=request.getContextPath()%>/css/leftcontent.css");
	</style>
</head>
<body>
	<header>
		<h1>헤더</h1>
	</header>
	<article>
		<section class="LeftContent">
			<h2>콘텐츠</h2>
		</section>
	</article>
	<aside>
		<section class = "rightSide">
			<h2>사이드바</h2>
		</section>
	</aside>
	<footer>
		<h3>푸터</h3>
	</footer>
</body>
</html>