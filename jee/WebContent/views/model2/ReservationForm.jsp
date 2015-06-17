<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div>
		<form action="">
			<fieldset>
					<legend>예약</legend>
					<ol>
						<li>
							예약취소는 영화시작 2시간 전까지만 가능합니다.
						</li>
						<li>
							<label for="wanted">원하는 예약일</label>
							<input id="wanted" name="wanted" type="date">
							<input type="time" name="time" id="time">
						</li>
					</ol>
				</fieldset>
				<input type="submit" value="전 송">
		</form>
	</div>
	<hr style="width: 400px; height: 20px; border-color: black;">
	<div style="margin: 0 auto; text-align: center;">
	${msg}
	<%
	String[][] seat = new String[3][5];
	if(request.getAttribute("seat")==null){
	    
    String[][] defaultSeat = new String[3][5];
        
	 for (int i=0 ; i < defaultSeat.length; i++) {
         for (int j=0 ; j < defaultSeat[i].length; j++) {
             if (defaultSeat[i][j] == null) {
                %><%= i+1 %>-<%= j+1 %> 호 □ <%
             } else {
               %><%= i+1 %>-<%= j+1 %> 호 ■  <%
             }
         }
         %> <br> <%
     }
	%>값안넘어옴..<%
	}else{
		/* int floor=Integer.parseInt((String)request.getAttribute("floor"));
	    int row=Integer.parseInt((String)request.getAttribute("row")); */
	    
	    seat = (String[][])request.getAttribute("seat");
	    	    	    
		 for (int i=0 ; i < seat.length; i++) {
	         for (int j=0 ; j < seat[i].length; j++) {
	             if (seat[i][j] == null) {
	                %><%= i+1 %>-<%= j+1 %> 호 □ <%
	             } else {
	               %><%= i+1 %>-<%= j+1 %> 호 ■  <%
	             }
	         }
	         %> <br> <%
	     }
		%>경축..드뎌 값 넘어옴<%
	}
	 %>
	</div>
	<div>
		<form action="<%= request.getContextPath() %>/Reservation/checkIn.do">
		<fieldset>
			<legend>영화관좌석예매</legend>
				<ol>
					<li>
						<label for="prod">좌석</label>
						<input type="text" name="id" id="id" placeholder="아이디를 입력해주세요" />
					</li>
					<li>
						<label for="num">열번호</label>
						<input type="number" id="floor" name="floor" min="1" max="3" value="1" />
					</li>
					<li>
						<label for="num">행번호</label>
						<input type="number" id="row" name="row" min="1" max="5" value="1" />
					</li>
				</ol>
		</fieldset>
		
		<input type="submit" value="등록">
	</form>
	</div>
	<div>
		<form action="<%= request.getContextPath() %>/Reservation/checkOut.do">
		<fieldset>
			<legend>영화관 좌석 예약 취소</legend>
				<ol>
					<li>
						<label for="prod">좌석</label>
						<input type="text" name="id" id="id" placeholder="아이디를 입력해주세요" />
					</li>
					<li>
						<label for="num">열번호</label>
						<input type="number" id="floor" name="floor" min="1" max="3" value="1" />
					</li>
					<li>
						<label for="num">행번호</label>
						<input type="number" id="row" name="row" min="1" max="5" value="1" />
					</li>
				</ol>
		</fieldset>
		
		<input type="submit" value="등록">
	</form>
	</div>
</body>
</html>