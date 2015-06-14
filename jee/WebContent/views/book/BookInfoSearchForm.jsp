<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>책정보 검색 페이지</title>
</head>
<body>
	<div>
		<div>
			<form action="<%= request.getContextPath() %>/lib/BookInfoSearch.lib"></form>
			<table>
				<tr>
					<td>
						<select name="검색분류" size="1">
							<option value="식별번호">책고유번호</option><!-- (쿼리로 관리자만 보이게 하기) -->
							<option value="책제목">도서명</option>
							<option value="저자명">저자</option>
							<option value="출판사">출판사</option>
						</select>
					</td>
					<td><input name="검색" type="search" placeholder="검색"></td>
					<td><input type="submit" value="검 색"></td>
				</tr>
			</table>
		</div>
	</div>
	
</body>
</html>