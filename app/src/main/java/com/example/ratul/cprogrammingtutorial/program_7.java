package com.example.ratul.cprogrammingtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class program_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_7);

        getSupportActionBar().setTitle("Get a character input and output it");

        String url = "file:///android_asset/programs/character_input_output_pro_7.html";

        WebView view = (WebView) this.findViewById(R.id.program_7_webView);
        view.loadUrl(url);
        view.getSettings().setBuiltInZoomControls(true);
    }
}
