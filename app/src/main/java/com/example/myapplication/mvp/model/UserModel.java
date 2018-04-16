package com.example.myapplication.mvp.model;

import com.example.myapplication.data.DataManager;

import javax.inject.Inject;

public class UserModel {

    private DataManager dataManager;
    @Inject
    public UserModel(DataManager dataManager){
        this.dataManager = dataManager;
    }


    public boolean loginServer(String userName,String psw){
        return dataManager.getPws(userName).equals(psw);
    }
}
