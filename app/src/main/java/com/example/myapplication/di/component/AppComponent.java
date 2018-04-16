package com.example.myapplication.di.component;

import com.example.myapplication.MyApp;
import com.example.myapplication.data.DataManager;
import com.example.myapplication.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    DataManager getDataManager();
    void inject(MyApp myApp);
}
