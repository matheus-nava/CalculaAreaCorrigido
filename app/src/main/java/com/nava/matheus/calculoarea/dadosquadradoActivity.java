package com.nava.matheus.calculoarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class dadosquadradoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dadosquadrado_layout);
    }

    public void CalculaQuadrado(View view){
        EditText base = (EditText) findViewById(R.id.baseQuadrado);
        EditText altura = (EditText) findViewById(R.id.alturaQuadrado);
        if(base.getText().toString().equals("") || altura.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Dados Insuficientes", Toast.LENGTH_SHORT).show();
        }else{
            Bundle backpack = new Bundle();
            backpack.putDouble("base", Double.parseDouble(base.getText().toString()));
            backpack.putDouble("altura", Double.parseDouble(altura.getText().toString()));
            Intent i = new Intent(getApplicationContext(), quadradoActivity.class);
            i.putExtra("BP", backpack);
            startActivityForResult(i, 1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode != 1) {
            finish();
        }
    }
}
