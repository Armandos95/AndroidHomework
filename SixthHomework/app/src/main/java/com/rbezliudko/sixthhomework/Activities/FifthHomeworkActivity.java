package com.rbezliudko.sixthhomework.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.rbezliudko.sixthhomework.R;

public class FifthHomeworkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_homework);

        Button buttonTwinkle = (Button) findViewById(R.id.button_twinkle);
        Button buttonSpin = (Button) findViewById(R.id.button_spin);
        Button buttonShake = (Button) findViewById(R.id.button_shake);
        Button buttonStretch = (Button) findViewById(R.id.button_stretch);

        final Animation twinkle = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.twinkle);
        final Animation shake = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
        final Animation spin = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.spin);
        final Animation stretch = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.stretch);

        buttonTwinkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(twinkle);
            }
        });

        buttonSpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(spin);
            }
        });

        buttonShake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(shake);
            }
        });

        buttonStretch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(stretch);
            }
        });
    }
}
