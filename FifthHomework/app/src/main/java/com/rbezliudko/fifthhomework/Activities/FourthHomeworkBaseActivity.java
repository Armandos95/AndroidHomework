package com.rbezliudko.fifthhomework.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rbezliudko.fifthhomework.R;

public abstract class FourthHomeworkBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (isAddFragment()) {
            addFragment();
        }
        else {
            setContentView(R.layout.activity_fourth_homework_base);
        }
    }

    public abstract void addFragment();

    public abstract boolean isAddFragment();
}
