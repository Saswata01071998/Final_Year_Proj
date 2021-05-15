package com.appsnipp.education;

import android.app.Application;

import io.realm.Realm;


public class App extends Application {

    private static App instance;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        Realm.init(instance);
        //this need for using course pager scrolling
    }
}
