package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSuma, btnResta, btnMulti, btnDivi, btnLimpiar;
    EditText num1, num2;
    TextView titulo,resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titulo = (TextView)findViewById(R.id.idTitulo);

        num1 = (EditText)findViewById(R.id.idNumero1);
        num2 = (EditText)findViewById(R.id.idNumero2);
        resultado = (TextView)findViewById(R.id.idResultado);

        btnSuma = (Button)findViewById(R.id.idSuma);
        btnResta = (Button)findViewById(R.id.idResta);
        btnMulti = (Button)findViewById(R.id.idMulti);
        btnDivi = (Button)findViewById(R.id.idDivision);

        btnLimpiar = (Button)findViewById(R.id.idLimpiar);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(num1.getText().toString());
                double numero2 = Double.parseDouble(num2.getText().toString());

                double resultado1 = numero1+numero2;

                resultado.setText("Resultado : "+resultado1);
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(num1.getText().toString());
                double numero2 = Double.parseDouble(num2.getText().toString());

                double resultado1 = numero1-numero2;

                resultado.setText("Resultado : "+resultado1);
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(num1.getText().toString());
                double numero2 = Double.parseDouble(num2.getText().toString());

                double resultado1 = numero1*numero2;

                resultado.setText("Resultado : "+resultado1);
            }
        });

        btnDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(num1.getText().toString());
                double numero2 = Double.parseDouble(num2.getText().toString());

                double resultado1 = numero1/numero2;

                resultado.setText("Resultado : "+resultado1);
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1.setText("");
                num1.invalidate();
                num2.setText("");
                num2.invalidate();
                resultado.setText("");
                resultado.invalidate();
            }
        });
    }
}
