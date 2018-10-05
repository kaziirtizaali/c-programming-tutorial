package com.example.ratul.cprogrammingtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class program_17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_17);

        getSupportActionBar().setTitle("Copy the elements from one array to another in reverse");

        String url = "file:///android_asset/programs/copy_array_reverse_pro_17.html";
        WebView view = (WebView) this.findViewById(R.id.program_17_webView);
        view.loadUrl(url);
        view.getSettings().setBuiltInZoomControls(true);
    }
}
