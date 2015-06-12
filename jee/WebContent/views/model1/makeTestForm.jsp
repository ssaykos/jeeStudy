<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>make TestForm</title>
</head>
<body>
<div>

<!-- 
Get방식과 Post 방식의 차이점은 전송 방식에 있다
get은 url의 뒷 부분에 물음표와 함께 파라미터를 붙여서 전송한다.
get 방식은 웹 브라우저, 웹서버 또는 웹 컨테이너(WAS - 톰켓 제우스..) 에 따라 
전송할 수 있는 길이에 제한이 있다.
post 방식은 데이터 영역을 이용해서 데이터를 전송하기 때문에 웹브라우저나 웹서버 들에 상관없이
전송할 수 있는 파라미터 길이에 제한이 없다. (서버 메모리를 점유한다) -ex) 파일전송
 -->
	폼에 데이터를 입력한 후 " 전송 " 버튼을 클릭하세요.
	<form action="viewParameter.jsp" method="get"><!-- 양이 너무 많거나 보안이 요하는 것은 post // 간단하고 빠르게 할것은 get 이다.(문자양이 한정되 있으나 쿠키 사용을 지원하기 때문에 빠르다.) -->
		이름 : <input type="text" name="name" size="10"/><br>
		주소 : <input type="text" name="address"  size="30" /><br>
		좋아하는 동물
		<input type="checkbox" name="pet" value="dog"> 강아지 
		<input type="checkbox" name="pet" value="cat"> 고양이 
		<input type="checkbox" name="pet" value="pig"> 돼지
		<br>
		<input type="submit" value="전송"> 
	</form>
</div>
</body>
</html>