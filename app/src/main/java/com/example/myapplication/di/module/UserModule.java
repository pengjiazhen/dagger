package com.example.myapplication.di.module;

import com.example.myapplication.mvp.view.UserView;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {

    private UserView userView;

    public UserModule(UserView userView) {
        this.userView = userView;
    }

    @Provides
    public UserView provideUserView(){
        return userView;
    }
    /*@Provides
    public UserModel provideUserModel(DataManager dataManager){
        return new UserModel(dataManager);
    }*/

    /*@Provides
    public UserPresenter provideUserPresenter(UserModel userModel){
        return new UserPresenter(userModel,userView);
    }
*/
}
