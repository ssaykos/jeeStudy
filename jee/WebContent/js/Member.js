/**
 * @Date : 2015.06.18
 * @Author : 박정관 셈에게 배우면서 김진선이 적음 ㅋ
 * @Stroy : member.jsp , memberform.jsp관련
 */

	var searchId = function(url){
		window.open(url,
				"searchId",
				"scrollbars,toolbar=no,location=no,directories=no,status=no,menubar=yes,width=600,height=500,top=200,left=400");
	}
	var searchPass = function(url) {
		window.open(url,
				"searchPass",
				"scrollbars,toolbar=no,location=no,directories=no,status=no,menubar=yes,width=600,height=500,top=200,left=400");
	}
	var join = function(){
		// location.href="<%=request.getContextPath()%>" 
		document.frmjoin.submit();
	}
	var login = function(){
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