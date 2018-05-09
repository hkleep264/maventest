package com.dudu.maventest.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dudu.maventest.user.model.User;
import com.dudu.maventest.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
    UserService userService;
     
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String user(Model model) {
         
        model.addAttribute("users", userService.getUserList());       
         
        return "/user/user";
    }
    
    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(Model model) {
         
        return "/user/signup";
    }
    
    @RequestMapping(value = "/signout", method = RequestMethod.GET)
    public String signout(Model model) {
         
        return "/user/signout";
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String update(Model model) {
         
        return "/user/update";
    }
    

    @RequestMapping(value="/sign.do", method = RequestMethod.POST)
    public ModelAndView sign_data(HttpServletRequest request){
     String id = request.getParameter("id");
     String pw = request.getParameter("pw");
     String name = request.getParameter("name");     
     String age = request.getParameter("age");
     String pnum = request.getParameter("pnum");
     String address = request.getParameter("address");     
     
     
     ModelAndView mav = new ModelAndView();
     User user = new User();
     user.setId(id);
     user.setPass(pw);
     user.setName(name);
     user.setAge(Integer.parseInt(age));
     user.setPnum(pnum);
     user.setAddress(address);
     
     userService.insertUser(user);
     mav.setViewName("redirect:/list");
     
     return mav;
    }

    
    


}
