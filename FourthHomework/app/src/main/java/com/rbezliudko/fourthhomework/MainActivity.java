package com.rbezliudko.fourthhomework;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;

import com.rbezliudko.fourthhomework.interfaces.ButtonMethodsInterface;

public class MainActivity extends BaseActivity implements ButtonMethodsInterface{

    private Button buttonNext;
    private Button buttonPrevious;

    private FragmentManager manager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!isAddFragment()) {
            setContentView(R.layout.activity_main_false);
        }
        else {
            setContentView(R.layout.activity_main_true);
            buttonNext = (Button) findViewById(R.id.button_next);
            buttonPrevious = (Button) findViewById(R.id.button_previous);

            buttonNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showNext();
                }
            });

            buttonPrevious.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showPrevious();
                }
            });
        }
    }

    @Override
    public void addFragment() {
        manager.beginTransaction().add(R.id.fragment_container, new EmptyFragment()).commit();
    }

    @Override
    public void showNext(){
        manager.beginTransaction().replace(R.id.fragment_container, new NextFragment()).addToBackStack(null).commit();
    }

    @Override
    public void showPrevious(){
        manager.beginTransaction().replace(R.id.fragment_container, new PreviousFragment()).addToBackStack(null).commit();
    }

    @Override
    public boolean isAddFragment(){
        return false;
    }
}
