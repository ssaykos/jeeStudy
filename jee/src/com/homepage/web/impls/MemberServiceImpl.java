package com.homepage.web.impls;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.homepage.web.beans.MemberBean;
import com.homepage.web.beans.MemberDAO;
import com.homepage.web.service.MemberService;



public class MemberServiceImpl implements MemberService{
	/*
	 * DAO 가 싱글톤 패턴으로 단 하나의 인스턴스만 리턴한다면
	 * 그것을 사용하는 서비스도 싱글톤으로 구성해야 한다.
	 * 그러지 않으면 다중 접속 상태에서 하나의 인스턴스만 사용하게되어 
	 * 접속 불량 현상이 발생한다.
	 */
	private static MemberService service = new MemberServiceImpl();
	private MemberServiceImpl(){}
	public static MemberServiceImpl getInstance() {
		return (MemberServiceImpl) service;
	}
	MemberBean vo = new MemberBean();
	Map<String,Object> map = new HashMap<String,Object>();
	@Override
	public int join(MemberBean bean1) {
		 return MemberDAO.getInstance().join(bean1);
	}
	
	@Override
	public String login(String id, String password) {
		/*
		 * 3.세번째 에러 유형
		 * map.get(id) => 파라미터 유형은 반드시 String 으로 해야 함.
		 * */
		String msg="";
		if(map.get("id").equals(id)&& map.get("password").equals(password)){
			msg="환영합니다. "
					+ ""+vo.getAddr()+"에 사는 "+vo.getAge()+"세 "+vo.getName()+"님 ..";
		}else if(!(map.get("id").equals(id))&&map.get("password").equals(password)){
			msg="입력하신 ID 는 존재하지 않거나, 일치하지 않습니다. 다시 입력해 주세요.";
		}else{
			msg="비번이 다릅니다.다시 입력하세요.";
		}
		return msg;
		
	}
/*	public String login(String id, String password) {
		
		 * 3.세번째 에러 유형
		 * map.get(id) => 파라미터 유형은 반드시 String 으로 해야 함.
		 * 
		String msg="";
		if(map.get("id").equals(id)&& map.get("password").equals(password)){
			System.out.println("환영합니다. "
					+ ""+vo.getAddr()+"에 사는 "+vo.getAge()+"세 "+vo.getName()+"님 ..");
		}else if(!(map.get("id").equals(id))&&map.get("password").equals(password)){
			System.out.println("입력하신 ID 는 존재하지 않거나, 일치하지 않습니다. 다시 입력해 주세요.");
		}else{
			System.out.println("비번이 다릅니다.다시 입력하세요.");
		}
		re
	}*/

	
	@Override
	public List<MemberBean> getList() {
		MemberDAO dao = MemberDAO.getInstance();
		return dao.getList();
	}
			
}
