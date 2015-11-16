package com.rbezliudko.sixthhomework.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rbezliudko.sixthhomework.Fragments.SixthHomeworkAFragment;
import com.rbezliudko.sixthhomework.Fragments.SixthHomeworkBFragment;
import com.rbezliudko.sixthhomework.R;

public class SixthHomeworkMainActivity extends AppCompatActivity{

    private Button zerglingButton;
    private Button marauderButton;
    private Button queenButton;
    private Button zealotButton;
    private Button stalkerButton;
    private Button infestorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_homework_main);

        zerglingButton = (Button) findViewById(R.id.button_6_zergling);
        marauderButton = (Button) findViewById(R.id.button_6_marauder);
        queenButton = (Button) findViewById(R.id.button_6_queen);
        zealotButton = (Button) findViewById(R.id.button_6_zealot);
        stalkerButton = (Button) findViewById(R.id.button_6_stalker);
        infestorButton = (Button) findViewById(R.id.button_6_infestor);

        zerglingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SixthHomeworkBFragment fragmentB = (SixthHomeworkBFragment) getFragmentManager().findFragmentById(R.id.fragment_6_b);
                if (fragmentB == null) {
                    Intent intent = new Intent(SixthHomeworkMainActivity.this, SixthHomeworkBFragment.class);
                    intent.putExtra("chosenUnit", "zergling");
                    startActivity(intent);
                }
                else {
                    fragmentB.updateContent("zergling");
                }
            }
        });

        marauderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SixthHomeworkBFragment fragmentB = (SixthHomeworkBFragment) getFragmentManager().findFragmentById(R.id.fragment_6_b);
                if (fragmentB == null) {
                    Intent intent = new Intent(SixthHomeworkMainActivity.this, SixthHomeworkBFragment.class);
                    intent.putExtra("chosenUnit", "marauder");
                    startActivity(intent);
                }
                else {
                    fragmentB.updateContent("marauder");
                }
            }
        });

        queenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SixthHomeworkBFragment fragmentB = (SixthHomeworkBFragment) getFragmentManager().findFragmentById(R.id.fragment_6_b);
                if (fragmentB == null) {
                    Intent intent = new Intent(SixthHomeworkMainActivity.this, SixthHomeworkBFragment.class);
                    intent.putExtra("chosenUnit", "queen");
                    startActivity(intent);
                }
                else {
                    fragmentB.updateContent("queen");
                }
            }
        });

        zealotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SixthHomeworkBFragment fragmentB = (SixthHomeworkBFragment) getFragmentManager().findFragmentById(R.id.fragment_6_b);
                if (fragmentB == null) {
                    Intent intent = new Intent(SixthHomeworkMainActivity.this, SixthHomeworkBFragment.class);
                    intent.putExtra("chosenUnit", "zealot");
                    startActivity(intent);
                }
                else {
                    fragmentB.updateContent("zealot");
                }
            }
        });

        stalkerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SixthHomeworkBFragment fragmentB = (SixthHomeworkBFragment) getFragmentManager().findFragmentById(R.id.fragment_6_b);
                if (fragmentB == null) {
                    Intent intent = new Intent(SixthHomeworkMainActivity.this, SixthHomeworkBFragment.class);
                    intent.putExtra("chosenUnit", "stalker");
                    startActivity(intent);
                }
                else {
                    fragmentB.updateContent("stalker");
                }
            }
        });

        infestorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SixthHomeworkBFragment fragmentB = (SixthHomeworkBFragment) getFragmentManager().findFragmentById(R.id.fragment_6_b);
                if (fragmentB == null) {
                    Intent intent = new Intent(SixthHomeworkMainActivity.this, SixthHomeworkBFragment.class);
                    intent.putExtra("chosenUnit", "infestor");
                    startActivity(intent);
                }
                else {
                    fragmentB.updateContent("infestor");
                }
            }
        });
    }
}
