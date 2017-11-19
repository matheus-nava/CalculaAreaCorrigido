package com.nava.matheus.calculoarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class dadoscirculosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dadoscirculo_layout);
    }

    public void CalculaCirculo(View view){
        EditText raio = (EditText) findViewById(R.id.raio);
        if(raio.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Dados Insuficientes", Toast.LENGTH_SHORT).show();
        }else{
            Bundle backpack = new Bundle();
            backpack.putDouble("raio", Double.parseDouble(raio.getText().toString()));
            Intent i = new Intent(getApplicationContext(), circuloActivity.class);
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
