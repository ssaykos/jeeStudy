<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	final int floor;
    final int room;
    String[][] name = new String[3][5];
	 for (int i = 0; i < name.length; i++) {
         for (int j = 0; j < name[i].length; j++) {
             if (name[i][j] == null) {
                %> <%= i+1 %>0<%= j+1 %> 호 □ <%
             } else {
               %><%= i+1 %>0<%= j+1 %> 호 ■ ${name[i][j]} <%
             }
         }
         %><br>
         <%
     }
	%>
</body>
</html>