package com.example.ratul.cprogrammingtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ProgramsActivity extends AppCompatActivity {

    String[] programs = {
            "1. Hello world",
            "2. Print an integer",
            "3. Addition of two integers",
            "4. Print float number",
            "5. Type casting example",
            "6. How to take a user input",
            "7. Get a character input and output it",
            "8. If or else condition",
            "9. Find remainder",
            "10. Check equal or not",
            "11. Example of a for-loop",
            "12. Example of a while-loop",
            "13. Use of break and continue keywords",
            "14. Example of nested loop",
            "15. Find GCD",
            "16. Example of an array",
            "17. Copy the elements from one array to another in reverse",
            "18. Demonstration of a function"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);

        getSupportActionBar().setTitle("Programs");

        ListView listView = (ListView)findViewById(R.id.programListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,programs);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent program_to_pro1 = new Intent(ProgramsActivity.this, program_1.class);
                        startActivity(program_to_pro1);
                        break;
                    case 1:
                        Intent program_to_pro2 = new Intent(ProgramsActivity.this, program_2.class);
                        startActivity(program_to_pro2);
                        break;
                    case 2:
                        Intent program_to_pro3 = new Intent(ProgramsActivity.this, program_3.class);
                        startActivity(program_to_pro3);
                        break;
                    case 3:
                        Intent program_to_pro4 = new Intent(ProgramsActivity.this, program_4.class);
                        startActivity(program_to_pro4);
                        break;
                    case 4:
                        Intent program_to_pro5 = new Intent(ProgramsActivity.this, program_5.class);
                        startActivity(program_to_pro5);
                        break;
                    case 5:
                        Intent program_to_pro6 = new Intent(ProgramsActivity.this, program_6.class);
                        startActivity(program_to_pro6);
                        break;
                    case 6:
                        Intent program_to_pro7 = new Intent(ProgramsActivity.this, program_7.class);
                        startActivity(program_to_pro7);
                        break;
                    case 7:
                        Intent program_to_pro8 = new Intent(ProgramsActivity.this, program_8.class);
                        startActivity(program_to_pro8);
                        break;
                    case 8:
                        Intent program_to_pro9 = new Intent(ProgramsActivity.this, program_9.class);
                        startActivity(program_to_pro9);
                        break;
                    case 9:
                        Intent program_to_pro10 = new Intent(ProgramsActivity.this, program_10.class);
                        startActivity(program_to_pro10);
                        break;
                    case 10:
                        Intent program_to_pro11 = new Intent(ProgramsActivity.this, program_11.class);
                        startActivity(program_to_pro11);
                        break;
                    case 11:
                        Intent program_to_pro12 = new Intent(ProgramsActivity.this, program_12.class);
                        startActivity(program_to_pro12);
                        break;
                    case 12:
                        Intent program_to_pro13 = new Intent(ProgramsActivity.this, program_13.class);
                        startActivity(program_to_pro13);
                        break;
                    case 13:
                        Intent program_to_pro14 = new Intent(ProgramsActivity.this, program_14.class);
                        startActivity(program_to_pro14);
                        break;
                    case 14:
                        Intent program_to_pro15 = new Intent(ProgramsActivity.this, program_15.class);
                        startActivity(program_to_pro15);
                        break;
                    case 15:
                        Intent program_to_pro16 = new Intent(ProgramsActivity.this, program_16.class);
                        startActivity(program_to_pro16);
                        break;
                    case 16:
                        Intent program_to_pro17 = new Intent(ProgramsActivity.this, program_17.class);
                        startActivity(program_to_pro17);
                        break;
                    case 17:
                        Intent program_to_pro18 = new Intent(ProgramsActivity.this, program_18.class);
                        startActivity(program_to_pro18);
                        break;
                }
            }
        });
    }
}
