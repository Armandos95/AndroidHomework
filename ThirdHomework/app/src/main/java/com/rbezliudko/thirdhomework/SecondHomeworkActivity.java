package com.rbezliudko.thirdhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondHomeworkActivity extends AppCompatActivity {

    private EditText editFibonacciNumber;
    private EditText editFactorialNumber;
    private Button buttonCount;
    private TextView textCounted;
    private Button buttonReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_homework);

        editFibonacciNumber = (EditText) findViewById(R.id.edit_text_2_1);
        editFactorialNumber = (EditText) findViewById(R.id.edit_text_2_2);
        buttonCount = (Button) findViewById(R.id.button_count);
        textCounted = (TextView) findViewById(R.id.text_counted);
        buttonReturn = (Button) findViewById(R.id.button_return_second);

        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textCounted.setText(setCountString());
            }
        });

        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                finish();
            }
        });
    }

    public long getFibonacciNumber(int index){
        if (index == 0)
            return 0;
        else if (index == 1 || index == 2)
            return 1;
        else {
            long prevprev = 0;
            long prev = 1;
            long current = 1;
            for (int i = 3; i <= index; i++)
            {
                prevprev = prev;
                prev = current;
                current = prevprev + prev;
            }
            return current;
        }
    }

    public long getFactorial(int index){
        if (index == 0)
            return 1;
        else {
            long result = 1;
            for (int i = 1; i <= index; i++)
            {
                result *= i;
            }
            return result;
        }
    }

    private String setCountString(){
        String countString = "";
        if (editFibonacciNumber.getText().toString().equals("")) countString += "No index." + "\n";
        else{
            int indexFibonacci = Integer.parseInt(editFibonacciNumber.getText().toString());
            if (indexFibonacci > 91) countString += "Way too big value, try index that is lower than 92." + "\n";
            else countString += "F_" + indexFibonacci + " = " + getFibonacciNumber(indexFibonacci) + "\n";
        }
        if (editFactorialNumber.getText().toString().equals("")) countString += "No index." + "\n";
        else{
            int indexFactorial = Integer.parseInt(editFactorialNumber.getText().toString());
            if (indexFactorial > 19) countString += "Way too big value, try index that is lower than 20." + "\n";
            else countString += "" + indexFactorial + "! = " + getFactorial(indexFactorial) + "\n";
        }
        return countString;
    }
}
