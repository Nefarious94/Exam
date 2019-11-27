package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Calculadora c = new Calculadora();
ImageButton Suma, Resta, Mult, Div;
Button M1, M2, M3, M4;
EditText Num1, Num2;
TextView Result;
RadioButton Par, Inpar;
double valor_m = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Suma = findViewById(R.id.Suma);
        Resta = findViewById(R.id.Resta);
        Mult = findViewById(R.id.Mult);
        Div = findViewById(R.id.Div);

        M1 = findViewById(R.id.M1);
        M2 = findViewById(R.id.M2);
        M3 = findViewById(R.id.M3);
        M4 = findViewById(R.id.M4);
        M1.setText("MC");
        M2.setText("MR");
        M3.setText("M-");
        M4.setText("M+");

        Num1 = findViewById(R.id.Number1);
        Num2 = findViewById(R.id.Number2);
        Num1.setText("0");
        Num2.setText("0");

        Result = findViewById(R.id.Result);
        Result.setText("0");

        Par = findViewById(R.id.Par);
        Inpar = findViewById(R.id.Inpar);
        Par.setEnabled(false);
        Inpar.setEnabled(false);

        Suma.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
               double n1, n2, res;
               n1 = Double.parseDouble(Num1.getText().toString());
               n2 = Double.parseDouble(Num2.getText().toString());
               res = c.suma(n1, n2);
               if (res%2 == 0){
                   Par.setChecked(true);
                   Inpar.setChecked(false);
               }else{
                   Par.setChecked(false);
                   Inpar.setChecked(true);
               }
               Result.setText(String.valueOf(res));
            }
        });

        Resta.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                double n1, n2, res;
                n1 = Double.parseDouble(Num1.getText().toString());
                n2 = Double.parseDouble(Num2.getText().toString());
                res = c.resta(n1, n2);
                if (res%2 == 0){
                    Par.setChecked(true);
                    Inpar.setChecked(false);
                }else{
                    Par.setChecked(false);
                    Inpar.setChecked(true);
                }
                Result.setText(String.valueOf(res));
            }
        });

        Mult.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                double n1, n2, res;
                n1 = Double.parseDouble(Num1.getText().toString());
                n2 = Double.parseDouble(Num2.getText().toString());
                res = c.mult(n1, n2);
                if (res%2 == 0){
                    Par.setChecked(true);
                    Inpar.setChecked(false);
                }else{
                    Par.setChecked(false);
                    Inpar.setChecked(true);
                }
                Result.setText(String.valueOf(res));
            }
        });

        Div.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                double n1, n2, res;
                n1 = Double.parseDouble(Num1.getText().toString());
                n2 = Double.parseDouble(Num2.getText().toString());
                res = c.div(n1, n2);
                if (res%2 == 0){
                    Par.setChecked(true);
                    Inpar.setChecked(false);
                }else{
                    Par.setChecked(false);
                    Inpar.setChecked(true);
                }
                Result.setText(String.valueOf(res));
            }
        });

        M1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                valor_m = 0;
            }
        });

        M2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Num1.setText(String.valueOf(valor_m));
            }
        });

        M3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                double n;
                n = Double.parseDouble(Result.getText().toString());
                valor_m = valor_m - n;
            }
        });

        M4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                double n1, n2, res;
                double n;
                n = Double.parseDouble(Result.getText().toString());
                valor_m = valor_m + n;
            }
        });
    }
}
