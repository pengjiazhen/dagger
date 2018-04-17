package com.example.myapplication.mvp.presenter;

import com.example.myapplication.mvp.model.UserModel;
import com.example.myapplication.mvp.view.UserView;

import javax.inject.Inject;

public class UserPresenter {

   private UserModel model;
   private UserView view;

    @Inject
    public UserPresenter(UserModel model) {
        this.model = model;
    }

    public void doLogin(){
        if (model.loginServer("pjz","123")) {
            view.loginSuccess();
        }
    }

    public void takeView(UserView view){
        this.view = view;
    }
}
