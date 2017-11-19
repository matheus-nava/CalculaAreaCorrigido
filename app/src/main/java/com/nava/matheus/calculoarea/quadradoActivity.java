package com.nava.matheus.calculoarea;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Usuário on 01/11/2017.
 */

public class quadradoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quadrado_layout);

        Bundle bundle = (Bundle) getIntent().getExtras().get("BP");
        Double base = bundle.getDouble("base");
        Double altura = bundle.getDouble("altura");

        TextView resultadoQuadrado = (TextView) findViewById(R.id.ResultadoQuadrado);
        resultadoQuadrado.setText(""+base*altura);
    }

    public void calcularNovamente(View view){
        setResult(1);
        finish();
    }
}
