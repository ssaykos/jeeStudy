<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>회원 정보 관리 페이지</title>
</head>
<body>
	<fieldset>
			<legend>회원가입</legend>
				<table>
					<tr>
						<td>아이디</td>
						<td> <%= request.getAttribute("아이디") %> 야 어서와</td>
					</tr>
					
					<tr>
						<td>이름</td>
						<td> <%= request.getAttribute("이름") %>   님</td>
					</tr>
					<tr>
						<td>나이</td>
						<td> <%= request.getAttribute("나이") %>  세</td>
					</tr>
					<tr>
						<td>주소</td>
						<td> <%= request.getAttribute("주소") %> </td>
					</tr>
					
				</table>
				</fieldset>
			</form>
		
</body>
</html>