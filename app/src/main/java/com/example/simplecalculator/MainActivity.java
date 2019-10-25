package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button sum, mutilple, average;
    EditText edt_toan, edt_van;
    TextView tv_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum = findViewById(R.id.btn_sum);
        mutilple = findViewById(R.id.btn_mutil);
        average = findViewById(R.id.btn_avg);
        edt_toan = findViewById(R.id.edt_toan);
        edt_van = findViewById(R.id.edt_van);
        tv_result = findViewById(R.id.tv_result);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumScore();
            }
        });
        mutilple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mutilScore();
            }
        });
        average.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                averageScore();
            }
        });

    }

    void sumScore(){
        int toan = Integer.parseInt(edt_toan.getText().toString());
        int van = Integer.parseInt(edt_van.getText().toString());
        int sum = toan + van;
        tv_result.setText("Ket qua la : "+sum);
    }

    void mutilScore(){
        int toan = Integer.parseInt(edt_toan.getText().toString());
        int van = Integer.parseInt(edt_van.getText().toString());
        int mutilple = toan * van;
        tv_result.setText("Ket qua la : "+mutilple);
    }

    void averageScore(){
        int toan = Integer.parseInt(edt_toan.getText().toString());
        int van = Integer.parseInt(edt_van.getText().toString());
        float average = (float)(toan + van)/2;
        tv_result.setText("Ket qua la : "+average);
    }
}
