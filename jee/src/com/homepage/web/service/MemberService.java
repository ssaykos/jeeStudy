package com.homepage.web.service;

public interface MemberService {

	public void join(String id, String password, String name, int age , String addr);
	
	public void login(String id , String password);
	
}
