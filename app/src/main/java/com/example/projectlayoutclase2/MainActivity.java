package com.example.projectlayoutclase2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edit1, edit2;
    private TextView lblResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText) findViewById(R.id.txtNum1);
        edit2 = (EditText) findViewById(R.id.txtNum2);
        lblResult = (TextView) findViewById(R.id.lblRes);

    }

    public void Sumar(View view){
        int n1 = Integer.parseInt(edit1.getText().toString());
        int n2 = Integer.parseInt(edit2.getText().toString());
        int res = n1 + n2;
        lblResult.setText("La suma es: " + res);
    }

    public void Restar(View view){
        int n1 = Integer.parseInt(edit1.getText().toString());
        int n2 = Integer.parseInt(edit2.getText().toString());
        int res = n1 - n2;
        lblResult.setText("La resta es: " + res);
    }

    public void Multiplicacion(View view){
        int n1 = Integer.parseInt(edit1.getText().toString());
        int n2 = Integer.parseInt(edit2.getText().toString());
        int res = n1 * n2;
        lblResult.setText("La multiplicacion es: " + res);
    }

    public void Division(View view){
        int n1 = Integer.parseInt(edit1.getText().toString());
        int n2 = Integer.parseInt(edit2.getText().toString());
        int res = n1 / n2;
        lblResult.setText("La division es: " + res);
    }
}