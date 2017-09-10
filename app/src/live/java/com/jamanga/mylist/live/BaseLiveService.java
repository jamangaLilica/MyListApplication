package com.jamanga.mylist.live;

import com.google.firebase.database.FirebaseDatabase;
import com.jamanga.mylist.activities.BaseActivity;
import com.jamanga.mylist.infrastructure.MyListApplication;
import com.squareup.otto.Bus;

public class BaseLiveService {
    protected Bus bus;
    protected MyListApplication application;
    protected FirebaseDatabase auth;

    public BaseLiveService(MyListApplication application){
        this.application = application;
        bus = application.getBus();
        bus.register(this);
        auth = FirebaseDatabase.getInstance();
    }
}
