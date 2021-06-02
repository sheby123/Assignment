package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private EditText num1,num2;
        private TextView result;
        private Button add,sub,div,mult,modl,pwr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.editTextTextPersonName);
        num2 = (EditText)findViewById(R.id.editTextTextPersonName2);
        result = (TextView)findViewById(R.id.textView);
        add =(Button)findViewById(R.id.button);
        sub =(Button)findViewById(R.id.button2);
        div =(Button)findViewById(R.id.button3);
        mult =(Button)findViewById(R.id.button4);
        modl =(Button)findViewById(R.id.button5);
        pwr =(Button)findViewById(R.id.button6);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,c;
                a = Integer.parseInt(num1.getText().toString());
                b = Integer.parseInt(num2.getText().toString());
                c = a + b;
                result.setText(Integer.toString(c));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,c;
                a = Integer.parseInt(num1.getText().toString());
                b = Integer.parseInt(num2.getText().toString());
                c = a - b;
                result.setText(Integer.toString(c));
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a,b,c;
                a = Double.parseDouble(num1.getText().toString());
                b = Double.parseDouble(num2.getText().toString());
                c = a / b;
                result.setText(Double.toString(c));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,c;
                a = Integer.parseInt(num1.getText().toString());
                b = Integer.parseInt(num2.getText().toString());
                c = a * b;
                result.setText(Integer.toString(c));
            }
        });
        modl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,c;
                a = Integer.parseInt(num1.getText().toString());
                b = Integer.parseInt(num2.getText().toString());
                c = a % b;
                result.setText(Integer.toString(c));
            }
        });
        pwr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b;
                double c;
                a = Integer.parseInt(num1.getText().toString());
                b = Integer.parseInt(num2.getText().toString());
                c = Math.pow(a,b);
                result.setText(Double.toString(c));
            }
        });

    }
}