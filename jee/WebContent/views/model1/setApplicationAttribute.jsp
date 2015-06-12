<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = request.getParameter("name");
	String value = request.getParameter("value");
	
	if(name!=null && value!=null){
		request.setAttribute(name, value);
		//이걸 쓰면 사이트 가 죽을때까지 살아남기때문에 거의 쓰지 않는다. 만약 없애려면 리무브를 해야 한다.
		//어플 세션 리퀘스트 값 다 똑같아야 한다.
	}
%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>JSP 기본 객체의 속성(Attribute) 사용하기</title>
</head>
<body>
	<%
	if(name!=null && value!=null){
		%>
		<%= name %> = <%=value %>
		<%
	}else{
		%>
		application 객체의 속성 설정 안함.
		<%	
	}
	%>
</body>
</html>