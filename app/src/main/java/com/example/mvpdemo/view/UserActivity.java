package com.example.mvpdemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvpdemo.R;
import com.example.mvpdemo.presenter.UserPresenter;

public class UserActivity extends AppCompatActivity implements View.OnClickListener,InterUserActivity{

    private TextView showID;
    private TextView showName;
    private TextView showAge;
    private Button saveUser;
    private Button loadUserl;
    private UserPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new UserPresenter(this, this);
        initView();
    }

    private void initView() {

        showID = (TextView) findViewById(R.id.showID);
        showName = (TextView) findViewById(R.id.showUserName);
        showAge = (TextView) findViewById(R.id.showUserAge);

        saveUser = (Button) findViewById(R.id.writeUser);
        loadUserl = (Button) findViewById(R.id.readUser);

        loadUserl.setOnClickListener(this);
        saveUser.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.writeUser:
                presenter.saveUserMessage(Integer.parseInt(getTextUserID()), getTextUserName(), getTextUserAge());
                break;
            case R.id.readUser:
                presenter.loadUserMessage(Integer.parseInt(getTextUserID()));
                break;
            default:
                break;
        }
    }

    @Override
    public String getTextUserID() {
        return showID.getText().toString();
    }

    @Override
    public String getTextUserName() {
        return showName.getText().toString();
    }

    @Override
    public String getTextUserAge() {
        return showAge.getText().toString();
    }


    @Override
    public void setTextUserName(String userName) {
        showName.setText(userName);
    }

    @Override
    public void setTextUserAge(String userAge) {
        showAge.setText(userAge);
    }

    @Override
    public void setTextUserID(String ID) {
        showID.setText(ID);
    }

}
