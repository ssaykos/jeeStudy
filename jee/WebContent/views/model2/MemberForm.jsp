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
	<script type="text/javascript">
	
	function searchId(){
		window.open("<%= request.getContextPath() %>/member/searchIdForm.do",
				"searchId",
				"scrollbars,toolbar=no,location=no,directories=no,status=no,menubar=yes,width=600,height=500,top=200,left=400");
	}
	function searchPass() {
		window.open("<%= request.getContextPath() %>/member/searchPassForm.do",
				"searchPass",
				"scrollbars,toolbar=no,location=no,directories=no,status=no,menubar=yes,width=600,height=500,top=200,left=400");
	}
	function join(){
		<%-- location.href="<%=request.getContextPath()%>" --%>
		document.frmjoin.submit();
	}
	function login(){
		 if(document.frmlogin.id.value.length==0){
			alert("아이디를 써주세요");
			frmlogin.id.focus();
		}
		if(document.frmlogin.password.value==""){
			alert("비밀번호는 반드시 입력해야 합니다.");
			frmlogin.password.focus();
		}
		document.frmlogin.submit(); 
	}
	</script>
</head>
<body>
	<div>
	
			<form action="<%= request.getContextPath() %>/model2/join.do" method="post" name="frmjoin">
			<fieldset>
			<legend>회원가입</legend>
				<table>
					<tr>
						<td>아이디</td>
						<td><input type="text" name="아이디" placeholder="소수점 첫째자리 까지만 입력하세요."></td>
					</tr>
					<tr>
						<td>비밀번호</td>
						<td><input type="password" name="비밀번호"></td>
					</tr>
					<tr>
						<td>이름</td>
						<td><input type="text" name="이름" placeholder="이름을 입력하세요."></td>
					</tr>
					<tr>
						<td>나이</td>
						<td><input type="text" name="나이" placeholder="나이를 입력하세요."></td>
					</tr>
					<tr>
						<td>주소</td>
						<td><input type="text" name="주소" placeholder="주소를 입력하세요."></td>
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
					<a href="#" onclick="searchId()">아이디 찾기</a>
				</span>
				<span>
					<a href="#" onclick="searchPass()">비밀번호 찾기</a>
				</span>
			</div>
	</div>
</body>
</html>