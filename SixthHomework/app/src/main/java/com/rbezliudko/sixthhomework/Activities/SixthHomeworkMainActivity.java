package com.rbezliudko.sixthhomework.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rbezliudko.sixthhomework.Fragments.SixthHomeworkAFragment;
import com.rbezliudko.sixthhomework.Fragments.SixthHomeworkBFragment;
import com.rbezliudko.sixthhomework.R;

public class SixthHomeworkMainActivity extends AppCompatActivity implements SixthHomeworkAFragment.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_homework_main);
    }

    public void onItemSelected(int position) {
        SixthHomeworkBFragment fragmentB = (SixthHomeworkBFragment) getFragmentManager().findFragmentById(R.id.fragment_6_b);
        if (fragmentB == null) {
            Intent intent = new Intent(this, SixthHomeworkBFragment.class);
            intent.putExtra("position", position);
            startActivity(intent);
        }
        else {
            fragmentB.updateContent(position);
        }
    }
}
