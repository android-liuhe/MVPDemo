package com.example.mvpdemo.bean;

/**
 * Created by liuhe on 2017/10/1.
 */

public class UserBrean {

    private String userName;
    private String userAge;

    public UserBrean(String userName, String userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }
}
