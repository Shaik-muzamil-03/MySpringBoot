package com.mvn.OnlineSportsAccessoriesStore.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.mvn.OnlineSportsAccessoriesStore.exceptions.InvalidUserException;




public class CustomUserRepositoryImpl implements CustomUserRepository{
	
	@Autowired
	EntityManager jpa;
	
	@Override
	public String verifyUser(String username, String password){
		Session spring = jpa.unwrap(Session.class);
		
		String query = "select role from User u where username =:enteredUsername and password =:enteredPassword";
		
		Query<String> q = spring.createQuery(query);
		q.setParameter("enteredUsername", username);
		q.setParameter("enteredPassword", password);
		
		List<String> output =  q.getResultList();
		System.out.println(output);
		if(output.size()!=0) {
		return output.get(0); 
		}
		else
		{
			return null;
		}
			
		
		
		
	} 
	@Override
	public boolean verifyEntries(String username, String password) {
		Session spring = jpa.unwrap(Session.class);
		
		String query1 = "select Username from User u where Username=:enteredUsername";
		String query2 = "select Username from User u where Password=:enteredPassword";
		Query<String> u = spring.createQuery(query1);
		Query<String> p = spring.createQuery(query2);
		u.setParameter("enteredUsername", username);
		p.setParameter("enteredPassword", password);
		
		List<String> uOutput =  u.getResultList();
		List<String> pOutput =  p.getResultList();
		boolean status = false;
		if(uOutput.size()!=pOutput.size())
		{
			
			return status;
			
			
		}
		else
		{
			
			return status = true;
			
		}
		
	} 
	

}
