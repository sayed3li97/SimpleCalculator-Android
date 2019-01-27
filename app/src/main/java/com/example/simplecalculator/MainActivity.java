package com.example.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declare these Variable in this location to be accessed by all the functions in this class
    private EditText Input1;
    private EditText Input2;
    private TextView Results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Input1 = (EditText) findViewById(R.id.inputText1);
        Input2 = (EditText) findViewById(R.id.inputText2);
        Results = (TextView) findViewById(R.id.results);

    }

    public void plus(View view){
        int input1 = Integer.parseInt(Input1.getText().toString());
        int input2 = Integer.parseInt(Input2.getText().toString());
        String res = String.valueOf(input1 + input2);
        Results.setText(res);
    }

    public void minus(View view){
        int input1 = Integer.parseInt(Input1.getText().toString());
        int input2 = Integer.parseInt(Input2.getText().toString());
        String res = String.valueOf(input1 - input2);
        Results.setText(res);
    }

    public void multi(View view){
        int input1 = Integer.parseInt(Input1.getText().toString());
        int input2 = Integer.parseInt(Input2.getText().toString());
        String res = String.valueOf(input1 * input2);
        Results.setText(res);
    }
}
