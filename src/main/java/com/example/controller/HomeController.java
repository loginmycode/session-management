package com.example.controller;

import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.beans.User;
import com.example.services.Constont;
import com.example.services.UserServiceImpl;
import com.example.services.ValidationsServices;

@RestController
@RequestMapping("/user")
public class HomeController {

	
	@Autowired
	UserServiceImpl service;
	
	@Autowired
	ValidationsServices validate;
	
	@GetMapping("/login")
	public String login(HttpSession session)
	{
		
		session.setAttribute("id", Math.random());
		Calendar cal=Calendar.getInstance();//Using calendar class for validate
		cal.add(Calendar.DATE, 1);
		session.setAttribute("expireTime", cal.getTimeInMillis());
		 return Constont.SUCCESS;//Checking user login session 
		
	}
	@GetMapping(value = {"/users"}) 
	public String getUsers(HttpSession session)
	{
	
		String res=validate.validateSession(session);//Calling validation method from Validation_Service class
		if(res!=Constont.SUCCESS)
		{			
			return Constont.FAILURE; 
			
		}
		List<User> user=service.getbookings();
		System.out.println(user);
		return Constont.SUCCESS;//if Session is Active it return SUCCESS message 
	}
	
	
	
	@GetMapping("/{id}")
	public User getOneBook(@PathVariable("id") Long id)
	{
		User todo= service.getOneBooking(id);//Checkin individual user details
		System.out.println(todo);
		return todo;
	}
	
	@PostMapping(value = {"","/"})
	//@RequestMapping(value = {"","/"},method=RequestMethod.POST)
	public User adding(@RequestBody User user)// adding user 
	{
		User create= service.bookTicket(user);
		System.out.println(user);
		return create;
		
	}
	@PostMapping("/{id}")
	public boolean deActivebooking(@RequestBody Long id)// We can deactivate booking due to valid reasons
	{
		boolean b= service.deleteBook(id);
		System.out.println(b);
		return b;
	}
	
	@PutMapping("/{id}")
	public User updateUser(@RequestBody User user , @PathVariable Long id)// After changes updating the details of user
	{	
		User upd = service.updateBooking(user,id);
		System.out.println(upd);
		return upd;
	}
	
	@DeleteMapping("/{id}")
	public boolean  deletUser(@PathVariable("id")  Long id)// By using we get user details
	{
		boolean b= service.deleteBook(id);
		System.out.println(b);
		return b;
	}
	
	
	
	
	
	
	
	
}

	
