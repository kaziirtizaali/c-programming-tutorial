package com.example.ratul.cprogrammingtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TutorialActivity extends AppCompatActivity {

    String[] chapter ={"1. Introduction",
            "2. An example of C program",
            "3. Variables & Operators",
            "4. Input & Output",
            "5. Flow of Control",
            "6. Functions",
            "7. Scope, Blocks & Variables",
            "8. Arrays, Pointer & String",
            "9. Structure & Union",
            "10. Files"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        getSupportActionBar().setTitle("Tutorial");

        ListView listView = (ListView)findViewById(R.id.tutorialListView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,chapter);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent nextActivity = new Intent(TutorialActivity.this,Chapter1Activity.class);
                        startActivity(nextActivity);
                        break;
                    case 1:
                        Intent nextActivity2 = new Intent(TutorialActivity.this,Chapter2Activity.class);
                        startActivity(nextActivity2);
                        break;
                    case 2:
                        Intent nextActivity3 = new Intent(TutorialActivity.this,Chapter3Activity.class);
                        startActivity(nextActivity3);
                        break;
                    case 3:
                        Intent nextActivity4 = new Intent(TutorialActivity.this,Chapter4Activity.class);
                        startActivity(nextActivity4);
                        break;
                    case 4:
                        Intent nextActivity5 = new Intent(TutorialActivity.this,Chapter5Activity.class);
                        startActivity(nextActivity5);
                        break;
                    case 5:
                        Intent nextActivity6 = new Intent(TutorialActivity.this,Chapter6Activity.class);
                        startActivity(nextActivity6);
                        break;
                    case 6:
                        Intent nextActivity7 = new Intent(TutorialActivity.this,Chapter7Activity.class);
                        startActivity(nextActivity7);
                        break;
                    case 7:
                        Intent nextActivity8 = new Intent(TutorialActivity.this,Chapter8Activity.class);
                        startActivity(nextActivity8);
                        break;
                    case 8:
                        Intent nextActivity9 = new Intent(TutorialActivity.this,Chapter9Activity.class);
                        startActivity(nextActivity9);
                        break;
                    case 9:
                        Intent nextActivity10 = new Intent(TutorialActivity.this,Chapter10Activity.class);
                        startActivity(nextActivity10);
                        break;

                    default:
                        break;
                }
            }
        });


    }
}
