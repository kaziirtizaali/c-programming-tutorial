package com.example.ratul.cprogrammingtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Faq2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq2);

        getSupportActionBar().setTitle("FAQ");

        String url = "file:///android_asset/faqs/faq2.html";
        WebView view = (WebView)this.findViewById(R.id.webView);
        view.loadUrl(url);
        view.getSettings().setBuiltInZoomControls(true);
    }
}