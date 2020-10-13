package com.ecomm.controller;


import java.util.Collection;

import javax.servlet.http.HttpSession;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController 
{

	@RequestMapping(value="/login_success")
	public String loginSuccess(HttpSession session)
	{
		String page="";
		
		SecurityContext sContext=SecurityContextHolder.getContext();
		Authentication authentication=sContext.getAuthentication();
		
		String username=authentication.getName();
		
		session.setAttribute("username", username);
		
		Collection<GrantedAuthority> roles=(Collection<GrantedAuthority>)authentication.getAuthorities();
		
		for(GrantedAuthority authority:roles)
		{
			if(authority.getAuthority().equals("ROLE_ADMIN"))
				page="AdminHome";
			else
				page="UserHome";
		}
		
		return page;
	}
	
	@RequestMapping(value="/login")
	public String showLoginPage()
	{
		return "SignIn";
	}
	
}

