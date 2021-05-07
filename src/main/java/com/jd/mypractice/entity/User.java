package com.jd.mypractice.entity;

import java.io.Serializable;

/**
 * Created by HXS on 2021/5/6.
 */
public class User implements Serializable{

    private int id;
    private String loginName;
    private String password;
    private int flag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", flag=" + flag +
                '}';
    }
}
