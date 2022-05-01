package com.mvn.OnlineSportsAccessoriesStore.service;


import org.springframework.stereotype.Service; 
import com.mvn.OnlineSportsAccessoriesStore.exceptions.InvalidUserException;
import java.util.List;

import com.mvn.OnlineSportsAccessoriesStore.entity.Discounts;
import com.mvn.OnlineSportsAccessoriesStore.entity.Product;
import com.mvn.OnlineSportsAccessoriesStore.entity.User;

@Service
public interface UserService {
	public User searchUser(int Id);
	public List<User> getAllUsers(String city);
	public List<User> getAllUsersByCityAndTotalPurchase();
	public String login(String username,String password) throws InvalidUserException;
	public boolean verifyforRegistration(String username,String password);
	public boolean registrationProcess(User u);
	
	
}
