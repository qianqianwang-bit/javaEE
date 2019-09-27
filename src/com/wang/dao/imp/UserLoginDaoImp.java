package com.wang.dao.imp;

import com.wang.dao.UserLoginDao;
import com.wang.pojo.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserLoginDaoImp implements UserLoginDao {
    @Override
    public User checkUserLoginDao(String uname, String pwd) {
        User user = null;
        try {
            //1.获取数据库驱动
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取连接
            Connection conn  = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/fuser?useSSL=false&allowPublicKeyRetrieval=true&" +
                                    "serverTimezone=GMT", "root","");
            System.out.println("数据库连接成功");
            //3.获取操作数据库的预处理对象
            PreparedStatement pstm=conn.prepareStatement("select * from t_user where uname=? and pwd=? ");
            pstm.setString(1,uname);
            pstm.setString(2,pwd);
            //4.执行SQL获得操作数据库的结果
            ResultSet rs=pstm.executeQuery();
            //5.遍历结果
            while (rs.next()){
                user = new User();
                user.setUid(rs.getInt("uid"));
                user.setPwd(rs.getString("pwd"));
                user.setUname(rs.getString("uname"));
                user.setEmail(rs.getString("email"));
                user.setPhoneNUmber("PhoneNUmber");
            }
            //释放资源
            rs.close();
            pstm.close();
            conn.close();

        }catch (Exception e){

        }
        return user;
    }

    @Override
    public int UserRegDao(User user) {
        String uname=user.getUname();

        int index=-1;
        try {
            //1.获取数据库驱动
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取连接
            Connection conn  = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/fuser?useSSL=false&allowPublicKeyRetrieval=true&" +
                            "serverTimezone=GMT", "root","");
            System.out.println("数据库连接成功");
            //3.获取操作数据库的预处理对象
            PreparedStatement pstm=conn.prepareStatement("insert into t_user values(default,?,?,?,?)");

            //给占位符赋值
            pstm.setString(1,user.getUname());
            pstm.setString(2,user.getPwd());
            pstm.setString(3,user.getPhoneNUmber());
            pstm.setString(4,user.getEmail());
            //4.执行SQL
            pstm.executeUpdate();
            System.out.println("数据库修改成功");
            //释放资源
            pstm.close();
            conn.close();

        }catch (Exception e){

        }
        return index;

    }
}
