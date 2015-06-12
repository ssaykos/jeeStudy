<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>테이블 태그 2</title>
	<style type="text/css">
		@import url("<%=request.getContextPath()%>/css/tableTag2.css");
	</style>
</head>
<body>
	<div class="abc">
		<table>
		<tr>
			<th>이름</th>
			<th>나이</th>
			<th>성별</th>
			<th>국적</th>
		</tr>
		<tr>
			<td>홍길동</td>
			<td>20</td>
			<td>남</td>
			<td>한국</td>
		</tr>
		<tr>
			<td>홍매화</td>
			<td>21</td>
			<td>여</td>
			<td>한국</td>
		</tr>
		<tr>
			<td>엘리스</td>
			<td>25</td>
			<td>여</td>
			<td>영국</td>
		</tr>
		<tr>
			<td>스미스</td>
			<td>30</td>
			<td>남</td>
			<td>미국</td>
		</tr>
		<tr>
			<td>다나까</td>
			<td>25</td>
			<td>남</td>
			<td>일본</td>
		</tr>
	</table>
	</div>
	
</body>
</html>