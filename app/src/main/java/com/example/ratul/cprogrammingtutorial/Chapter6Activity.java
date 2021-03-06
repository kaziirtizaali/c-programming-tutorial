package com.example.ratul.cprogrammingtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Chapter6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter6);

        getSupportActionBar().setTitle("Functions");

        String url = "file:///android_asset/tutorials/functions.html";
        WebView view = (WebView)this.findViewById(R.id.webView);
        view.loadUrl(url);
        view.getSettings().setBuiltInZoomControls(true);
    }
}
