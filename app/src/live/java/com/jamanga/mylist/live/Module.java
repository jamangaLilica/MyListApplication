package com.jamanga.mylist.live;

import com.jamanga.mylist.infrastructure.MyListApplication;

public class Module {
    public static void Register(MyListApplication application){
        new LiveAccountServices(application);
    }
}
