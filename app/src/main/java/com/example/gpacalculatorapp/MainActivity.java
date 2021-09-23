package com.example.gpacalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText course1,course2,course3,course4,course5;
    TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        course1 = findViewById(R.id.gpa1);
        course2 = findViewById(R.id.gpa2);
        course3 = findViewById(R.id.gpa3);
        course4 = findViewById(R.id.gpa4);
        course5 = findViewById(R.id.gpa5);
        total = findViewById(R.id.check);

    }

    public void clearScreen(View view) {

        course1.setText("");
        course2.setText("");
        course3.setText("");
        course4.setText("");
        course5.setText("");
    }

    public void computeGPA(View view) {

        double totalGpa = (Double.parseDouble(course1.getText().toString()) +
                Double.parseDouble(course2.getText().toString()) +
                Double.parseDouble(course3.getText().toString()) +
                Double.parseDouble(course4.getText().toString()) +
                Double.parseDouble(course5.getText().toString())) / 5;
        total.setText(String.valueOf(totalGpa));

        Intent intent = new Intent(this,GPAResult.class);
        intent.putExtra("result",totalGpa);
        startActivity(intent);


    }
}