package com.homepage.web.controllers;


import com.homepage.web.impls.ReservationServiceImpl;
import com.homepage.web.service.ReservationService;

public class ReservationMain {
	public static void main(String[] args) {
		ReservationService service= new ReservationServiceImpl();
		service.process();
	}
}
