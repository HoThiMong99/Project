package com.example.duoihinhbatchu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   Button btnplaynow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnplaynow =findViewById(R.id.btnplaynow);
        btnplaynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondScreen();
            }
        });
    }
    private void openSecondScreen(){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
