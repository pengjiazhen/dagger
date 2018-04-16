package com.example.myapplication;

import android.app.Application;

import com.example.myapplication.di.component.AppComponent;
import com.example.myapplication.di.component.DaggerAppComponent;
import com.example.myapplication.di.module.AppModule;

public class MyApp extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
