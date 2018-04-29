package com.dudu.maventest.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import com.dudu.maventest.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
    UserService userService;
     
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String user(Model model) {
         
        model.addAttribute("users", userService.getUserList());       
         
        return "/user/user";
    }

}
