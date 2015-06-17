package com.homepage.web.controllers;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import com.homepage.web.beans.BookBean;

public class TestBookSearch {

	
	public static void main(String[] args) {
		Date a = new Date();
		BookBean[] bean = { new BookBean("사람은 무엇으로 사는가?", "레프 니콜라예비치 톨스토이", "더클래식", "소설/세계소설/러시아", a , "0102030021"),
							new BookBean("사람은 무엇으로 사는가?", "레프 니콜라예비치 톨스토이", "더클래식", "소설/세계소설/러시아", a , "0102030022"),
							new BookBean("부활", "레프 니콜라예비치 톨스토이", "더클래식", "소설/세계소설/러시아", a , "0102030011"),
							new BookBean("등대지기", "조창인", "밝은세상", "소설/테마소설/로맨스소설", a , "0104010022"),
							new BookBean("호질", "박지원", "자필", "소설/고전소설/한국고전", a , "0101010011"),
							new BookBean("양반전", "박지원", "자필", "소설/고전소설/한국고전", a , "0101010021") };
		Vector<BookBean> vector = new Vector<BookBean>();

		String name = "책제목";
				
		String aa="no.\t 책 제목 \t\t\t\t\t 저자명 \t\t 출판사 \t\t 식별번호 \n";
		
		for (int i = 0; i < bean.length; i++) {
			vector.add(bean[i]);
		}
		
		switch (name) {
		
		
		
		case "책제목":
			
			
			for (int i = 0; i < vector.size(); i++) {
				if(vector.elementAt(i).getbTitle().equals("호질")){
					aa+=""+(i+1)+"\t"+vector.elementAt(i).getbTitle();
				aa+="\t\t"+vector.elementAt(i).getAuthor();
				aa+="\t"+vector.elementAt(i).getPublisher();
				aa+="\t"+vector.elementAt(i).getSerialNo();
				aa+="\n";
			}else{
				if(i == vector.size()-1 && aa.equals("no.\t 책 제목 \t\t\t\t\t 저자명 \t\t 출판사 \t\t 식별번호 \n")){
					aa="검색결과가 없습니다.";
				}
			}
			}	
		break;
		
		case "식별번호":
			
			/*Set set=map.entrySet();
			Iterator it=set.iterator();
			while (it.hasNext()) {
				Map.Entry e = (Map.Entry)it.next();
				if () {
					
				}
				
			}*/
			
			for (int i = 0; i < vector.size(); i++) {
				if(vector.elementAt(i).getSerialNo().equals("0102030011")){
					aa+=""+(i+1)+"\t"+vector.elementAt(i).getbTitle();
					aa+="\t\t"+vector.elementAt(i).getAuthor();
					aa+="\t"+vector.elementAt(i).getPublisher();
					aa+="\t"+vector.elementAt(i).getSerialNo();
					/*a+=""+(i+1)+"\t"+map.get("식별번호");*/
					aa+="\n";
				}else{
					if(i == vector.size()-1 && aa.equals("no.\t 책 제목 \t\t\t\t\t 저자명 \t\t 출판사 \t\t 식별번호 \n")){
						aa="검색결과가 없습니다.";
					}
				}
			}
			break;
		
		case "저자명":
						
			for (int i = 0; i < vector.size(); i++) {
				if(vector.elementAt(i).getAuthor().equals("박지원")){
					aa+=""+(i+1)+"\t"+vector.elementAt(i).getbTitle();
					aa+="\t\t"+vector.elementAt(i).getAuthor();
					aa+="\t"+vector.elementAt(i).getPublisher();
					aa+="\t"+vector.elementAt(i).getSerialNo();
					aa+="\n";
				}else{
					if(i == vector.size()-1 && aa.equals("no.\t 책 제목 \t\t\t\t\t 저자명 \t\t 출판사 \t\t 식별번호 \n")){
						aa="검색결과가 없습니다.";
					}
				}
			}
			break;
		case "출판사":
			
			for (int i = 0; i < vector.size(); i++) {
				if(vector.elementAt(i).getPublisher().equals("더클래식")){
					aa+=""+(i+1)+"\t"+vector.elementAt(i).getbTitle();
					aa+="\t\t"+vector.elementAt(i).getAuthor();
					aa+="\t"+vector.elementAt(i).getPublisher();
					aa+="\t"+vector.elementAt(i).getSerialNo();
					aa+="\n";
				}else{
					if(i == vector.size()-1 && aa.equals("no.\t 책 제목 \t\t\t\t\t 저자명 \t\t 출판사 \t\t 식별번호 \n")){
						aa="검색결과가 없습니다.";
					}
				}
			}
			break;

		default:
			break;
		}
		
		System.out.println(aa);

		
	}
}
