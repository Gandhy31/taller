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
    EditText editTextNumber;
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
        
        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x1, x2, resultado;
                x1 = Float.parseFloat(txt1.getText().toString());
                x2 = Float.parseFloat(txt2.getText().toString());

                resultado = x1+x2;

                txtresultado.setText(""+resultado);

                //deshabilitar
                txt1.setEnabled(false);
                txt2.setEnabled(false);

                btnsuma.setEnabled(false);
                btnresta.setEnabled(false);
                btnproducto.setEnabled(false);
                btndivision.setEnabled(false);
                btnreset.setEnabled(true);            }
        });


    }
}
