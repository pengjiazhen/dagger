package com.example.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.mvp.presenter.UserPresenter;
import com.example.myapplication.mvp.view.UserView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements UserView{

    @Inject
    UserPresenter userPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //DaggerUserComponent.builder().userModule(new UserModule(this)).appComponent(((MyApp) getApplication()).getAppComponent()).build().inject(this);
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this,"登录成功了",Toast.LENGTH_SHORT).show();
    }

    public void onLogin(View view) {
        userPresenter.takeView(this);
        userPresenter.doLogin();
    }
}
