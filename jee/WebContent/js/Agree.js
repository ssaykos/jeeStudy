/**
 * Story : 동네북 동의 약관
 */
//var를 붙이지 않으면 스태틱이 되고 var는 그냥 유일한 포괄적인 데이터 타입이라고 봐라 예를 들어 자바라면 그냥 오브젝트 타입이라고 생각하자.
var agreeChk = function() {
	var req = document.form.req.checked;
	var num = 0;
	if (req == true) {
		num = 1;
	}
	if (num == 1) {
		document.form.submit();
	} else {
		alert("개인정보 약관에 동의하셔야 합니다.");
	}
	 function nochk(url){
		   alert("동의하지 않으면 가입하실 수 없습니다");
		  location.href=url;}
}
