package com.example.easyshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TelaWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_web);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        String site = b.getString("chave");
        WebView webview = findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl(site);
    }
}
