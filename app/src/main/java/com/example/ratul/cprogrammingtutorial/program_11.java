package com.example.ratul.cprogrammingtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class program_11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_11);

        getSupportActionBar().setTitle("Example of a for-loop");

        String url = "file:///android_asset/programs/for_loop_pro_11.html";
        WebView view = (WebView) this.findViewById(R.id.program_11_webView);
        view.loadUrl(url);
        view.getSettings().setBuiltInZoomControls(true);
    }
}
