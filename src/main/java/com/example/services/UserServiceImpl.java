package com.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.beans.User;

@Service
public class UserServiceImpl implements UserServices {

	//We can implement it as for our requirement but as of now I am return it null;
	@Override
	public User bookTicket(User user) {
		// TODO Auto-generated method stub
		return null;//We can implement it as for our requirement but as of now I am return it null;
	}

	@Override
	public List<User> getbookings() {
		// TODO Auto-generated method stub
		return null;//We can implement it as for our requirement but as of now I am return it null;
	}

	@Override
	public User isActive(Long id) {
		// TODO Auto-generated method stub
		return null;//We can implement it as for our requirement but as of now I am return it null;
	}

	@Override
	public User getOneBooking(Long id) {
		// TODO Auto-generated method stub
		return null;//We can implement it as for our requirement but as of now I am return it null;
	}

	@Override
	public User updateBooking(User user, Long id) {
		// TODO Auto-generated method stub
		return null;//We can implement it as for our requirement but as of now I am return it null;
	}

	@Override
	public boolean deleteBook(Long id) {
		// TODO Auto-generated method stub
		return false;//We can implement it as for our requirement but as of now I am return it default;
	}

	@Override
	public boolean isBooking(Long id) {
		// TODO Auto-generated method stub
		return false;//We can implement it as for our requirement but as of now I am return it default ;
	}
}
	