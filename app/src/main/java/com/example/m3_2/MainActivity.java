package com.example.m3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.main_button);
        counter = 0;
    }
    public void buttonClick(View view) {
        // increment counter by 1 for every button click
        counter++;
        //change the button content to "This is a click number:<counter>"
        btn.setText("This is a click number:" + counter);
    }
}