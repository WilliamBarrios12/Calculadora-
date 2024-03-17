package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtVal1, edtVal2;
    Button btnSumar;
    TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtVal1 = findViewById(R.id.edtVal1);
        edtVal2 = findViewById(R.id.edtVal2);
        btnSumar = findViewById(R.id.btnSumar);
        txtResultado = findViewById(R.id.txtResultado);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String caja1 = edtVal1.getText().toString();
                String caja2 = edtVal2.getText().toString();

                if (!caja1.equals("") && !caja2.equals("")) {
                    int resultado = Integer.parseInt(caja1) + Integer.parseInt(caja2);
                    txtResultado.setText(String.valueOf(resultado));
                }else{
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}