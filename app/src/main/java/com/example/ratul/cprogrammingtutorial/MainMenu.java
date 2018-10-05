package com.example.ratul.cprogrammingtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        getSupportActionBar().setTitle("C Programming Tutorial");

        ImageButton tutorial = (ImageButton)findViewById(R.id.tutorialButton);
        tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, TutorialActivity.class);
                startActivity(intent);
            }
        });

        ImageButton programs = (ImageButton)findViewById(R.id.programsButton);
        programs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this,ProgramsActivity.class);
                startActivity(intent);
            }
        });

        ImageButton faq = (ImageButton)findViewById(R.id.faqButton);
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this,FaqActivity.class);
                startActivity(intent);
            }
        });


        ImageButton qustions = (ImageButton)findViewById(R.id.questionButton);
        qustions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this,QuestionsActivity.class);
                startActivity(intent);
            }
        });

        ImageButton quiz = (ImageButton)findViewById(R.id.quizButton);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, Quiz.class);
                startActivity(intent);
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_activity_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.about_us_id:
                Intent nextActivity = new Intent(MainMenu.this,AboutUsActivity.class);
                startActivity(nextActivity);

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
