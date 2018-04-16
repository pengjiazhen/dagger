package com.example.myapplication.mvp.presenter;

import com.example.myapplication.mvp.model.UserModel;
import com.example.myapplication.mvp.view.UserView;

import javax.inject.Inject;

public class UserPresenter {

   private UserModel model;
   private UserView view;

    @Inject
    public UserPresenter(UserModel model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void doLogin(){
        if (model.loginServer("pjz","123")) {
            view.loginSuccess();
        }
    }
}
