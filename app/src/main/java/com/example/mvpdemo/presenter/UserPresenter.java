package com.example.mvpdemo.presenter;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.mvpdemo.bean.UserBrean;
import com.example.mvpdemo.model.InterUserModel;
import com.example.mvpdemo.model.UserModel;
import com.example.mvpdemo.view.InterUserActivity;

/**
 * Created by liuhe on 2017/10/1.
 */

public class UserPresenter {

    private InterUserModel model;
    private InterUserActivity view;
    private Context context;

    public UserPresenter(Context context, InterUserActivity view) {
        this.context = context;
        this.view = view;
        model = new UserModel();
    }

    public void saveUserMessage(int ID, String userName, String userAge){
        model.setUserAge(ID, userName, userAge);
        view.setTextUserID("");
        view.setTextUserName("");
        view.setTextUserAge("");
        Toast.makeText(context, "存储成功", Toast.LENGTH_SHORT).show();
    }

    public void loadUserMessage(int ID){
        UserBrean bean = model.getUser(ID);
        view.setTextUserName(bean.getUserName());
        view.setTextUserAge(bean.getUserAge());
    }

}
