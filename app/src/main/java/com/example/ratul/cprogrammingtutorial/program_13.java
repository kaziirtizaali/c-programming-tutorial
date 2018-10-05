package com.example.ratul.cprogrammingtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class program_13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_13);

        getSupportActionBar().setTitle("Use of break and continue keywords");

        String url = "file:///android_asset/programs/break_continue_pro_13.html";
        WebView view = (WebView) this.findViewById(R.id.program_13_webView);
        view.loadUrl(url);
        view.getSettings().setBuiltInZoomControls(true);
    }
}
