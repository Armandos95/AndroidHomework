package com.rbezliudko.sixthhomework.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.rbezliudko.sixthhomework.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ThirdHomeworkActivity extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button buttonReturn;

    private String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
            "Blackberry", "Ubuntu", "Windows7", "Mac OS X", "Linux", "Ubuntu", "Windows7",
            "Mac OS X", "Linux", "Ubuntu", "Windows7", "Android", "iPhone", "WindowsMobile" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_homework);

        textView1 = (TextView) findViewById(R.id.text_3_1);
        textView2 = (TextView) findViewById(R.id.text_3_2);
        button1 = (Button) findViewById(R.id.button_3_1);
        button2 = (Button) findViewById(R.id.button_3_2);
        button3 = (Button) findViewById(R.id.button_3_3);
        button4 = (Button) findViewById(R.id.button_3_4);
        buttonReturn = (Button) findViewById(R.id.button_return_third);

        createAndShowNumbers();

        button1.setOnClickListener(clickListener);
        button2.setOnClickListener(clickListener);
        button3.setOnClickListener(clickListener);
        button4.setOnClickListener(clickListener);

        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                finish();
            }
        });
    }

    private void createAndShowNumbers() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            list.add(values[i]);
        }

        String strings = TextUtils.join(", ", list);
        textView1.setText(strings);
    }

    private void reverseOrder() {
        ArrayList<String> list = new ArrayList<>();
        for (String str : values){
            list.add(str);
        }

        Collections.reverse(list);

        String strings = TextUtils.join(", ", list);
        textView2.setText(strings);
    }

    private void removeEveryThird() {
        ArrayList<String> list = new ArrayList<>();
        for (String str : values){
            list.add(str);
        }

        ArrayList<String> list2 = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < list.size(); i++){
            counter++;
            if (counter % 3 != 0) list2.add(list.get(i));
        }

        String strings = TextUtils.join(", ", list2);
        textView2.setText(strings);
    }

    private void removeDuplicates() {
        HashSet<String> set = new HashSet<>();
        for (String str : values){
            set.add(str);
        }

        String strings = TextUtils.join(", ", set);
        textView2.setText(strings);
    }

    private void sortValues() {
        ArrayList<String> list = new ArrayList<>();
        for (String str : values){
            list.add(str);
        }

        Collections.sort(list);

        String strings = TextUtils.join(", ", list);
        textView2.setText(strings);
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_3_1:
                    reverseOrder();
                    break;
                case R.id.button_3_2:
                    removeEveryThird();
                    break;
                case R.id.button_3_3:
                    removeDuplicates();
                    break;
                case R.id.button_3_4:
                    sortValues();
                    break;
            }
        }
    };
}