package com.example.springboot01.controller;

import com.example.springboot01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Map<String,Object> map, HttpSession session)
    {
        System.out.println(username+"  "+password);
        String flag=userService.login(username,password);
        if("success".equals(flag)){
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }
        else if("failUsername".equals(flag)){
            map.put("msg","用户名错误");
            return "index";
        }
        else{
            map.put("msg","密码错误");
            return "index";
        }
    }
}
