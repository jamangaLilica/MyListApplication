package com.jamanga.mylist.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.jamanga.mylist.infrastructure.MyListApplication;
import com.squareup.otto.Bus;

public class BaseActivity extends AppCompatActivity {
    protected MyListApplication application;
    protected Bus bus;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        application= (MyListApplication) getApplication();
        bus = application.getBus();
        bus.register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bus.unregister(this);
    }
}
