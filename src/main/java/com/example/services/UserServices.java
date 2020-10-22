package com.example.services;

import java.util.List;

import com.example.beans.User;


public interface UserServices {

	public User bookTicket(User todo);
	public List<User> getbookings();
	public User isActive(Long id);
	public User getOneBooking(Long id);
	public User updateBooking(User user, Long id);
	public boolean deleteBook(Long id);
	public boolean isBooking(Long id);
	
}
