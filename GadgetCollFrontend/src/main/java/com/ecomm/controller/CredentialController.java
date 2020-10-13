package com.ecomm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CredentialController 
{
   @RequestMapping(value="/signIn")
   public String showLogin()
   {
	     return "SignIn";
   }
   
   @RequestMapping(value="/signUp")
   public String showRegister()
   {
	     return "SignUp";
   }
   
   @RequestMapping(value="/contactUs")
   public String showContactUs()
   {
	     return "ContactUs";
   }
   
   @RequestMapping(value="/aboutUs")
   public String showAboutUs()
   {
	     return "AboutUs";
   }
}
