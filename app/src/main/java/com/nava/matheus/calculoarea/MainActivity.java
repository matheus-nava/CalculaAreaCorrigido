package com.nava.matheus.calculoarea;

import android.content.Intent;
import android.icu.text.UnicodeSetSpanner;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CalculaArea(View view) {
        RadioButton circulo = (RadioButton) findViewById(R.id.RBcirculo);
        RadioButton quadrado= (RadioButton) findViewById(R.id.RBquadrado);
        RadioButton triangulo = (RadioButton) findViewById(R.id.RBtriangulo);
        if(circulo.isChecked()){
            Intent i = new Intent(getApplicationContext(), dadoscirculosActivity.class);
            startActivity(i);
        }else if(quadrado.isChecked()){
            Intent i = new Intent(getApplicationContext(), dadosquadradoActivity.class);
            startActivity(i);
        }else if(triangulo.isChecked()){
            Intent i = new Intent(getApplicationContext(), dadostrianguloActivity.class);
            startActivity(i);
        }else{
            Toast.makeText(getApplicationContext(), "Selecione algumas opção!!!", Toast.LENGTH_SHORT).show();
        }
    }
}
