package com.homepage.web.controllers;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.beans.BookBean;

/**
 * Servlet implementation class BookInfoSearch
 */
@WebServlet("/lib/BookInfoSearch.lib")
public class BookInfoSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Map<String, BookBean> map = new HashMap<String, BookBean>();
	Date a = new Date();
	BookBean[] bean = { new BookBean("사람은 무엇으로 사는가?", "레프 니콜라예비치 톨스토이", "더클래식", "소설/세계소설/러시아", a , "0102030021"),
						new BookBean("사람은 무엇으로 사는가?", "레프 니콜라예비치 톨스토이", "더클래식", "소설/세계소설/러시아", a , "0102030022"),
						new BookBean("부활", "레프 니콜라예비치 톨스토이", "더클래식", "소설/세계소설/러시아", a , "0102030011"),
						new BookBean("등대지기", "조창인", "밝은세상", "소설/테마소설/로맨스소설", a , "0104010022"),
						new BookBean("호질", "박지원", "자필", "소설/고전소설/한국고전", a , "0101010011"),
						new BookBean("양반전", "박지원", "자필", "소설/고전소설/한국고전", a , "0101010021") };
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String name = request.getParameter("검색분류");
				
		String a="no.\t 책 제목 \t\t\t\t\t 저자명 \t\t 출판사 \t\t 식별번호 \n";
		
		switch (name) {
		case "식별번호":
			for (int j = 0; j < bean.length; j++) {
				map.put("식별번호",bean[j]);		
			}
			
			for (int i = 0; i < map.size(); i++) {
				if(request.getParameter("검색").equals(map.get("식별번호"))){
					a+=""+(i+1)+"\t"+map.get("식별번호").getbTitle();
					a+="\t\t"+map.get("식별번호").getAuthor();
					a+="\t"+map.get("식별번호").getPublisher();
					a+="\t"+map.get("식별번호").getSerialNo();
					a+="\n";
				}else{
					if(i == map.size()-1 && a.equals("no.\t 책 제목 \t\t\t\t\t 저자명 \t\t 출판사 \t\t 식별번호 \n")){
						a="검색결과가 없습니다.";
					}
				}
			}
			break;
		case "책제목":
			for (int j = 0; j < bean.length; j++) {
				map.put("책제목",bean[j]);		
			}
			
			for (int i = 0; i < map.size(); i++) {
				if(request.getParameter("검색").equals(map.get("책제목"))){
					a+=""+(i+1)+"\t"+map.get("식별번호").getbTitle();
					a+="\t\t"+map.get("식별번호").getAuthor();
					a+="\t"+map.get("식별번호").getPublisher();
					a+="\t"+map.get("식별번호").getSerialNo();
					a+="\n";
				}else{
					if(i == map.size()-1 && a.equals("no.\t 책 제목 \t\t\t\t\t 저자명 \t\t 출판사 \t\t 식별번호 \n")){
						a="검색결과가 없습니다.";
					}
				}
			}		
			break;
		case "저자명":
			for (int j = 0; j < bean.length; j++) {
				map.put("저자명",bean[j]);		
			}
			
			for (int i = 0; i < map.size(); i++) {
				if(request.getParameter("검색").equals(map.get("저자명"))){
					a+=""+(i+1)+"\t"+map.get("식별번호").getbTitle();
					a+="\t\t"+map.get("식별번호").getAuthor();
					a+="\t"+map.get("식별번호").getPublisher();
					a+="\t"+map.get("식별번호").getSerialNo();
					a+="\n";
				}else{
					if(i == map.size()-1 && a.equals("no.\t 책 제목 \t\t\t\t\t 저자명 \t\t 출판사 \t\t 식별번호 \n")){
						a="검색결과가 없습니다.";
					}
				}
			}
			break;
		case "출판사":
			for (int j = 0; j < bean.length; j++) {
				map.put("출판사",bean[j]);		
			}
			for (int i = 0; i < map.size(); i++) {
				if(request.getParameter("검색").equals(map.get("출판사"))){
					a+=""+(i+1)+"\t"+map.get("식별번호").getbTitle();
					a+="\t\t"+map.get("식별번호").getAuthor();
					a+="\t"+map.get("식별번호").getPublisher();
					a+="\t"+map.get("식별번호").getSerialNo();
					a+="\n";
				}else{
					if(i == map.size()-1 && a.equals("no.\t 책 제목 \t\t\t\t\t 저자명 \t\t 출판사 \t\t 식별번호 \n")){
						a="검색결과가 없습니다.";
					}
				}
			}
			break;

		default:
			break;
		}
		

		request.setAttribute("검색분류", a);

		RequestDispatcher dispatcher=request.getRequestDispatcher("/views/book/BookInfoSearch.jsp");
		dispatcher.forward(request, response);
		
		
		
	}

}
