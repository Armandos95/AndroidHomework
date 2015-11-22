package com.rbezliudko.sixthhomework.Activities;

import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.widget.TextView;

import com.rbezliudko.sixthhomework.Fragments.FourthHomeworkMainFragment;
import com.rbezliudko.sixthhomework.Fragments.FourthHomeworkNextFragment;
import com.rbezliudko.sixthhomework.Fragments.FourthHomeworkPreviousFragment;
import com.rbezliudko.sixthhomework.Interfaces.ButtonMethodsInterfaceFour;
import com.rbezliudko.sixthhomework.R;

public class FourthHomeworkMainActivity extends FourthHomeworkBaseActivity implements ButtonMethodsInterfaceFour {

    private TextView mainText;
    private FragmentManager manager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_homework_main);

        mainText = (TextView) findViewById(R.id.main_text);
        if (isAddFragment()) {
            mainText.setText("Choose a fragment");
        }
        else {
            mainText.setText("No fragment");
        }
    }

    @Override
    public void addFragment() {
        manager.beginTransaction().add(R.id.fragment_container_4, new FourthHomeworkMainFragment()).commit();
    }

    @Override
    public void showNext(){
        manager.beginTransaction().replace(R.id.fragment_container_4, new FourthHomeworkNextFragment()).addToBackStack(null).commit();
    }

    @Override
    public void showPrevious(){
        manager.beginTransaction().replace(R.id.fragment_container_4, new FourthHomeworkPreviousFragment()).addToBackStack(null).commit();
    }

    @Override
    public boolean isAddFragment(){
        return true;
    }
}