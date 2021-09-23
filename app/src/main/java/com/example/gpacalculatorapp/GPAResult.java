package com.example.gpacalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GPAResult extends AppCompatActivity {
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gparesult);

        result = findViewById(R.id.result);
        Intent receiverIntent = getIntent();
        double total = receiverIntent.getDoubleExtra("result", 0.0);
        result.setText("" + receiverIntent.getDoubleExtra("result",0.0));


    }
}