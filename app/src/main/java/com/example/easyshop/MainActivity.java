package com.example.easyshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void americanas(View view){
        Intent intent = new Intent(this, TelaWeb.class);
        intent.putExtra("chave", "https://www.americanas.com.br");
        startActivity(intent);
    }

    public void mercadoLivre(View v){
        Intent intent = new Intent(this, TelaWeb.class);
        intent.putExtra("chave", "https://www.mercadolivre.com.br");
        startActivity(intent);
    }

    public void buscape(View v){
        Intent intent = new Intent(this, TelaWeb.class);
        intent.putExtra("chave", "https://www.buscape.com.br");
        startActivity(intent);
    }

    public void ebay(View v){
        Intent intent = new Intent(this, TelaWeb.class);
        intent.putExtra("chave", "https://www.ebay.com");
        startActivity(intent);
    }

    public void magalu(View v){
        Intent intent = new Intent(this, TelaWeb.class);
        intent.putExtra("chave", "https://www.magazineluiza.com.br");
        startActivity(intent);
    }

    public void netshoes(View v){
        Intent intent = new Intent(this, TelaWeb.class);
        intent.putExtra("chave", "https://www.netshoes.com.br");
        startActivity(intent);
    }

    public void submarino(View v){
        Intent intent = new Intent(this, TelaWeb.class);
        intent.putExtra("chave", "https://www.submarino.com.br");
        startActivity(intent);
    }

    public void webmotors(View v){
        Intent intent = new Intent(this, TelaWeb.class);
        intent.putExtra("chave", "https://www.webmotors.com.br");
        startActivity(intent);
    }

    public void sobre(View v){
        Intent intent = new Intent(this, TelaSobre.class);
        startActivity(intent);
    }
}
