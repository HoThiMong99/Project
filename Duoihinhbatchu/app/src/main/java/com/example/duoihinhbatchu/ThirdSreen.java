package com.example.duoihinhbatchu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdSreen extends AppCompatActivity {
    Button btn1,btn3, btn4,btn5,btndelete,btnfinish;
    TextView text_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_sreen);
        text_result = findViewById(R.id.text_result2);
        btndelete = findViewById(R.id.btnDelete);
        btnfinish = findViewById(R.id.btnFinish);
        btn1 = findViewById(R.id.btnword1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(text_result.getText().toString() + btn1.getText().toString());
            }
        });
        btn3 = findViewById(R.id.btnword3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(text_result.getText().toString() + btn3.getText().toString());
            }
        });
        btn4 = findViewById(R.id.btnword4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(text_result.getText().toString() + btn4.getText().toString());
            }
        });
        btn5 = findViewById(R.id.btnword5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(text_result.getText().toString() + btn5.getText().toString());
            }
        });
        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDelete();
            }
        });
        btnfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer();
            }
        });
    }
    public void setDelete(){
        text_result.setText("");
    }
    public void checkAnswer(){
        String answer= "OBAMA";
        String str  = text_result.getText().toString();
        if (str.equals(answer)){
            Toast.makeText(this, "chính xác", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(ThirdSreen.this, MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "sai", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(ThirdSreen.this, ThirdSreen.class);
            startActivity(intent);
        }

    }
}
