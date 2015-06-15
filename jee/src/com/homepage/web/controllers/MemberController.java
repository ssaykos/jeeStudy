package com.homepage.web.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.beans.MemberBean;
import com.homepage.web.impls.HelloServiceImpl;
import com.homepage.web.impls.MemberServiceImpl;
import com.homepage.web.service.HelloService;
/*
 * Date :someday;
 * Author : ssaykos@naver.com;
 * Story : 
 * 회원가입과 로그인을 담당 하는 컨트롤러
 */
/**
 * Servlet implementation class MemberController
 */
import com.homepage.web.service.MemberService;
@WebServlet({"/model2/join.do","/model2/login.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	Map<String, Object> map = new HashMap<String, Object>();
	MemberBean bean = new MemberBean();
    MemberService service =new MemberServiceImpl();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubswitch (request.getServletPath()) {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		switch (request.getServletPath()) {
		case "/model2/join.do":
			
			gojoin(request, response);
			
			break;
			
		case "/model2/login.do":
			
			gologin(request, response);
			
			break;

		default:
			break;
		}
		
		
	}

	private void gologin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id=request.getParameter("아이디");
		String password=request.getParameter("비밀번호");
		String msg="";
		
		if (map.get("id").equals(id)&&map.get("password").equals(password)) {
			
			String name = (String) map.get("name");
			String age = String.valueOf(bean.getAge());
			String addr=(String) map.get("addr");
			
			msg+="로그인이 되었단다.";
			
			request.setAttribute("메세지","어서 드루 온나~"+id+"야 넌"+msg);
			request.setAttribute("아이디", id);
			request.setAttribute("비밀번호", password);
			request.setAttribute("나이", age);
			request.setAttribute("이름", name);
			request.setAttribute("주소", addr);
			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/Member.jsp");
			dispatcher.forward(request, response);
			
		}else if(map.get("id").equals(id)){
			
			msg+="비밀번호를 잘못 입력하셨습니다.";
			request.setAttribute("메세지", msg);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/LoginFail.jsp");
			dispatcher.forward(request, response);
			
		}else if(map.get("password").equals(password)){
			
			msg+="아이디를 잘못 입력하셨습니다..";
			request.setAttribute("메세지", msg);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/LoginFail.jsp");
			dispatcher.forward(request, response);
			
		}else{
			
			msg+="아이디와 비밀번호 둘다 잘못 입력하셨습니다.";
			request.setAttribute("메세지", msg);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/LoginFail.jsp");
			dispatcher.forward(request, response);
			
		}
		
		
		
	}

	private void gojoin(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String id=request.getParameter("아이디");
		String password=request.getParameter("비밀번호");
		String name=request.getParameter("이름");
		String age=request.getParameter("나이");
		String address=request.getParameter("주소");
		
		bean.setId(id);
		bean.setPassword(password);
		bean.setName(name);
		bean.setAge(Integer.parseInt(age));
		bean.setAddr(address);
		
		/*service.join(id, password, name, Integer.parseInt(age), address);*/
		
		map.put("id", bean.getId());
		map.put("password", bean.getPassword());
		map.put("name", bean.getName());
		map.put("age", String.valueOf(bean.getAge()));
		map.put("addr", bean.getAddr());
		
//		request.setAttribute("아이디", id);
//		request.setAttribute("비밀번호", password);
//		request.setAttribute("이름", name);
//		request.setAttribute("나이", age);
//		request.setAttribute("주소", address); 
//회원가입후 확인을 위해 먼저 보여줘야 하는줄 알았다 회원가입 후 보여줄 필요 없단다.
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/MemberForm.jsp");
		dispatcher.forward(request, response);
	}

	
}
