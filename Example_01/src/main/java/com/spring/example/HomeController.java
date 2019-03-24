package com.spring.example;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestParam;  
/**
 * Handles requests for the application home page.
 * @param <MemberVO>
 * @param <MemberVO>
 */
@Controller
public class HomeController {


	 @RequestMapping("/hello")  
	    //read the provided form data  
	    public String display(@RequestParam("name") String name,@RequestParam("pass") String pass,Model m)  
	    {  
	        if(pass.equals("admin"))  
	        {  
	            String msg="Hello "+ name;  
	            //add a message to the model  
	            m.addAttribute("message", msg);  
	            return "viewpage";  
	        }  
	        else  
	        {  
	            String msg="Sorry "+ name+". You entered an incorrect password";  
	            m.addAttribute("message", msg);  
	            return "errorpage";  
	        }     
	    }  
	}  
