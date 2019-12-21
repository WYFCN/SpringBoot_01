package com.example.springboot01.mapper;

import com.example.springboot01.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    public String login(String username);
}
