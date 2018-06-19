package com.fenglingtime.www.helloandroid.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.fenglingtime.www.helloandroid.R;

public class GridRecyclerActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recycler);
        recyclerView = findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new GridLayoutManager(GridRecyclerActivity.this,3));
        recyclerView.setAdapter(new GridAdapter(GridRecyclerActivity.this, new GridAdapter.OnItemClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(GridRecyclerActivity.this,"点击了"+position,Toast.LENGTH_SHORT).show();
            }
        }));
    }
}
