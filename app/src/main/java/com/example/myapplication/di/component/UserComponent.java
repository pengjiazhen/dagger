package com.example.myapplication.di.component;

import com.example.myapplication.MainActivity;
import com.example.myapplication.di.module.UserModule;
import com.example.myapplication.di.scope.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(modules = UserModule.class,dependencies = AppComponent.class)
public interface UserComponent {

    void inject(MainActivity activity);
}
