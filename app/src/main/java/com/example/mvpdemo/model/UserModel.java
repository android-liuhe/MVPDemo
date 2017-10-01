package com.example.mvpdemo.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;

import com.example.mvpdemo.bean.UserBrean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuhe on 2017/10/1.
 */

public class UserModel implements InterUserModel {

    private UserBrean bean;
    private SparseArray<UserBrean> mUsererArray = new SparseArray<>();

    @Override
    public void setUserAge(int ID, String userName, String userAge) {
        bean = new UserBrean(userName, userAge);
        mUsererArray.append(ID, bean);
    }

    @Override
    public UserBrean getUser(int ID) {
        bean = mUsererArray.get(ID, new UserBrean("not find", "not find"));
        return bean;
    }


}
