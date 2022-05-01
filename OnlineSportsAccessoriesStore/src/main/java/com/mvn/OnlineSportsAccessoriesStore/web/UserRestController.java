package com.mvn.OnlineSportsAccessoriesStore.web;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvn.OnlineSportsAccessoriesStore.dto.LoginDTO;
import com.mvn.OnlineSportsAccessoriesStore.exceptions.InvalidUserException;
import com.mvn.OnlineSportsAccessoriesStore.exceptions.WrongUserOrPasswordException;
import com.mvn.OnlineSportsAccessoriesStore.service.UserService;
import com.mvn.OnlineSportsAccessoriesStore.validate.ValidateEntry;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.mvn.OnlineSportsAccessoriesStore.entity.User;


@RestController
@RequestMapping("/home")
public class UserRestController {
	@Autowired
	UserService userService;
	
	@PostMapping("/user/login")
	public boolean doLogin(@RequestBody LoginDTO loginObj,HttpServletRequest req) throws InvalidUserException,WrongUserOrPasswordException{
		String username = loginObj.getUsername();
		String password = loginObj.getPassword();
		if(ValidateEntry.validateNullEntry(username)&&ValidateEntry.validateNullEntry(password)) {
			String role =  userService.login(username, password);
			if( userService.verifyforRegistration(username, password)) {
			
				if(role.equalsIgnoreCase("User"))
				{
				
					// generate new session 
					HttpSession session = req.getSession(true);
					
					session.setAttribute("role", role);
					session.setAttribute("username",username);
					session.setAttribute("password",password);
					return true;
					
				
				
				}
				else
				{
			
				throw new InvalidUserException("","");
				}
			
			  }
			else
			{
			
			throw new WrongUserOrPasswordException(username,password);
			}
			
			
		}
		else
		{
		
			throw new InvalidUserException("","");
		}
	}
	@GetMapping("/user/logout")
	public boolean doLogout(HttpServletRequest req)
	{
		HttpSession session = req.getSession(false);
		String role = (String)session.getAttribute("role");
		if(role.equalsIgnoreCase("User"))
		{
			session.invalidate(); // to logout
			return true;
		}
		else return false;
	}
	@PostMapping("/user/Registration")
	public String Registration(@RequestBody User u,HttpServletRequest req) {
		HttpSession Session = req.getSession(false);
		if(Session!=null) {
			if(Session.getAttribute("username").equals(u.getPassword()) || Session.getAttribute("password").equals(u.getPassword())){ 
				 userService.registrationProcess(u);
				return  "Username or password already exists";
			}
			else
			{
				 userService.registrationProcess(u);
				return "Registration Successfull";
			}
		}
		else {
			 userService.registrationProcess(u);
			return "Registration Successfull";

			
		}
			
			
		
	}
	
	@GetMapping("/{Id}")
	public User getUser(@PathVariable int Id) {
		User obj =  userService.searchUser(Id);
		return obj;
	}
	
	
	/*@GetMapping("/{city}")
	public List<User> doThis(@PathVariable String city){
		return userSer.getAllUsers(city);
	}*/
	

	


}
