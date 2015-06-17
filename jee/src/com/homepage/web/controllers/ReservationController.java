package com.homepage.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.impls.ReservationServiceImpl;
import com.homepage.web.service.ReservationService;

/*
 * @date=someday
 * @author=itbank
 * @story= 예약요청을 jsp에서 받아서 처리하는 컨트롤러
 */
/**
 * Servlet implementation class ReservationController
 */
@WebServlet({"/Reservation/checkIn.do"
				,"/Reservation/checkOut.do"
				,"/Reservation/showStatue.do"})
public class ReservationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ReservationService service=new ReservationServiceImpl();
	public static String[][] seat = new String[3][5];
	List<String[][]> seatList = new ArrayList<String[][]>();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int floor=Integer.parseInt(request.getParameter("floor"))-1;
		int row=Integer.parseInt(request.getParameter("row"))-1;
		
		String id=request.getParameter("id");
		
		String path=request.getServletPath();
		String msg="";
		
		
		
		switch (path) {
        case "/Reservation/checkIn.do":
        	
        	seat[floor][row]=id;
        	
        	msg = service.checkIn(floor,row,id);
        	
        	request.setAttribute("msg", msg);
        	request.setAttribute("seat", seat);
        	
        	RequestDispatcher dispatcher1 = request.getRequestDispatcher("/views/model2/ReservationForm.jsp");
    		dispatcher1.forward(request, response);
        	
            break; // 체크인
        case "/Reservation/checkOut.do":
        	
        	seat[floor][row]=null;
        	
        	msg= service.checkOut(floor, row, id);
        	
        	request.setAttribute("msg", msg);
        	request.setAttribute("seat", seat);
        	
        	RequestDispatcher dispatcher2 = request.getRequestDispatcher("/views/model2/ReservationForm.jsp");
    		dispatcher2.forward(request, response);
    		
        	break; // 체크아웃
        case "/Reservation/showStatue.do":
        	String[][]seat=service.showStatus();
        	request.setAttribute("floor", floor);
        	request.setAttribute("row", row);
        	
        	
        	break;
        
        default: service.showStatus(); break;

        }
		
	}

	

}
