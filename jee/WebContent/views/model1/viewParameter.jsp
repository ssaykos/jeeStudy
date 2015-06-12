<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!-- 디렉티브 -->
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.Map" %>
<%
	/* request.setCharacterEncoding("UTF-8"); */
%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>폼값을 받은 페이지</title>
</head>
<body>
<div>
	<b> request.getParameter() 메소드 사용</b><br>
	name 파라미터 = <%= request.getParameter("name") %> <br>
	address 파라미터 = <%= request.getParameter("address") %>
	<p></p>
	<b> requst.getParmeterValues() 메소드 사용</b>
	<%
		String[] values = request.getParameterValues("pet");
		if(values!=null){
			for(int i=0;i<values.length;i++){
				%><br>
			네임 속성(Attribute)의 벨류가 pet 벨류의 <%=i+1%>번째 값 =	<%= values[i] %>
				<%
			}
		}
	%><br><br>
	<b> request.getParameterNames() 메소드 사용</b>
	<% 
		Enumeration parEnumeration = request.getParameterNames();
		while(parEnumeration.hasMoreElements()){
			String name = (String)parEnumeration.nextElement();
			%>
			<br>인풋박스의 네임의 벨류 값들 =<%= name %>
			<%
		}
	%>
	<br><br><b>request.getParameterMap() 메소드 사용</b><br>
	<%
	 Map paraMap = request.getParameterMap();
	String[] nameParam = (String[])paraMap.get("name");
	if(nameParam!=null){
		%>이름=<%=nameParam[0] %>
		<%
	}
	%>
</div>
	
</body>
</html>