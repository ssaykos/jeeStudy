package com.homepage.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AsideController
 */
@WebServlet({"/book/Aside/BookInfoSearch.lib",
		"/book/Aside/BookGroupSearch.lib",
		"/book/Aside/OverdueBookSearch.lib",
		"/book/Aside/BookInfoAddForm.lib"})
public class AsideController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher=null;
		switch (request.getServletPath()) {
		case "/book/Aside/BookInfoSearch.lib":
			dispatcher = request.getRequestDispatcher("/views/book/BookInfoSearchForm.jsp");
			dispatcher.forward(request, response);
			break;
		case "/book/Aside/BookGroupSearch.lib":
			dispatcher = request.getRequestDispatcher("/views/book/BookGroupSearch.jsp");
			dispatcher.forward(request, response);
			break;
		case "/book/Aside/OverdueBookSearch.lib":
			dispatcher = request.getRequestDispatcher("/views/book/OverdueBookSearch.jsp");
			dispatcher.forward(request, response);
			break;
		case "/book/Aside/BookInfoAddForm.lib":
			dispatcher = request.getRequestDispatcher("/views/book/BookInfoAddForm.jsp");
			dispatcher.forward(request, response);
			break;

		default:
			break;
		}
	}

}
