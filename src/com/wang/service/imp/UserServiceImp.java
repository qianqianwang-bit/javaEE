package com.wang.service.imp;

import com.wang.dao.UserLoginDao;
import com.wang.dao.imp.UserLoginDaoImp;
import com.wang.pojo.User;
import com.wang.service.UserService;

public class UserServiceImp implements UserService {
    UserLoginDao ld =new UserLoginDaoImp();

    @Override
    public User CheckUserLoginService(String uname, String pwd) {
        return ld.checkUserLoginDao(uname,pwd);
    }

    @Override
    public int  UserRegService(User user) {
      return   ld.UserRegDao(user);
    }
}
