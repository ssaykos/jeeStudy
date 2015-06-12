package com.homepage.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.impls.HelloServiceImpl;
import com.homepage.web.service.HelloService;

/**
 * Servlet implementation class NowServlet
 */
@WebServlet({"/name/hello.do","/hi.do"})//이곳에 가상의 경로를 지정할수 있다..//urlPatterns=는 생략가능
public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		/*String path=request.getServletPath();*/
		
		switch (request.getServletPath()) {
		case "/name/hello.do":
			
			gohello(request, response);
			
			break;
			
		case "/hi.do":
			
			gohi(request, response);
			
			break;

		default:
			break;
		}
		/*if(path.equalsIgnoreCase("/name/hello.do")){
			
			gohello(request, response);
			
		}else if(path.equalsIgnoreCase("/hi.do")){
			
			gohi(request, response);
			
		}else{
			
		}*/
		
		
		
	}

	private void gohi(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		request.setAttribute("name", name+"안녕짜샤");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/hi.jsp");
		dispatcher.forward(request, response);
	}

	private void gohello(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HelloService hs = new HelloServiceImpl();
		String msg= hs.greet();
		
		String name = request.getParameter("name");
		request.setAttribute("name", msg+name);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/hello.jsp");
		dispatcher.forward(request, response);
	}

	
}
