package com.example.ratul.cprogrammingtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class program_15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_15);

        getSupportActionBar().setTitle("Find GCD");

        String url = "file:///android_asset/programs/GCD_pro_15.html";
        WebView view = (WebView) this.findViewById(R.id.program_15_webView);
        view.loadUrl(url);
        view.getSettings().setBuiltInZoomControls(true);
    }
}
