package com.example.services;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

@Service
public class ValidationsServices {

	public String validateSession(HttpSession session) {
		
		if(session.getAttribute("id")==null)
			 return Constont.UNAUTHORIZED;//If user try without login it will return an UNAUTHORIZED
		
		 long time=(Long) session.getAttribute("expireTime");
		
		 System.out.println("time"+time);
		 
		System.out.println(new Date().getTime()+"  "+new Date(time).getTime());
		if(new Date().after(new Date(time)))
				return Constont.SESSIONEXPIRED; //If session is over it return session expired

		return Constont.SUCCESS;
		
	}
}
