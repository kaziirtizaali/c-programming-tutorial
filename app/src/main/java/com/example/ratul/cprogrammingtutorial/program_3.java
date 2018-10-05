package com.example.ratul.cprogrammingtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class program_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_3);

        getSupportActionBar().setTitle("Addition of two integers");

        String url = "file:///android_asset/programs/addition_pro_3.html";
        WebView view = (WebView) this.findViewById(R.id.program_3_webView);
        view.loadUrl(url);
        view.getSettings().setBuiltInZoomControls(true);
    }
}
