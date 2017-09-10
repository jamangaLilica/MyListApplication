package com.jamanga.mylist.services;

import android.app.ProgressDialog;

import com.jamanga.mylist.infrastructure.ServiceResponse;

import java.util.HashMap;

public class AccountServices {
    private AccountServices() {
    }

    public static class RegisterUserRequest {
        public String userName;
        public String userEmail;
        public ProgressDialog progressDialog;

        public RegisterUserRequest(String userName, String userEmail, ProgressDialog progressDialog) {
            this.userName = userName;
            this.userEmail = userEmail;
            this.progressDialog = progressDialog;
        }
    }

    public static class RegisterUserResponse extends ServiceResponse{

        public RegisterUserResponse(HashMap<String, String> propertyErrors) {
            super(propertyErrors);
        }

        public RegisterUserResponse() {
            super();
        }
    };
}
