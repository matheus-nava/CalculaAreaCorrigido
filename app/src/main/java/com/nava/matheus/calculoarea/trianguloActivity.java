package com.nava.matheus.calculoarea;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Usuário on 01/11/2017.
 */

public class trianguloActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triangulo_layout);

        Bundle bundle = (Bundle) getIntent().getExtras().get("BP");
        Double base = bundle.getDouble("base");
        Double altura = bundle.getDouble("altura");

        TextView resultadoTriangulo = (TextView) findViewById(R.id.ResultadoTriangulo);
        resultadoTriangulo.setText(""+(base*altura)/2);
    }

    public void calcularNovamente(View view){
        setResult(1);
        finish();
    }
}
