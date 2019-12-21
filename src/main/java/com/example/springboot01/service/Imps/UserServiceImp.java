package com.example.springboot01.service.Imps;

import com.example.springboot01.entities.User;
import com.example.springboot01.mapper.UserMapper;
import com.example.springboot01.service.UserService;
import org.apache.catalina.mbeans.UserMBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public String login(String username,String password) {
        String pass= userMapper.login(username);
        if(pass==null)
        {
            return "failUsername";
        }
        else if(password.equals(pass)){
            return "success";
        }
        else{
            return "failPassword";
        }
    }
}
