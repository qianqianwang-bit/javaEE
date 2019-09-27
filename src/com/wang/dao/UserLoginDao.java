package com.wang.dao;

import com.wang.pojo.User;

public interface UserLoginDao {
    User checkUserLoginDao(String uname,String pwd);
    int UserRegDao(User user);

}
