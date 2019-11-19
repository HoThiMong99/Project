package com.example.duoihinhbatchu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Dialog;
import android.widget.Toast;
public class SecondActivity extends AppCompatActivity {
    Button btn1,btn3, btn4,btn5,btn6,btn7,btn8,btn9,btn10,btndelete,btnfinish;
    TextView text_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text_result = findViewById(R.id.text_result);
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
        btn6 = findViewById(R.id.btnword6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(text_result.getText().toString() + btn6.getText().toString());
            }
        });
        btn7 = findViewById(R.id.btnword7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(text_result.getText().toString() + btn7.getText().toString());
            }
        });
        btn8 = findViewById(R.id.btnword8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(text_result.getText().toString() + btn8.getText().toString());
            }
        });
        btn9 = findViewById(R.id.btnword9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(text_result.getText().toString() + btn9.getText().toString());
            }
        });
        btn10 = findViewById(R.id.btnword10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(text_result.getText().toString() + btn10.getText().toString());
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
        String answer= "TRANHSONDAU";
        String str  = text_result.getText().toString();
        if (str.equals(answer)){
            Toast.makeText(this, "chính xác", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SecondActivity.this, ThirdSreen.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "sai", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SecondActivity.this, SecondActivity.class);
            startActivity(intent);
        }

    }
}
