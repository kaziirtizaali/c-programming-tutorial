package com.example.ratul.cprogrammingtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FaqActivity extends AppCompatActivity {

    String[] faq ={"1. Declarations & Initializations",
            "2. Structures and Unions",
            "3. Expressions",
            "4. Null Statements",
            "5. Array and Pointers",
            "6. Memory Allocation",
            "7. Characters and Strings",
            "8. Variables",
            "9. Library Functions",
            "10. Miscellaneous"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        getSupportActionBar().setTitle("Frequently Asked Questions");

        ListView listView = (ListView)findViewById(R.id.faqListView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,faq);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent nextActivity = new Intent(FaqActivity.this,Faq1Activity.class);
                        startActivity(nextActivity);
                        break;
                    case 1:
                        Intent nextActivity2 = new Intent(FaqActivity.this,Faq2Activity.class);
                        startActivity(nextActivity2);
                        break;
                    case 2:
                        Intent nextActivity3 = new Intent(FaqActivity.this,Faq3Activity.class);
                        startActivity(nextActivity3);
                        break;
                    case 3:
                        Intent nextActivity4 = new Intent(FaqActivity.this,Faq4Activity.class);
                        startActivity(nextActivity4);
                        break;
                    case 4:
                        Intent nextActivity5 = new Intent(FaqActivity.this,Faq5Activity.class);
                        startActivity(nextActivity5);
                        break;
                    case 5:
                        Intent nextActivity6 = new Intent(FaqActivity.this,Faq6Activity.class);
                        startActivity(nextActivity6);
                        break;
                    case 6:
                        Intent nextActivity7 = new Intent(FaqActivity.this,Faq7Activity.class);
                        startActivity(nextActivity7);
                        break;
                    case 7:
                        Intent nextActivity8 = new Intent(FaqActivity.this,Faq8Activity.class);
                        startActivity(nextActivity8);
                        break;
                    case 8:
                        Intent nextActivity9 = new Intent(FaqActivity.this,Faq9Activity.class);
                        startActivity(nextActivity9);
                        break;
                    case 9:
                        Intent nextActivity10 = new Intent(FaqActivity.this,Faq10Activity.class);
                        startActivity(nextActivity10);
                        break;

                    default:
                        break;
                }
            }
        });

    }
}
