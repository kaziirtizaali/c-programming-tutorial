package com.example.ratul.cprogrammingtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ListAdapter;

public class QuestionsActivity extends AppCompatActivity {

    private ListView mListView1, mListView2, mListView3;

    private String[] data1 = {"1. List out fundamental data types in C.",
            "2. Give any 2 differences between while statement and a Do- while statement in C?",
            "3. What is an array? Define an array to store marks of 30 students in 3 subjects.",
            "4. What is Variable declaration and Variable initialization?",
            "5. What are preprocessor directives?",
            "6. Define Array.",
            "7. Define Function",
            "8. What are bitwise operators available in C?",
            "9. Give any 2 two differences between Structures & Union.",
            "10. What does a storage class mean? Mention different storage classes available in C.",
            "11. What is recursion? What are its advantages?",
            "12. Mention different operators used in C with examples",
            "13. Give any two differences between call by value and call by reference?",
            "14. How do you pass parameters to main() function?",
            "15. What is pointer? give its declaration"};

    private String[] data2 = {"1. What are keywords? List the rules for naming a variable in C?",
            "2. Write an algorithm to find the sum of numbers from 1 to N.",
            "3. Explain the use of bitwise operators in C with examples.",
            "4. Write a function to exchange the values of two variables, say x and y.",
            "5. Demonstrate the usage of a switch statement with an example.",
            "6. With an example getch() and putchar() functions.",
            "7. Distinguish between while and do while",
            "8. Write a program to check whether the given number is prime or not. Print the suitable messages.",
            "9. Using array declaration for Fibonacci series, write a c program to generate first n terms.",
            "10. write a c program to find largest number among 3 numbers."};

    private String[] data3 = {"1. Write a program to multiply 2 Matrices.",
            "2. Write a program using pointers to read an array of integers and print its elements in reverse order.",
            "3. Explain the different kinds of loops available in C with examples.",
            "4. Explain while loop structure with an example write the flow chart also",
            "5. Write a c program to simulate the basic operations of a calculator",
            "6. Write a c program to solve a quadratic equation using switch statement.",
            "7. Write a program to read ten integers from the keyboards and print the sum of even and odd numbers.",
            "8. Write a program to convert a given decimal numbers into its binary equivalent.",
            "9. Give any five string manipulation library functions, with an example each."};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        getSupportActionBar().setTitle("University Exam Questions");

        mListView1 = (ListView)findViewById(R.id.listView1);
        mListView2 = (ListView)findViewById(R.id.listView2);
        mListView3 = (ListView)findViewById(R.id.listView3);

        mListView1.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data1));
        mListView2.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data2));
        mListView3.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data3));

        ListUtils.setDynamicHeight(mListView1);
        ListUtils.setDynamicHeight(mListView2);
        ListUtils.setDynamicHeight(mListView3);


    }

    public static class ListUtils {
        public static void setDynamicHeight(ListView mListView) {
            ListAdapter mListAdapter = mListView.getAdapter();
            if (mListAdapter == null) {
                // when adapter is null
                return;
            }
            int height = 0;
            int desiredWidth = MeasureSpec.makeMeasureSpec(mListView.getWidth(), MeasureSpec.UNSPECIFIED);
            for (int i = 0; i < mListAdapter.getCount(); i++) {
                View listItem = mListAdapter.getView(i, null, mListView);
                listItem.measure(desiredWidth, MeasureSpec.UNSPECIFIED);
                height += listItem.getMeasuredHeight();
            }
            ViewGroup.LayoutParams params = mListView.getLayoutParams();
            params.height = height + (mListView.getDividerHeight() * (mListAdapter.getCount() - 1));
            mListView.setLayoutParams(params);
            mListView.requestLayout();
        }
    }
}
