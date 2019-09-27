package com.wang.pojo;

public class User {
    private int uid;
    private String uname;
    private String pwd;
    private String phoneNUmber;
    private String email;

    public User() {
    }

    public User(String uname, String pwd, String phoneNUmber, String email) {

        this.uname = uname;
        this.pwd = pwd;
        this.phoneNUmber = phoneNUmber;
        this.email = email;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setPhoneNUmber(String phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }

    public String getPwd() {
        return pwd;
    }

    public String getPhoneNUmber() {
        return phoneNUmber;
    }

    public String getEmail() {
        return email;
    }
}
