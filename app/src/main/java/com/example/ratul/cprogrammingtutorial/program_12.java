package com.example.ratul.cprogrammingtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class program_12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_12);

        getSupportActionBar().setTitle("Example of a while-loop");

        String url = "file:///android_asset/programs/while_loop_pro_12.html";
        WebView view = (WebView) this.findViewById(R.id.program_12_webView);
        view.loadUrl(url);
        view.getSettings().setBuiltInZoomControls(true);
    }
}
