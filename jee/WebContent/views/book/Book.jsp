<!-- HTML -->
<%/*asd*/
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책정보 입력페이지</title>
<style>
	@import url("<%= request.getContextPath()%>/css/book/Book.css");
</style>
</head>
<body>
<div class="wrap">
	<table class="tableClass">
		<tr class="trClass">
			<td class="tdClass">필  드</td>
			<td class="tdClass">입력값</td>
		</tr>
		<tr class="trClass">
			<td class="tdClass2">책제목<!-- (string) --></td>
			<td class="tdClass2">
				<input type = "text" style="width:350px"></td>
		</tr>
		<tr class="trClass">
			<td class="tdClass2">저자명<!-- (string) --></td>
			<td class="tdClass2">
				<input type = "text" style="width:350px"></td>
		</tr>
		<tr class="trClass">
			<td class="tdClass2">출판사<!-- (string) --></td>
			<td class="tdClass2">
				<input type = "text" style="width:350px"></td>
		</tr>
		<tr class="trClass">
			<td class="tdClass2">책분류<!-- (string) --></td>
			<td class="tdClass2">
				<select name="1thbookGroup" id="1thbookGroup"  size="1" >
					<option value="default">---1차 분류---</option>
					<option value="소설">소  설</option>
					<option value="시">  시  </option>
					<option value="수필">수  필</option>
					<option value="경제와경영">경제와경영</option>
					<option value="자기계발">자기계발</option>
					<option value="인문">인  문</option>
					<option value="역사">역  사</option>
					<option value="문화">문  화</option>
					<option value="예술">예  술</option>
					<option value="종교">종  교</option>
					<option value="사회">사  회</option>
					<option value="과학">과  학</option>
					<option value="기술">기  술</option>
					<option value="컴퓨터">컴퓨터</option>
					<option value="참고서">참고서</option>
					<option value="수험서">수험서</option>
					<option value="가정">가  정</option>
					<option value="건강">건  강</option>
					<option value="취미">취  미</option>
					<option value="잡지">잡  지</option>
					<option value="default">default</option>
				</select>
				<button type="button" >선택</button>
				<select name="2thbookGroup" id="2thbookGroup"  size="1" >
					<option value="default">---2차 분류---</option>
					<option value="default">---소 설---</option>
					<option value="고전소설">고전소설</option>
					<option value="세계소설">세계소설</option>
					<option value="추리소설">추리소설</option>
					<option value="테마소설">테마소설</option>
					<option value="역사소설">역사소설</option>
					<option value="판타지소설">판타지소설</option>
					<option value="무협소설">무협소설</option>
					<option value="퓨전소설">퓨전소설</option>
					<option value="default">--- 시 ---</option>
					<option value="시조">시조</option>
					<option value="현대시">현대시</option>
					<option value="사랑시">사랑시</option>
					<option value="한시">한시</option>
					<option value="명시모음">명시모음</option>
					<option value="그림시">그림시</option>
					<option value="default">--- 수필 ---</option>
					<option value="인물수필">인물수필</option>
					<option value="지혜수필">지혜수필</option>
					<option value="테마수필">테마수필</option>
					<option value="명언수필">명언수필</option>
					<option value="상식수필">상식수필</option>
					<option value="인생수필">인생수필</option>
					<option value="명상수필">명상수필</option>
					<option value="감성수필">감성수필</option>
					<option value="탈무드수필">탈무드수필</option>
					<option value="나라별수필">나라별수필</option>
					<option value="default">default</option>
				</select>
				<button type="button" >선택</button>
				<select name="2thbookGroup" id="2thbookGroup"  size="1" >
					<option value="default">---3차 분류---</option>
					<option value="default">default</option>
				</select>
				<button type="button" >선택</button>
		</tr>
		<tr class="trClass">
			<td class="tdClass2">책일련번호<!-- (int) --></td>
			<td class="tdClass2">
				<input type = "text" style="width:350px"></td>
		</tr>
		<tr class="trClass">
			<td class="tdClass2">빌린횟수<!-- (int) --></td>
			<td class="tdClass2">
				<input type = "text" style="width:350px"></td>
		</tr>
		<tr class="trClass">
			<td class="tdClass2">출간일<!-- (Date) --></td>
			<td class="tdClass2">
				<input type = "text" style="width:350px"></td>
		</tr>
		<tr class="trClass">
			<td class="tdClass2">대여일<!-- (Date) --></td>
			<td class="tdClass2">
				<input type = "text" style="width:350px"></td>
		</tr>
		<tr class="trClass">
			<td class="tdClass2">잔여유무<!-- (boolean) --></td>
			<td class="tdClass2">
				<input type = "text" style="width:350px"></td>
		</tr>
		<tr class="trClass">
			<td class="tdClass2">빌림신청유무<!-- (boolean) --></td>
			<td class="tdClass2">
				<input type = "text" style="width:350px"></td>
		</tr>
		<tr class="trClass">
			<td class="tdClass2">연장유무<!-- (boolean) --></td>
			<td class="tdClass2">
				<input type = "text" style="width:350px"></td>
		</tr>
	</table>
</div>
</body>
</html>