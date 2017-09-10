package com.jamanga.mylist.live;

import android.widget.Toast;

import com.jamanga.mylist.infrastructure.MyListApplication;
import com.jamanga.mylist.services.AccountServices;
import com.squareup.otto.Subscribe;

public class LiveAccountServices extends BaseLiveService{
    public LiveAccountServices(MyListApplication application) {
        super(application);
    }

    @Subscribe
    public void RegisterUser(AccountServices.RegisterUserRequest request){
        AccountServices.RegisterUserResponse response = new AccountServices.RegisterUserResponse();

        if (request.userEmail.isEmpty()){
            response.setPropertyErrors("email","Please put in your email.");
        }

        if (request.userName.isEmpty()){
            response.setPropertyErrors("userName","Please put in your name.");
        }

        if (response.didSuceed()){
            Toast.makeText(application.getApplicationContext(),"User will be registered shortly",Toast.LENGTH_LONG).show();
        }

        bus.post(response);
    }
}


