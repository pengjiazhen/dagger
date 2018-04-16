package com.example.myapplication.data;

import android.app.Application;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DataManager {

    @Inject
    public DataManager(Application application){

    }

    public String getPws(String userName){
        if ("pjz".equals(userName)){
            return "123";
        }
        return "";
    }
}
