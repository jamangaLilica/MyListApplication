package com.jamanga.mylist.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.LinearLayout;

import com.jamanga.mylist.R;
import com.jamanga.mylist.R2;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity{

    @BindView(R2.id.activity_login_linear_layout)
    LinearLayout linearLayout;

    @BindView(R2.id.activity_login_registerButton)
    Button registerButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        linearLayout.setBackgroundResource(R.drawable.backgroundscreen);
    }

    @OnClick(R2.id.activity_login_registerButton)
    public void setRegisterButton(){
        startActivity(new Intent(this,RegisterActivity.class));
        finish();
    }
}
