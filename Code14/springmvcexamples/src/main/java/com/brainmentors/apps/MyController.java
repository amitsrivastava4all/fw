package com.brainmentors.apps;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.brainmentors.apps.dao.UserDAO;
import com.brainmentors.apps.dto.UserDTO;

@Controller
public class MyController {
	private Logger logger = Logger.getLogger(MyController.class);
//	@RequestMapping(value="/login",method=RequestMethod.POST)
//	public ModelAndView doLogin(HttpServletRequest request, HttpServletResponse response){
//		System.out.println("Inside Login...");
//		String userid = request.getParameter("userid");
//		String pwd = request.getParameter("pwd");
//		ModelAndView mv =new ModelAndView();
//		
//		mv.setViewName("dashboard.jsp");
//		mv.addObject("user", userid);
//		return mv;
//	}
	 @Autowired
	 //@Qualifier("userDAO")
	    private UserDAO userDAO;
	 @Autowired
	 private UserDTO userDTO;
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView doLogin(@RequestParam("userid") String userid, @RequestParam String pwd){
		logger.debug("Inside Controller "+userid);
		UserDTO userDTOObject = null;
		ModelAndView mv =new ModelAndView();
		System.out.println("Userid "+userid+" Pwd "+pwd);
		userDTO.setUserid(userid);
		userDTO.setPassword(pwd);
		try {
			 userDTOObject = userDAO.doLogin(userDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mv.setViewName("dashboard.jsp");
		mv.addObject("userobj", userDTOObject);
		logger.debug("going to end the controller "+userid+" UserObject is "+userDTOObject);
		return mv;
	}

}
