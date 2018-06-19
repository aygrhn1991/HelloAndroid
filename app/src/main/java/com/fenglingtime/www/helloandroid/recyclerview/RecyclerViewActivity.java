package com.fenglingtime.www.helloandroid.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fenglingtime.www.helloandroid.R;

public class RecyclerViewActivity extends AppCompatActivity {

    private Button mbtn1;
    private Button mbtn2;
    private Button mbtn3;
    private Button mbtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mbtn1 = findViewById(R.id.button1);
        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecyclerViewActivity.this, LinearRecyclerActivity.class);
                startActivity(intent);
            }
        });
        mbtn2 = findViewById(R.id.button2);
        mbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecyclerViewActivity.this, HorRecyclerActivity.class);
                startActivity(intent);
            }
        });
        mbtn3 = findViewById(R.id.button3);
        mbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecyclerViewActivity.this, GridRecyclerActivity.class);
                startActivity(intent);
            }
        });
        mbtn4 = findViewById(R.id.button4);
        mbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecyclerViewActivity.this, PuRecyclerActivity.class);
                startActivity(intent);
            }
        });
    }
}
