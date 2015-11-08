package com.rbezliudko.fifthhomework.Activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.rbezliudko.fifthhomework.Fragments.MainFragment;
import com.rbezliudko.fifthhomework.Fragments.NextFragment;
import com.rbezliudko.fifthhomework.Fragments.PreviousFragment;
import com.rbezliudko.fifthhomework.R;

import com.rbezliudko.fifthhomework.Interfaces.ButtonMethodsInterface;

public class FourthHomeworkMainActivity extends FourthHomeworkBaseActivity implements ButtonMethodsInterface{

    private TextView mainText;
    private FragmentManager manager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        manager.beginTransaction().add(R.id.fragment_container, new MainFragment()).commit();
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