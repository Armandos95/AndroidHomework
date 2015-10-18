package com.rbezliudko.secondhomework;

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

    private static long[] arrayFibonacciNumbers = new long[93];
    private static long[] arrayFactorialNumbers = new long[21];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_homework);

        editFibonacciNumber = (EditText) findViewById(R.id.edit_text_2_1);
        editFactorialNumber = (EditText) findViewById(R.id.edit_text_2_2);
        buttonCount = (Button) findViewById(R.id.button_count);
        textCounted = (TextView) findViewById(R.id.text_counted);
        buttonReturn = (Button) findViewById(R.id.button_return_second);

        countAllFibonacci(arrayFibonacciNumbers);
        countAllFactorial(arrayFactorialNumbers);

        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textCounted.setText(setCountString().toString());
            }
        });

        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                finish();
            }
        });
    }

    public static void countAllFibonacci(long[] fibonaccis){
        fibonaccis[0] = 0;
        fibonaccis[1] = 1;
        for (int i = 2; i < 92; i++){
            fibonaccis[i] = fibonaccis[i - 1] + fibonaccis[i - 2];
        }
    }

    public static void countAllFactorial(long[] factorials){
        factorials[0] = 1;
        for (int i = 1; i < 20; i++){
            long m = 1;
            for (int j = 1; j <= i; j++){
                m *= j;
            }
            factorials[i] = m;
        }
    }

    public static long getFibonacciNumber(int index){
        countAllFibonacci(arrayFibonacciNumbers);
        return arrayFibonacciNumbers[index];
    }

    public static long getFactorial(int index){
        countAllFactorial(arrayFactorialNumbers);
        return arrayFactorialNumbers[index];
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
