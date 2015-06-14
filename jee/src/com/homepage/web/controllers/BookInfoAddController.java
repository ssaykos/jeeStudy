package com.homepage.web.controllers;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.impls.ServiceCreateImpl;
import com.homepage.web.service.ServiceCreate;

/**
 * Servlet implementation class BookInfoAddController
 */
@WebServlet("/lib/BookInfoAdd.lib")
public class BookInfoAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		Enumeration<String> params = request.getParameterNames();
//		
//		while(params.hasMoreElements()){
//			String paramName = params.nextElement();
//			System.out.println("param : " + paramName + ", value : " + request.getParameter(paramName));
//		}
		SimpleDateFormat date = new SimpleDateFormat("yyyy년 mm월 dd일");
		
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String bTitle=request.getParameter("책제목");
		String author=request.getParameter("저자명");
		String publisher=request.getParameter("출판사");
		String pressDate=request.getParameter("출판일");
		String bGroup=request.getParameter("1차분류")+"/"+request.getParameter("2차분류")+"/"+request.getParameter("3차분류");
		ServiceCreate sc = new ServiceCreateImpl();
		String serialNo=sc.bookSerialNumberGenerator(bGroup);
		request.setAttribute("입고일", "일련번호"+serialNo);
		request.setAttribute("책제목", "<br><br>책 제목 : "+bTitle);
		request.setAttribute("저자명", "<br><br>저자 : "+author);
		request.setAttribute("출판사", "<br><br>출판사 : "+publisher);
		request.setAttribute("출판일", "<br><br>출판일 : "+pressDate);
		request.setAttribute("책분류", "<br><br>책분류 : "+bGroup);
		request.setAttribute("입고일", "<br><br>입고일 : "+date);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/book/BookInfoAdd.jsp");
		dispatcher.forward(request, response);
	}



}
