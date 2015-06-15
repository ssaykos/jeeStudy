package com.homepage.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.beans.KaupBean;
import com.homepage.web.impls.KaupServiceImpl;
/*
 * @Date:someday;
 * @Author:  ;
 * @Story: 키와 몸무게가 입력되면 카우프 지수와 메세지를 웹브라우저에 랜더링 한다.
 */
/**
 * Servlet implementation class kaupController
 */
@WebServlet("/model2/kaup.do")
public class kaupController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		Double weight=Double.parseDouble(request.getParameter("몸무게"));
		Double height=Double.parseDouble(request.getParameter("키"));
		
		KaupServiceImpl ksi = new KaupServiceImpl();
		//KaupBean vo=new KaupBean(height,weight);
		
		int idx=ksi.getKaupIndex(height, weight);
		/*vo.setIdx();
		vo.setMsg();
		String info=vo.toString();*/
		String msg=ksi.getResultMsg();
		request.setAttribute("키", "키는 "+height);
		request.setAttribute("몸무게", "몸무게는 "+weight);
		request.setAttribute("비만도", "비만도는 "+idx);
		request.setAttribute("정보", "너님의 상태"+msg);
		/*request.setAttribute("정보", "총 검사 결과"+info)*/;

		/*RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/Kaup.jsp");
		dispatcher.forward(request, response);*/
		RequestDispatcher dispatcher=request.getRequestDispatcher("/views/model2/Kaup.jsp");
		dispatcher.forward(request, response);
		
	}

}
