package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class OperacionesBasicas2 extends AppCompatActivity {

    EditText et1,et2;
    TextView tv1;
    RadioButton rb1,rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones_basicas2);

        et1 = (EditText)findViewById(R.id.txt_valor1);
        et2 = (EditText)findViewById(R.id.txt_valor2);
        tv1 = (TextView) findViewById(R.id.txt_Resultado);
        rb1 = (RadioButton)findViewById(R.id.rb_suma);
        rb1 = (RadioButton)findViewById(R.id.rb_resta);
    }

    public void Calcular(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1);
        int valor2_int = Integer.parseInt(valor2);

        if(rb1.isChecked()== true){
            int suma = valor1_int + valor2_int;
            String txtresultado = String.valueOf(suma);
            tv1.setText(txtresultado);
        }
        else if(rb2.isChecked()== true){
            int resta = valor1_int - valor2_int;
            String txtresultado = String.valueOf(resta);
            tv1.setText(txtresultado);
        }
    }

}
