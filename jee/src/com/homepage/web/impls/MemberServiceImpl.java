package com.homepage.web.impls;

import java.util.HashMap;
import java.util.Map;

import com.homepage.web.beans.MemberBean;
import com.homepage.web.service.MemberService;



public class MemberServiceImpl implements MemberService{
	MemberBean vo = new MemberBean();
	Map<String,Object> map = new HashMap<String,Object>();
	@Override
	public void join(String id, String password, String name, int age,
			String addr) {
		vo.setAddr(addr);
		vo.setAge(age);
		vo.setId(id);
		vo.setName(name);
		vo.setPassword(password);
		
		map.put("id", vo.getId());
		map.put("password", vo.getPassword());
		map.put("name", vo.getName());
		map.put("age", String.valueOf(vo.getAge()));
		map.put("addr", vo.getAddr());
		
	}
	
	@Override
	public void login(String id, String password) {
		/*
		 * 3.세번째 에러 유형
		 * map.get(id) => 파라미터 유형은 반드시 String 으로 해야 함.
		 * */
		if(map.get("id").equals(id)&& map.get("password").equals(password)){
			System.out.println("환영합니다. "
					+ ""+vo.getAddr()+"에 사는 "+vo.getAge()+"세 "+vo.getName()+"님 ..");
		}else if(!(map.get("id").equals(id))&&map.get("password").equals(password)){
			System.out.println("입력하신 ID 는 존재하지 않거나, 일치하지 않습니다. 다시 입력해 주세요.");
		}else{
			System.out.println("비번이 다릅니다.다시 입력하세요.");
		}
		
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
			
}
