package com.example.ratul.cprogrammingtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class program_14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_14);

        getSupportActionBar().setTitle("Example of nested loop");

        String url = "file:///android_asset/programs/nested_loop_pro_14.html";
        WebView view = (WebView) this.findViewById(R.id.program_14_webView);
        view.loadUrl(url);
        view.getSettings().setBuiltInZoomControls(true);
    }
}
