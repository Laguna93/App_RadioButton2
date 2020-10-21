package com.example.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    RadioButton rd1;
    RadioButton rd2;
    TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        rd1 = (RadioButton)findViewById(R.id.rdb_sumar);
        rd2 = (RadioButton)findViewById(R.id.rdb_restar);
        txv = (TextView)findViewById(R.id.txt_resultado);
    }

    public void calcular(View view) {
        String num1 = et1.getText().toString(), num2 = et2.getText().toString();


        //Comprobamos si algun esta vacio para mostrar una alerta
        if (num1.isEmpty() && num2.isEmpty() | num1.isEmpty() | num2.isEmpty()) {
            Toast.makeText(this, "Escribe los dos valores", Toast.LENGTH_LONG).show();
        } else {
            int n1 = Integer.parseInt(num1), n2 = Integer.parseInt(num2);
            String resultado;

            if(rd1.isChecked()) {
                int suma = sumar(n1, n2);
                txv.setText(String.valueOf(suma));
            }
            else if(rd2.isChecked()) {
                int resta = restar(n1, n2);
                txv.setText(String.valueOf(resta));
            } else {
                Toast.makeText(this, "Tienes que seleccionar una opcion", Toast.LENGTH_LONG).show();
            }

        }
    }

    public int sumar(int op1, int op2) {
        return op1 + op2;
    }

    public int restar(int op1, int op2) {

        if(op1>op2); {
            return op1 - op2;
        }
    }
}