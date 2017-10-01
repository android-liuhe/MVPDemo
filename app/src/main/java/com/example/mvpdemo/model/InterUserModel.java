package com.example.mvpdemo.model;

import com.example.mvpdemo.bean.UserBrean;

/**
 * Created by liuhe on 2017/10/1.
 */

public interface InterUserModel {

    void setUserAge(int ID, String userName, String userAge);

    UserBrean getUser(int ID);


}
