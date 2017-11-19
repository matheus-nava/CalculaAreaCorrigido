package com.nava.matheus.calculoarea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.LeadingMarginSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class circuloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circulo_layout);

        Bundle bundle = (Bundle) getIntent().getExtras().get("BP");
        Double raio = bundle.getDouble("raio");

        TextView resultadoCirculo = (TextView) findViewById(R.id.resultadoCirculo);
        resultadoCirculo.setText(""+(3.1415926*(raio*raio)));
    }

    public void calcularNovamente(View view){
        setResult(1);
        finish();
    }
}

