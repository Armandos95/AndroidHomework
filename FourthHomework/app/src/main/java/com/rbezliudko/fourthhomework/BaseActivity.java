package com.rbezliudko.fourthhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        if (savedInstanceState == null) {
            addFragment();
        }
    }

    public abstract void addFragment();

    public abstract boolean isAddFragment();
}
