package com.wang.servlet;

import com.wang.pojo.User;
import com.wang.service.UserService;
import com.wang.service.imp.UserServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

             req.setCharacterEncoding("utf-8");
             resp.setContentType("text/html;charset=utf-8");
             String oper=req.getParameter("oper");
             if("login".equals(oper)){
                 checkUserLogin(req,resp);

             }else if("reg".equals(oper)){
                 userRge(req,resp);
                 System.out.println("注册成功");

             }else{
                 System.out.println("没有找到相应的操作"+oper);
             }
    }

    private void  checkUserLogin(HttpServletRequest req, HttpServletResponse resp) {
        String uname=req.getParameter("uname");
        String pwd=req.getParameter("pwd");
        UserService userService=new UserServiceImp();
        User user = userService.CheckUserLoginService(uname,pwd);
        System.out.println(user);
        if(user!=null){

        }
    }
    private void  userRge(HttpServletRequest req,HttpServletResponse resp){
        String uname=req.getParameter("uname");
        String pwd=req.getParameter("pwd");
        //int uid=req.getParameter("uid")!=""? Integer.parseInt(req.getParameter("uid")) : 0;
        String phoneNUmber=req.getParameter("phoneNUmber");
        String email =req.getParameter("email");
        UserService userService=new UserServiceImp();
        User user=new User(uname,pwd,phoneNUmber,email);
        userService.UserRegService(user);



    }
}
