package com.example.myapplication.di.component;

import com.example.myapplication.MyApp;
import com.example.myapplication.data.DataManager;
import com.example.myapplication.di.module.AppModule;
import com.example.myapplication.di.module.MainActivityModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AppModule.class,
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        MainActivityModule.class})
public interface AppComponent {
    DataManager getDataManager();
    void inject(MyApp myApp);
}
