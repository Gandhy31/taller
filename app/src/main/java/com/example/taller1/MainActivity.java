package com.example.taller1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //variables
    TextView editTextTextPersonName;
    TextView editTextTextPersonName2;
    TextView editTextTextPersonName3;
    TextView editTextDate;
    TextView editTextNumber;
    TextView textView2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        editTextDate = findViewById(R.id.editTextDate);
        editTextNumber = findViewById(R.id.editTextNumber);
        textView2 = findViewById(R.id.textView2);
        button = findViewById(R.id.button);

    }
}