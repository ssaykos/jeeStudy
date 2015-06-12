<!-- HTML -->
<%/*asd*/
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책정보 입력페이지</title>
<style>
	@import url("book.css");
</style>
</head>
<body>
<table class="tableClass">
	<tr class="trClass">
		<td class="tdClass">필  드</td>
		<td class="tdClass">입력값</td>
	</tr>
	<tr class="trClass">
		<td class="tdClass2">책제목<!-- (string) --></td>
		<td class="tdClass2">
			<input type = "text" style="width:350px"></td>
	</tr>
	<tr class="trClass">
		<td class="tdClass2">저자명<!-- (string) --></td>
		<td class="tdClass2">
			<input type = "text" style="width:350px"></td>
	</tr>
	<tr class="trClass">
		<td class="tdClass2">출판사<!-- (string) --></td>
		<td class="tdClass2">
			<input type = "text" style="width:350px"></td>
	</tr>
	<tr class="trClass">
		<td class="tdClass2">책분류<!-- (string) --></td>
		<td class="tdClass2">
			<input type = "text" style="width:350px"></td>
	</tr>
	<tr class="trClass">
		<td class="tdClass2">책일련번호<!-- (int) --></td>
		<td class="tdClass2">
			<input type = "text" style="width:350px"></td>
	</tr>
	<tr class="trClass">
		<td class="tdClass2">빌린횟수<!-- (int) --></td>
		<td class="tdClass2">
			<input type = "text" style="width:350px"></td>
	</tr>
	<tr class="trClass">
		<td class="tdClass2">출간일<!-- (Date) --></td>
		<td class="tdClass2">
			<input type = "text" style="width:350px"></td>
	</tr>
	<tr class="trClass">
		<td class="tdClass2">대여일<!-- (Date) --></td>
		<td class="tdClass2">
			<input type = "text" style="width:350px"></td>
	</tr>
	<tr class="trClass">
		<td class="tdClass2">잔여유무<!-- (boolean) --></td>
		<td class="tdClass2">
			<input type = "text" style="width:350px"></td>
	</tr>
	<tr class="trClass">
		<td class="tdClass2">빌림신청유무<!-- (boolean) --></td>
		<td class="tdClass2">
			<input type = "text" style="width:350px"></td>
	</tr>
	<tr class="trClass">
		<td class="tdClass2">연장유무<!-- (boolean) --></td>
		<td class="tdClass2">
			<input type = "text" style="width:350px"></td>
	</tr>
</table>
</body>
</html>