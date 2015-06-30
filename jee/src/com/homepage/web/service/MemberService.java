package com.homepage.web.service;

import java.util.List;

import com.homepage.web.beans.MemberBean;

public interface MemberService {

	public int join(MemberBean bean);
	
	public String login(String id , String password);
	
	public List<MemberBean> getList();
	
}
