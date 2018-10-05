package com.example.ratul.cprogrammingtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);


        getSupportActionBar().setTitle("About C programming");

        String url = "file:///android_asset/about_us.html";
        WebView view = (WebView)this.findViewById(R.id.aboutuswebView);
        view.loadUrl(url);

        view.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return true;
            }
        });
        view.setLongClickable(false);
        view.setHapticFeedbackEnabled(false);

    }



}