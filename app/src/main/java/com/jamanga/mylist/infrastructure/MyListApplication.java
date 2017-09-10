package com.jamanga.mylist.infrastructure;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.jamanga.mylist.live.Module;
import com.squareup.otto.Bus;

public class MyListApplication extends Application{
    private Bus bus;

    public MyListApplication(){
        bus = new Bus();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Module.Register(this);
    }

    public Bus getBus() {
        return bus;
    }
}
