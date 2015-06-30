<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>회원가입 및 로그인</title>
	<style>
		@import url("<%= request.getContextPath() %>/css/koup.css");
	</style>
	
</head>
<body>
	<div>
		<form action="<%= request.getContextPath() %>/model2/join.do" method="post" name="frmjoin">
			<fieldset>
			<legend>회원가입</legend>
				<table>
					<tr>
						<td>아이디</td>
						<td><input type="text" name="아이디" id="id" placeholder="소수점 첫째자리 까지만 입력하세요."></td>
					</tr>
					<tr>
						<td>비밀번호</td>
						<td><input type="password" id="password" name="비밀번호"></td>
					</tr>
					<tr>
						<td>이름</td>
						<td><input type="text" name="이름" id="name" placeholder="이름을 입력하세요."></td>
					</tr>
					<tr>
						<td>나이</td>
						<td><input type="text" name="나이" id="age" placeholder="나이를 입력하세요."></td>
					</tr>
					<tr>
						<td>이메일 주소</td>
						<td><input type="text" name="이메일주소" id="email"placeholder="abc@dfg.com"></td>
					</tr>
					<tr>
						<td colspan="2">
						<input type="submit" name="전송" value="전송">
						<img src="<%= request.getContextPath() %>/images/btnjoin.png" style="cursor: pointer" alt="" onclick="return join()">
						</td>
					</tr>
				</table>
			</fieldset>
		</form>
		<form action="<%= request.getContextPath() %>/model2/login.do" method="post" name="frmlogin">
			<fieldset>
			<legend>로그인</legend>
				<table>
					<tr>
						<td>아이디</td>
						<td><input type="text" id="id" name="아이디" placeholder="아이디 입력하세요."></td>
					</tr>
					<tr>
						<td>비밀번호</td>
						<td><input type="password" id="password" name="비밀번호"></td>
					</tr>
					<tr>
						<td colspan="2">
						<input type="submit" name="전송" value="전송">
						<img src="<%= request.getContextPath() %>/images/btnlogin.png" style="cursor: pointer" alt="" onclick="return login()">
						</td>
					</tr>
				</table>
				</fieldset>
			</form>
			<div>
				<span>
					<a href="#" onclick="searchId('<%= request.getContextPath() %>/member/searchIdForm.do')">아이디 찾기</a>
				</span>
				<span>
					<a href="#" onclick="searchPass('<%= request.getContextPath() %>/member/searchPassForm.do')">비밀번호 찾기</a>
				</span>
			</div>
	</div>
	 <script type="text/javascript" src="<%=request.getContextPath()%>/js/member.js"></script> 
</body>
</html>