package com.example.apmov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivityMain extends AppCompatActivity {
private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_main);
        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());

        if (getIntent().getStringExtra("boton").equals("consejos")){

            webView.loadUrl("https://www.autocosmos.com.ar/");
        } else if (getIntent().getStringExtra("boton").equals("comprar")){
            webView.loadUrl("https://www.mercadolibre.com.ar/vehiculos/#menu=categories");
        } else {
            webView.loadUrl("https://www.autofacil.es/marcas/");
        }
    }
}
