package com.rbezliudko.secondhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class FirstHomeworkActivity extends AppCompatActivity {

    private EditText parameterA;
    private EditText parameterB;
    private EditText parameterC;
    private CheckBox checkBoxComplex;
    private Button buttonResult;
    private TextView textResult;
    private Button buttonReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_homework);

        parameterA = (EditText) findViewById(R.id.edit_text_1_1);
        parameterB = (EditText) findViewById(R.id.edit_text_1_2);
        parameterC = (EditText) findViewById(R.id.edit_text_1_3);
        checkBoxComplex = (CheckBox) findViewById(R.id.checkbox_complex);
        if (checkBoxComplex.isChecked()) checkBoxComplex.setChecked(false);
        buttonResult = (Button) findViewById(R.id.button_result);
        textResult = (TextView) findViewById(R.id.text_result);
        buttonReturn = (Button) findViewById(R.id.button_return_first);

        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    textResult.setText(makeResult());
                } catch (NumberFormatException ex) {
                    textResult.setText(R.string.error_message);
                }
            }
        });

        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                finish();
            }
        });
    }

    private String makeResult()
    {
        double a, b, c;
        a = Double.parseDouble(parameterA.getText().toString());
        b = Double.parseDouble(parameterB.getText().toString());
        c = Double.parseDouble(parameterC.getText().toString());
        double discriminant = b * b - 4 * a * c;
        String str = "Discriminant: " + discriminant + "\n";
        if (discriminant < 0)
        {
            if (checkBoxComplex.isChecked())
            {
                discriminant *= -1;
                double realPart = -1 * b / (2 * a);
                double complexPart = Math.sqrt(discriminant) / (2 * a);
                str += "x1 = " + realPart + " + " + complexPart + "i \n";
                str += "x2 = " + realPart + " - " + complexPart + "i";
                return str;
            }
            else
            {
                str += "There are no real roots.";
                return str;
            }
        }
        else if (discriminant == 0)
        {
            double x = -1 * b / (2 * a);
            str += "x = " + x;
            return str;
        }
        else
        {
            double x1 = (-1 * b + Math.sqrt(discriminant)) / (2 * a);
            str += "x1 = " + x1 + "\n";
            double x2 = (-1 * b - Math.sqrt(discriminant)) / (2 * a);
            str += "x2 = " + x2;
            return str;
        }
    }
}
