package com.example.ratul.cprogrammingtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class program_18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_18);

        getSupportActionBar().setTitle("Demonstration of a function");

        String url = "file:///android_asset/programs/function_demo_pro_18.html";
        WebView view = (WebView) this.findViewById(R.id.program_18_webView);
        view.loadUrl(url);
        view.getSettings().setBuiltInZoomControls(true);
    }
}
