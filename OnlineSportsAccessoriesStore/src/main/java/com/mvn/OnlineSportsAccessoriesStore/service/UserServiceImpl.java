package com.mvn.OnlineSportsAccessoriesStore.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mvn.OnlineSportsAccessoriesStore.exceptions.InvalidUserException;

import com.mvn.OnlineSportsAccessoriesStore.repository.UserRepository;
import java.util.List;

import com.mvn.OnlineSportsAccessoriesStore.entity.Discounts;
import com.mvn.OnlineSportsAccessoriesStore.entity.User;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository usersRepository;
	
	
	
	@Override
	public User searchUser(int Id) {
		User u = usersRepository.findById(Id).get();
		return u;
		
	}
	/*@Override
	public List<User> getAllUsers(String city) {

		return  usersRepository.findAll(city).get();

		
	}*/
	@Override
	public List<User> getAllUsersByCityAndTotalPurchase() {
		// TODO Auto-generated method stub
		return usersRepository.findAll();
	}


	@Override
	public String login(String username, String password)throws InvalidUserException
	{
		
		String role = usersRepository.verifyUser(username, password);
		
		return role;
	}

	public boolean verifyforRegistration(String username,String password) {
		if(usersRepository.verifyEntries(username, password)== true) {
			return true;
		}
		else 
		{
			return false;
		}
		
		
	}
	public boolean registrationProcess(User u){
		usersRepository.save(u);
		return true;
	}
	







@Override
public List<User> getAllUsers(String city) {
	// TODO Auto-generated method stub
	return null;
}
}
	



