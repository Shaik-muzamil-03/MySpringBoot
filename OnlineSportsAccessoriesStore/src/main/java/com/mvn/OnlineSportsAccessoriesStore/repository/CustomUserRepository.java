package com.mvn.OnlineSportsAccessoriesStore.repository;

import com.mvn.OnlineSportsAccessoriesStore.exceptions.InvalidUserException;

public interface CustomUserRepository {
	public String verifyUser(String username,String password)/*throws InvalidUserException*/;
	public boolean verifyEntries(String username, String password) ;

}
