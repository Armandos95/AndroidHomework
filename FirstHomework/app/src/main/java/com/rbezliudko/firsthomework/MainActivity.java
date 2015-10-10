package com.rbezliudko.firsthomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText parameterA;
    private EditText parameterB;
    private EditText parameterC;
    private Button button;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parameterA = (EditText) findViewById(R.id.edit_text_1);
        parameterB = (EditText) findViewById(R.id.edit_text_2);
        parameterC = (EditText) findViewById(R.id.edit_text_3);
        button = (Button) findViewById(R.id.button);
        result = (TextView) findViewById(R.id.text_result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(makeResult());
            }
        });
    }

    private String makeResult()
    {
        int a, b, c;
        a = Integer.parseInt(parameterA.getText().toString());
        b = Integer.parseInt(parameterB.getText().toString());
        c = Integer.parseInt(parameterC.getText().toString());
        int discriminant = b * b - 4 * a * c;
        String str = "Discriminant: " + discriminant + "\n";
        if (discriminant < 0)
        {
            str += "There are no real roots.";
            return str;
        }
        else if (discriminant == 0)
        {
            int x = -1 * b / (2 * a);
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
