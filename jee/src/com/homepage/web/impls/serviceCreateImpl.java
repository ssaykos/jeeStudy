package com.homepage.web.impls;

import com.homepage.web.beans.BookVO;
import com.homepage.web.service.serviceCreate;

public class serviceCreateImpl implements serviceCreate{
	BookVO vo = new BookVO();

	@Override
	public void bookAdditionFull() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bookAdditionSmall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String bookSerialNumberGenerator(String bo
			okCategory) {
		// TODO Auto-generated method stub
	//	int checkCategoryCount=checkCategoryCount(bookCategory);
		
		String bookSerialNumber="";
		String none="";
		String firstCategory=bookCategory.substring(0,bookCategory.indexOf("/"));//문자열의 0번째부터 /가 있는 곳의 문자열까지 잘라서 넣는다.
		String tempSecondCategory=bookCategory.substring(bookCategory.indexOf("/")+1);
		String secondCategory="";//값을 넣기 전 초기화
		String thirdCategory="";//값을 넣기 전 초기화
		secondCategory=tempSecondCategory.contains("/") ? tempSecondCategory : tempSecondCategory.substring(0,tempSecondCategory.indexOf("/"));
		//첫번째 분류 즉 대분류와 "/"표시를 삭제한 값을두번째 tempSecondCategory에  넣은후 tempsecondCategory에  "/" 가 없으면 SecondCategory에 tempSecondCategory를 넣고 "/"가있으면 tempSecondCategory열중 "/" 앞의 문자열을 넣는다.
		thirdCategory=tempSecondCategory.contains("/") ? "" : tempSecondCategory.substring(bookCategory.indexOf("/")+1,tempSecondCategory.length());
		//첫번째 분류 즉 대분류와 "/"표시를 삭제한 값을두번째 tempSecondCategory에  넣은후 tempSecondCategory에 "/" 가 없으면 ThirdCategory에 널값을 넣고  "/"가있으면 tempSecondCategory열중 "/"+1부터 그 뒤의 문자열을 넣는다.
		
		bookSerialNumber=FirstSerialNumberGenerator(firstCategory);
		bookSerialNumber+=SecondSerialNumberGenerator(secondCategory);
		bookSerialNumber+=ThirdSerialNumberGenerator(thirdCategory);
		//이 뒤에 모든 데이터들의 넘버를 같은자리에 같은데이터 값을 가진것들을 검색하면서 카운트를 올리고 +1 해서  += 를 시켜준후 동일 책
		bookSerialNumber+=FourthSerialNumberGenerator(vo.getBookCategory());//맵 해시맵 객체를 생성해서 bookVO를 넣게 되면 파라미터를 한번 더 감싸야 하는 부분?
		//책분류의 값이 동일한 것들을 쭉 비교하면서 동일한 만큼 카운트를 올리고 +1시킨다음 세자릿수 맞춰서 
		bookSerialNumber+=FifthSerialNumberGenerator(vo.getBookTitle(), vo.getBookWriter());//맵 해시맵 객체를 생성해서 bookVO를 넣게 되면 파라미터를 한번 더 감싸야 하는 부분?
		
		return bookSerialNumber;
	}

	@Override
	public String FirstSerialNumberGenerator(String bookCategory) {
		// TODO Auto-generated method stub
		String firstSerialNumber="";
		
		switch (bookCategory) {//참고 교보문고의 분류 참고함
		case "소설": 
			firstSerialNumber="01";
			break;
		case "시":
			firstSerialNumber="02";
			break;
		case "에세이":
			firstSerialNumber="03";
			break;
		case "경제와경영":
			firstSerialNumber="04";
			break;
		case "자기계발":
			firstSerialNumber="05";
			break;
		case "인문":
			firstSerialNumber="06";
			break;
		case "역사":
			firstSerialNumber="07";
			break;
		case "문화":
			firstSerialNumber="08";
			break;
		case "예술":
			firstSerialNumber="09";
			break;
		case "종교":
			firstSerialNumber="10";
			break;
		case "사회":
			firstSerialNumber="11";
			break;
		case "과학":
			firstSerialNumber="12";
			break;
		case "기술":
			firstSerialNumber="13";
			break;
		case "컴퓨터":
			firstSerialNumber="14";
			break;
		case "참고서":
			firstSerialNumber="15";
			break;
		case "수험서"://외국어탑재
			firstSerialNumber="16";
			break;
		case "가정":
			firstSerialNumber="17";
			break;
		case "건강":
			firstSerialNumber="18";
			break;
		case "취미":
			firstSerialNumber="19";
			break;
//		case "여행":
//			firstSerialNumber="20";
//			break;
//		case "요리":
//			firstSerialNumber="01";
//			break;
		case "잡지"://요리 여행 만화 편입
			firstSerialNumber="20";
			break;
		case "":
			firstSerialNumber="21";
			break;
//		case "만화":
//			firstSerialNumber="01";
//			break;

		default:
			firstSerialNumber="에러..";
			break;
		}
		
		return firstSerialNumber;
	}

	@Override
	public String SecondSerialNumberGenerator(String bookCategory) {
		// TODO Auto-generated method stub
		String secondSerialNumber="";
		
		switch (bookCategory) {
		case "고전소설": case "시조": case "인물에세이":
			secondSerialNumber="01";
			break;

		case "세계문학": case "현대시": case "지혜에세이":
			secondSerialNumber="02";
			break;

		case "추리소설": case "사랑시": case "테마에세이":
			secondSerialNumber="03";
			break;

		case "테마소설": case "한시": case "명언에세이":
			secondSerialNumber="04";
			break;

		case "역사소설": case "명시모음": case "상식에세이":
			secondSerialNumber="05";
			break;

		case "판타지소설": case "그림시": case "인생에세이":
			secondSerialNumber="06";
			break;

		case "무협소설": case "다른나라시": case "명상에세이":
			secondSerialNumber="07";
			break;

		case "퓨전소설": case "감성에세이":
			secondSerialNumber="08";
			break;

		case "탈무드에세이":
			secondSerialNumber="09";
			break;

		case "나라별에세이":
			secondSerialNumber="10";
			break;

		case "":
			secondSerialNumber="11";
			break;

		case "":
			secondSerialNumber="12";
			break;


		default:
			break;
		}
		
		return secondSerialNumber;
	}

	@Override
	public String ThirdSerialNumberGenerator(String bookCategory) {
		// TODO Auto-generated method stub
		String thirdSerialNumber="";
		
		
		return thirdSerialNumber;
	}

	@Override
	public String FourthSerialNumberGenerator(String bookCategory) {
		// TODO Auto-generated method stub
		String fourthSerialNumber="";
		
		return fourthSerialNumber;
	}

	@Override
	public String FifthSerialNumberGenerator(String bookTitle,
			String bookWriter) {
		// TODO Auto-generated method stub
		String fifthSerialNumber="";
		
		return fifthSerialNumber;
	}


}
