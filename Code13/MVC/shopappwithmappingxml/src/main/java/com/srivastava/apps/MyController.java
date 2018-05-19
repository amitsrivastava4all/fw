package com.srivastava.apps;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping(name="login")
	//public ModelAndView doLogin(HttpServletRequest request, HttpServletResponse response){
	public ModelAndView doLogin(@RequestParam("userid") String userid,
			@RequestParam("pwd") String password){
		//String userid = request.getParameter("userid");
		//String pwd = request.getParameter("pwd");
		ModelAndView mv = new ModelAndView();
		if(userid.equals(password)){
			mv.addObject("user", userid);
			
		}
		else{
			mv.addObject("error","Invalid Userid or Password");
		}
		mv.setViewName("welcome.jsp");
		return mv;
	}

}
