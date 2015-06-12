<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat"%>
<!-- @디렉티브 -->
<%!
	public int multiply(int a,int b){
	int c = a*b;
	return c;
}
%>
<!-- !선언부 -->

<% 
	Date now = new Date();
	SimpleDateFormat asd = new SimpleDateFormat("yyyy-MM-dd E요일 a hh:mm:ss");//요일 HH 24시간 hh 12시간
%>
<!-- 선언부 -->
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>chap02/now.jsp</title>
</head>
<body>
	현재시간 : 
	<%= asd.format(now) %>
	<p>
	10*25=<%=multiply(10, 25) %>
	<!-- =표현식 -->
	<!-- 
	JSP에서 제공하는 것들
	1. 디렉티브 -> JSP 페이지에 대한 설정 정보를 지정할때 사용 @로 시작하는 정보 
	2. 스크립트
		(1) 스크립트릿 -> 자바 코드를 실행한다. 
		(2) 표현식 -> = 로 값을 출력한다.
		(3) 선언부 -> 자바 메소드를 만든다
	3. 표현언어(EL:Expression Language)
	4. 기본객체
	5. JSTL
	
	 -->
</body>
</html>