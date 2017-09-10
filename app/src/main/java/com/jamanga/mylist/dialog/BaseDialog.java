package com.jamanga.mylist.dialog;

import android.app.DialogFragment;
import android.os.Bundle;

import com.jamanga.mylist.infrastructure.MyListApplication;
import com.squareup.otto.Bus;

public class BaseDialog extends DialogFragment{
    protected MyListApplication application;
    protected Bus bus;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        application = (MyListApplication) getActivity().getApplication();
        bus = application.getBus();
        bus.register(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        bus.unregister(this);
    }
}
