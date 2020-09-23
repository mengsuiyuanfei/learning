package com.example.demo.mapper;

import com.example.demo.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;

public interface UserMapper {
    UserBean getInfo(String name, String password);
}
