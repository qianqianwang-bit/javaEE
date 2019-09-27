package com.wang.service;

import com.wang.pojo.User;

public interface UserService {
    User CheckUserLoginService(String uname, String pwd);
    int UserRegService(User user);
}
